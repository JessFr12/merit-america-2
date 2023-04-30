-- 11. Hollywood is remaking the classic movie "The Blob" and doesn't have a director yet. Add yourself to the person table, and assign yourself as the director of "The Blob" (the movie is already in the movie table). (1 record each)
INSERT INTO person (person_name, birthday, biography)
VALUES ('Jesse Franco', '01-01-2002', 'I love pizza');

INSERT INTO movie (movie_id, director_id)
VALUES ((SELECT movie_id FROM movie WHERE title = 'The Blob'), (SELECT person_id FROM person WHERE person_name = 'Jesse Franco'));

SELECT * FROM person;