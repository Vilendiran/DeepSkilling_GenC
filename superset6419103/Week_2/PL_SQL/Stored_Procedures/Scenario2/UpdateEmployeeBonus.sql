-- Drop table if exists
BEGIN
   EXECUTE IMMEDIATE 'DROP TABLE employee';
EXCEPTION
   WHEN OTHERS THEN
      NULL; -- Ignore if table doesn't exist
END;
/

-- Create employee table
CREATE TABLE employee (
   emp_id   NUMBER PRIMARY KEY,
   emp_name VARCHAR2(50),
   dep_id   NUMBER,
   salary   NUMBER(9,2)
)
/

-- Insert sample records
BEGIN
   INSERT INTO employee VALUES (101, 'john', 1, 30000);
   INSERT INTO employee VALUES (102, 'JD', 1, 28000);
   INSERT INTO employee VALUES (103, 'joseph', 2, 32000);
   INSERT INTO employee VALUES (104, 'propt', 2, 35000);
   INSERT INTO employee VALUES (105, 'varun', 3, 40000);
   COMMIT;
END;
/

-- Create stored procedure
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
   p_dep_id     IN NUMBER,
   p_bonus_per  IN NUMBER
)
IS
BEGIN
   UPDATE employee
   SET salary = salary + (salary * p_bonus_per / 100)
   WHERE dep_id = p_dep_id;

   DBMS_OUTPUT.PUT_LINE(
      'Salaries updated in Department ' || p_dep_id ||
      ' with ' || p_bonus_per || '% bonus.'
   );

   COMMIT;
END;
/

-- Call the procedure
BEGIN
   UpdateEmployeeBonus(1, 10);
END;
/

-- View updated employee data
SELECT * FROM employee;
/
