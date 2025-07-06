# Write your MySQL query statement below
SELECT s.user_id, round(ifnull(sum(c.action="confirmed")/count(c.action),0),2) as confirmation_rate
FROM Signups as s
LEFT JOIN Confirmations as c
ON s.user_id = c.user_id
GROUP BY s.user_id;