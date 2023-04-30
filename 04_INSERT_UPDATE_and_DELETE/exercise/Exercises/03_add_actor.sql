-- 3. Did you know Eric Stoltz was originally cast as Marty McFly in "Back to the Future"? Add Eric Stoltz to the list of actors for "Back to the Future" (1 row)

SELECT person_name FROM person
JOIN movie_actor ON person.person_id = movie_actor.actor_id
JOIN movie ON movie_actor.movie_id = movie.movie_id
WHERE movie.title = 'Back to the Future';

INSERT INTO movie_actor (movie_id, actor_id)
VALUES ((SELECT movie_id FROM movie WHERE title = 'Back to the Future'), (SELECT person_id FROM person
																		 WHERE person_name = 'Eric Stoltz'));
