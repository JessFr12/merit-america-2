-- 15. The title of the movie and the name of director for movies where the director was also an actor in the same movie.
-- Order the results by movie title (A-Z)
-- (73 rows)

SELECT DISTINCT movie.title, person_name
FROM movie, person, movie_actor
WHERE movie.director_id = person.person_id
AND person.person_id = movie_actor.actor_id
AND movie_actor.movie_id = movie.movie_id
ORDER BY movie.title;