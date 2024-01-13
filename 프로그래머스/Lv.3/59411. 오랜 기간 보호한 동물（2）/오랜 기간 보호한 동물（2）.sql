-- 코드를 입력하세요
SELECT ao.animal_id, ao.name FROM animal_outs ao
INNER JOIN animal_ins ai ON ai.animal_id = ao.animal_id
ORDER BY DATEDIFF(ao.datetime, ai.datetime) DESC LIMIT 2;