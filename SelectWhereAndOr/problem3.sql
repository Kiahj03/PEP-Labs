SELECT id, first_name, last_name, salary FROM employee WHERE salary > 50000 AND (NOT(first_name = 'Steve') AND NOT(last_name = 'Steve'));