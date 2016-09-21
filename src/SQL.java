1.     Write a query that lists each member name, address, dues and location.

SELECT name, address, dues, location
FROM Members
ORDER BY ID;



2.     Write a SQL Query to pull all members that are over 45

SELECT * FROM Members WHERE AGE > 45

3.     Write a SQL Query to pull all members that have a dues value of 0.
SELECT * FROM Organization WHERE DUE = 45
