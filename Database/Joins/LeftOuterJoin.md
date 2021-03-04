LEFT OUTER Join for Tables A and B will always return all records from table A even if matching record is not found in table B as per the join condition. For records whre match is found the result set is exactly the same as the inner join result. However for non matching records all columns from table B appear as NULL in  the result. 

SELECT ID, ENAME, E.COMPID AS E_COMPID, C.COMPID AS C_COMPID, MODEL 
FROM  Employee  E LEFT OUTER JOIN Computer C ON E.COMPID  = C.COMPID

ID      ENAME           E_COMPID        C_COMPID        MODEL  
1       James Potter    1001            1001            Vostro
2       Ethan McCarty   NULL            NULL            NULL



AND returns NULL values
WHERE does not