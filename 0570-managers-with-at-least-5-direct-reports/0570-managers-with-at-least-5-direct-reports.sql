-- # Write your MySQL query statement below
-- select e.name as name from Employee e
-- join Employee m
-- on m.id=e.managerId group by m.id,m.name having count(e.id)>=5;

SELECT m.name
FROM Employee e
JOIN Employee m 
  ON e.managerId = m.id
GROUP BY m.id
HAVING COUNT(e.id) >= 5;
