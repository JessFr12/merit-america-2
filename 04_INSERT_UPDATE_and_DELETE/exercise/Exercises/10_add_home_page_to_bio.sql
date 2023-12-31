-- 10. For all people born before 1950 and have a home page, add the home page to the end of their biography. (142 rows)
-- Note: Assume all biographies end in a period with no trailing spaces. You'll need to also add a space before the website address.

SELECT * FROM person;

UPDATE person SET biography = CONCAT(biography, ' ', home_page)
WHERE home_page IS NOT NULL AND birthday < '19500101';