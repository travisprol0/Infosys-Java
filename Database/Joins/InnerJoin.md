Inner Join matches the records from both tables based on the join predicate and returns only the matched rows. Inner join has a short hand syntax.



SELECT ID, ENAME, E.COMPID AS E_COMPID, C.COMPID AS C_COMPID, MODEL 
FROM Employee E INNER JOIN Computer C ON E.COMPID = C.COMPID;