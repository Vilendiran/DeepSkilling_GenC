--Drop and recreate the loans table
BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE loans';
EXCEPTION
   WHEN OTHERS THEN
      NULL;
END;
/

--Create the loans table
CREATE TABLE loans (
   loan_id        NUMBER PRIMARY KEY,
   customer_name  VARCHAR2(100),
   due_date       DATE
);

--Insert test data
INSERT INTO loans VALUES (301, 'rohith', SYSDATE + 10);   -- due soon
INSERT INTO loans VALUES (302, 'vijay', SYSDATE + 40);   -- not due soon
INSERT INTO loans VALUES (303, 'Ravi',  SYSDATE + 25);   -- due soon
INSERT INTO loans VALUES (304, 'Divya', SYSDATE - 5);    -- already due
COMMIT;

--PL/SQL block to send reminders
BEGIN
   FOR rec IN (
      SELECT loan_id, customer_name, due_date
      FROM loans
      WHERE due_date BETWEEN SYSDATE AND SYSDATE + 30
   ) LOOP
      DBMS_OUTPUT.PUT_LINE(
         'Reminder: Loan ID ' || rec.loan_id || ' for ' || rec.customer_name ||
         ' is due on ' || TO_CHAR(rec.due_date, 'DD-Mon-YYYY')
      );
   END LOOP;
END;
/

-- Final SELECT to view loans
SELECT * FROM loans;
