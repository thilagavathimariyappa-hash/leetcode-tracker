-- Last updated: 7/8/2026, 10:31:29 PM
SELECT email AS Email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;
