-- 코드를 입력하세요
SELECT 
    PRICE DIV 10000 * 10000 AS PRICE_GROUP, 
    COUNT(*) PRODUCTS
FROM PRODUCT
GROUP BY 1
ORDER BY 1;