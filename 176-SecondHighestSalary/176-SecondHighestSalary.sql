-- Last updated: 7/8/2026, 10:31:40 PM
SELECT
    (SELECT DISTINCT salary FROM employee
    ORDER BY salary DESC
    LIMIT 1 OFFSET 1) AS SecondHighestSalary;


