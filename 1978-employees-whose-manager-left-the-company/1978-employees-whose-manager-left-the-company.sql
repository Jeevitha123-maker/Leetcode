-- # Write your MySQL query statement below
-- select e.employee_id from Employee e
-- join Employees m
-- on m.employee_id= e.manager_id
-- where salary<30000 and e.manager_id=null;

select employee_id from Employees
where salary<30000 and
manager_id not in(
    select employee_id from Employees
    )
order by employee_id;