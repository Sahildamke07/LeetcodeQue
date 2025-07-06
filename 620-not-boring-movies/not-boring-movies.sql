# Write your MySQL query statement below
SELECT * from Cinema as c
WHERE c.id%2=1 and description!="boring"
ORDER BY rating DESC;