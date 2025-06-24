-- Create the table
BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE customers';
EXCEPTION
   WHEN OTHERS THEN
      NULL; 
END;
/

CREATE TABLE customers (
   customer_id     NUMBER PRIMARY KEY,
   name            VARCHAR2(50),
   age             NUMBER,
   interest_rate   NUMBER(5,2)
);

-- sample data
INSERT INTO customers VALUES (101, 'Rahul', 65, 12.5);
INSERT INTO customers VALUES (102, 'Sneha', 45, 10.0);
INSERT INTO customers VALUES (103, 'David', 70, 11.0);
INSERT INTO customers VALUES (104, 'Anu', 59, 9.5);
COMMIT;

-- PL/SQL Block to apply 1% discount to customers above 60
BEGIN
   FOR rec IN (SELECT customer_id, age FROM customers) LOOP
      IF rec.age > 60 THEN
         UPDATE customers
         SET interest_rate = interest_rate * 0.99
         WHERE customer_id = rec.customer_id;

         DBMS_OUTPUT.PUT_LINE('1% discount applied to customer ID: ' || rec.customer_id);
      END IF;
   END LOOP;

   COMMIT;
END;
/

-- View updated table
SELECT customer_id FROM customers;
