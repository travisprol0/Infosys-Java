A SELECT statement can have many clauses so it is important to understand the order in which these are executed to provide the result. However, for ease of understanding we can refer to the execution order by FJWGHSDO.

A quick way to remember this is to use the mnemonic "Frank John's Wicked Grave Haunts Several Dull Owls". In this section we will focus on FROM, WHERE, SELECT and DISTINCT keywords.

The first step is always the FROM clause as we need to identify the tables from which data has to be fetched.

SELECT must be always be executed after the WHERE clause, e.g. we can have a query



Here the filtering needs to happen on an Id column which is not included in the SELECT clause. Unless SELECT executes after WHERE this functionality cannot be supported.

DISTINCT removes duplicates based on all columns of the SELECT clause. These columns could be a subset of all columns of the table OR may even contain derived columns through the use of an expression. Thus DISTINCT is dependent on SELECT clause and it's execution must happen after SELECT clause.