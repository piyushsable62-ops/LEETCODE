# Write your MySQL query statement below
SELECT customer_number FROM ORDERS
group by customer_number
ORDER BY count(*) desc
limit 1;
