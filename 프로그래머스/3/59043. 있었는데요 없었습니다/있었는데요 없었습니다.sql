-- 코드를 입력하세요
SELECT ao.ANIMAL_ID, ao.NAME FROM ANIMAL_OUTS ao
JOIN ANIMAL_INS ai ON ai.ANIMAL_ID = ao.ANIMAL_ID
WHERE ao.DATETIME < ai.DATETIME
ORDER BY ai.DATETIME ASC;