-- 2. The names and birthdays of actors in "The Fifth Element"
-- Order the results alphabetically (A-Z) by name.
-- (15 rows)

SELECT person_name, birthday
FROM person
JOIN movie_actor ON person.person_id = movie_actor.actor_id
WHERE movie_actor.movie_id = 18
ORDER BY person_name;
