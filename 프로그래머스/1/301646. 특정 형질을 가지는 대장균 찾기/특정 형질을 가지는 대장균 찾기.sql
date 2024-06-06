SELECT COUNT(*) AS COUNT
FROM ECOLI_DATA
WHERE GENOTYPE = 1 OR
    (
     CONV(GENOTYPE, 10, 2) LIKE '%0_' AND
        (
            CONV(GENOTYPE, 10, 2) LIKE '%1__' OR 
            CONV(GENOTYPE, 10, 2) LIKE '%1'
        )
     );