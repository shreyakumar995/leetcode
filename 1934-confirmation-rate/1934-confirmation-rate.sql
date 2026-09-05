# Write your MySQL query statement below
select a.user_id ,
ROUND(AVG(IF(c.action="confirmed",1,0)),2) as confirmation_rate
from signups a
left join confirmations c using (user_id)
group by a.user_id