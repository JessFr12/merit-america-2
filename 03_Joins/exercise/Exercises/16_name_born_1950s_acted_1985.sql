-- 16. The names and birthdays of actors born in the 1950s who acted in movies that were released in 1985.
-- Order the results by actor from oldest to youngest.
-- (20 rows)
SELECT person_name, birthday
FROM person
JOIN movie ON person.person_id = movie.director_id
WHERE birthday BETWEEN '19500101' AND '19591231';
