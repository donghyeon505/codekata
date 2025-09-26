-- 코드를 입력하세요
SELECT flavor
FROM (
    SELECT flavor, SUM(total_order) AS total_order_sum
    FROM (
        SELECT flavor, total_order FROM first_half
        UNION ALL
        SELECT flavor, total_order FROM july
    ) AS all_orders
    GROUP BY flavor
) AS summed_orders
ORDER BY total_order_sum DESC
LIMIT 3;