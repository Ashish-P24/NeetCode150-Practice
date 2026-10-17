SELECT i.name
FROM Employee e
JOIN Employee i ON e.managerId = i.id
GROUP BY i.id, i.name
HAVING COUNT(e.id) >= 5;
