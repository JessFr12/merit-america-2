-- 3. For all actors with the last name of "Jones", display the actor's name and movie titles they appeared in. 
-- Order the results by the actor names (A-Z) and then by movie title (A-Z). 
-- (48 rows)

SELECT DISTINCT person_name, title
FROM person, movie_actor, movie
WHERE person.person_id = movie_actor.actor_id
AND movie_actor.movie_id = movie.movie_id
AND person_name LIKE '% Jones'
ORDER BY person_name, title;
