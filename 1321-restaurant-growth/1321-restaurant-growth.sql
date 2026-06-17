# Write your MySQL query statement below
SELECT visited_on, amount, average_amount
FROM (
    SELECT 
        visited_on,
        SUM(daily_sum) OVER (ORDER BY visited_on ROWS BETWEEN 6 PRECEDING AND CURRENT ROW) AS amount,
        ROUND(SUM(daily_sum) OVER (ORDER BY visited_on ROWS BETWEEN 6 PRECEDING AND CURRENT ROW) / 7.0, 2) AS average_amount,
        DENSE_RANK() OVER (ORDER BY visited_on) AS day_rank
    FROM (
        SELECT visited_on, SUM(amount) AS daily_sum
        FROM Customer
        GROUP BY visited_on
    ) AS DailyAmounts
) AS RollingStats
WHERE day_rank >= 7
ORDER BY visited_on;
