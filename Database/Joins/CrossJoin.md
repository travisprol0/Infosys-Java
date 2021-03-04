Not used very often because it combines the first row from each table. 

SELECT E.ID, E.ENAME, E.COMPID AS E_COMPID, C.COMPID, C.Model FROM Employee E CROSS JOIN Computer C