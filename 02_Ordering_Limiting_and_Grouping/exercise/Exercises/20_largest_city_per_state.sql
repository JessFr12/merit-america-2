-- 20. The state abbreviation, and population of the city with the largest population (name column 'city_population') for all states, territories, and districts.
-- Order the results from highest to lowest populations.
-- (56 rows)

SELECT state.state_abbreviation, MAX(city.population) AS city_population
FROM state
JOIN city ON state.capital = city.city_id
GROUP BY state.state_abbreviation
ORDER BY city_population DESC;