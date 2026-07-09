-- Last updated: 7/8/2026, 10:31:38 PM
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
    SELECT salary
    FROM (
        SELECT salary,
               DENSE_RANK() OVER (ORDER BY salary DESC) AS rnk
        FROM Employee
    ) AS ranked
    WHERE rnk = N
    LIMIT 1
  );
END;