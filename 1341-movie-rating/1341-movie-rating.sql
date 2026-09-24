# Write your MySQL query statement below
(select name as results
from movierating join users using(user_id)
group by name
order by count(*)desc,name
limit 1)

UNION ALL

(select title as results
from movierating join movies using(movie_id)
WHERE EXTRACT(YEAR_MONTH FROM created_at) = 202002
GROUP BY title
ORDER BY AVG(rating) DESC, title
LIMIT 1);