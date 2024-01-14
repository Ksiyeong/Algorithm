-- 코드를 입력하세요
SELECT YEAR(os.sales_date) yd, MONTH(os.sales_date) md, ui.gender ug, COUNT(DISTINCT ui.user_id) cnt
FROM user_info ui
INNER JOIN online_sale os ON os.user_id = ui.user_id
WHERE ui.gender IS NOT NULL
GROUP BY yd, md, ug
ORDER BY yd, md, ug;