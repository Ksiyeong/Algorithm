-- 코드를 입력하세요
SELECT ri.FOOD_TYPE, ri.REST_ID, ri.REST_NAME, mfri.max_favorites
FROM REST_INFO ri
INNER JOIN (
    SELECT FOOD_TYPE, MAX(FAVORITES) max_favorites
    FROM REST_INFO
    GROUP BY FOOD_TYPE
    ) AS mfri
ON mfri.max_favorites = ri.FAVORITES AND mfri.FOOD_TYPE = ri.FOOD_TYPE
ORDER BY ri.FOOD_TYPE DESC;