SELF join represents join of a table with itself. 

Say you have 5 employees, 1 and 2 are managers, 3-5 have manager ID as a column

SELECT EMP.ID EMPID, EMP.ENAME EMPNAME, MGR.ID MGRID, MGR.ENNAME MGRNAME
FROM Employee EMP INNER JOIN Employee MGR ON EMP.MANAGER = MGR.ID