--Drop and recreate the table (if it already exists)
BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE customers';
EXCEPTION
   WHEN OTHERS THEN
      NULL;  
END;
/

-- Create the customers table
CREATE TABLE customers (
   customer_id   NUMBER PRIMARY KEY,
   name          VARCHAR2(50),
   balance       NUMBER(10,2),
   isVip         CHAR(1) DEFAULT 'N'  -- 'Y' for VIP, 'N' for non-VIP
);

--Insert sample data
INSERT INTO customers VALUES (201, 'dhoni', 9500,  'N');
INSERT INTO customers VALUES (202, 'virat', 15000, 'N');
INSERT INTO customers VALUES (203, 'kohli', 10200,  'N');
INSERT INTO customers VALUES (204, 'rahul', 5000,  'N');
COMMIT;

--PL/SQL block to mark VIP customers
BEGIN
   FOR cust IN (SELECT customer_id, balance FROM customers) LOOP
      IF cust.balance > 10000 THEN
         UPDATE customers
         SET isVip = 'Y'
         WHERE customer_id = cust.customer_id;
         DBMS_OUTPUT.PUT_LINE('Customer ID ' || cust.customer_id || ' marked as VIP.');
      END IF;
   END LOOP;
   COMMIT;
END;
/

-- View final result
SELECT * FROM customers;

