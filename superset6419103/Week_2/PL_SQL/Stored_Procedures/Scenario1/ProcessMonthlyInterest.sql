BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE savings_accounts';
EXCEPTION
   WHEN OTHERS THEN
      NULL;
END;
/

create table savings_accounts (
account_id number primary key, holder_name varchar2(20),balance number(10,2));
/

BEGIN
   INSERT INTO savings_accounts VALUES (101, 'bhuvi', 10000);
   INSERT INTO savings_accounts VALUES (102, 'Roy', 5000);
   INSERT INTO savings_accounts VALUES (103, 'wasim', 12000);
   INSERT INTO savings_accounts VALUES (104, 'shami', 9000);
   COMMIT;
END;
/

--stored procedure

create or replace procedure ProcessMonthlyInterest is
cursor acc_cursor is SELECT account_id, balance FROM savings_accounts;

   v_id           savings_accounts.account_id%TYPE;
   v_balance      savings_accounts.balance%TYPE;
   v_new_balance  savings_accounts.balance%TYPE;
BEGIN
   OPEN acc_cursor;
   
   LOOP
      FETCH acc_cursor INTO v_id, v_balance;
      EXIT WHEN acc_cursor%NOTFOUND;


 v_new_balance := v_balance + (v_balance * 0.01);
 
   UPDATE savings_accounts
      SET balance = v_new_balance
      WHERE account_id = v_id;

      DBMS_OUTPUT.PUT_LINE(
         'Account ' || v_id || ' updated to balance: ' || TO_CHAR(v_new_balance, '99999.99')
      );
   END LOOP;
   CLOSE acc_cursor;
   COMMIT;
END;
/
-- Execute the stored procedure
BEGIN
   ProcessMonthlyInterest;
END;
/


select * from savings_accounts;