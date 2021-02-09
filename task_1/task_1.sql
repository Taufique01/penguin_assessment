-- runs on MySQL

-- a 
SELECT name 
FROM   courses; 

SELECT name 
FROM   teacher; 


-- b
SELECT name 
FROM   teacher 
WHERE  id = (SELECT teacher_id 
             FROM   courses 
             GROUP  BY teacher_id 
             HAVING Count(teacher_id) = (SELECT Max(teacher_id_count) 
                                         FROM   (SELECT 
                                        Count(*) AS teacher_id_count 
                                                 FROM   courses 
                                                 GROUP  BY teacher_id))); 
--c
SELECT name 
FROM   teacher 
WHERE  id NOT IN (SELECT DISTINCT teacher_id 
                  FROM   courses); 


