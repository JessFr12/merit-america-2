-- 15. The title of the movie and the name of director for movies where the director was also an actor in the same movie.
-- Order the results by movie title (A-Z)
-- (73 rows)

SELECT DISTINCT movie.title, person_name
FROM movie
JOIN person ON movie.director_id = person.person_id
JOIN movie_actor ON person.person_id = movie_actor.actor_id
WHERE actor_id = director_id
ORDER BY movie.title;