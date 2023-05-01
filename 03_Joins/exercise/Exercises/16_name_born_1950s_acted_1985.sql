-- 16. The names and birthdays of actors born in the 1950s who acted in movies that were released in 1985.
-- Order the results by actor from oldest to youngest.
-- (20 rows)
SELECT DISTINCT person_name, birthday
FROM person
JOIN movie_actor ON movie_actor.actor_id = person.person_id
JOIN movie ON movie.movie_id = movie_actor.movie_id
WHERE birthday >= '1950-01-01' AND birthday < '1960-01-01' AND release_date >= '1985-01-01' AND release_date < '1986-01-01'
ORDER BY birthday;
