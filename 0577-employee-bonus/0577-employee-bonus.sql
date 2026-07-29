# Write your MySQL query statement below
select e.name , b.bonus from Employee e
left join Bonus b
on e.empid = b.empId
where Bonus<1000 or Bonus is Null;
