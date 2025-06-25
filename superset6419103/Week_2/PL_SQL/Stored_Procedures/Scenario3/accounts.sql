-- Drop the accounts table if it exists
BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE accounts';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/
-- Create accounts table
CREATE TABLE accounts (
   account_id   NUMBER PRIMARY KEY,
   holder_name  VARCHAR2(100),
   balance      NUMBER(10, 2)
)
/
-- Insert sample accounts
BEGIN
   Insert into accounts values (1, 'kathir', 10000);
   Insert into accounts values (2, 'jeeva', 5000);
   Insert into accounts values (3, 'arjun', 7000);
   COMMIT;
END;
/
-- Create the stored procedure
CREATE OR REPLACE PROCEDURE TransferFunds (
   p_from_account IN NUMBER,
   p_to_account   IN NUMBER,
   p_amount       IN NUMBER
)
IS
 v_balance NUMBER;
BEGIN
   -- Check if source account has sufficient balance
   SELECT balance INTO v_balance
   FROM accounts
   WHERE account_id = p_from_account;
   if v_balance < p_amount THEN
      RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in source account');
   END IF;
   -- Deduct from source account
   UPDATE accounts
   SET balance = balance - p_amount
   WHERE account_id = p_from_account;

   -- Add to target account
   UPDATE accounts
   SET balance = balance + p_amount
   WHERE account_id = p_to_account;

   DBMS_OUTPUT.PUT_LINE('₹' || p_amount || ' transferred from Account ' || 
                        p_from_account || ' to Account ' || p_to_account);

   COMMIT;
END;
/

-- Call the procedure: Transfer ₹3000 from Account 1 to Account 2
BEGIN
   TransferFunds(1, 2, 4000);
END;
/

-- View updated balances
SELECT * FROM accounts;
/
