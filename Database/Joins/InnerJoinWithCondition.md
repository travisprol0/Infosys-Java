While using inner Joins there can be a situation where you want to filter rows based on some critieria e.g. a need to fetch all employeeds from ETA who are allocated a computer. The filter condition can be supplied in two ways when using ANSI syntax (t1 inner JOIN t2 ON condition)


    Option 1: WHERE clause

        SELECT Id, EName, E.CompId AS E_CompId, C.CompId AS C_CompId, Model
        FROM Employee E INNER JOIN Computer C On E.CompId = C.CompId WHERE Dept = 'ETA'


    Option 2: AND operator

        SELECT Id, EName, E.CompId AS E_CompId, C.CompId AS C_CompId, Model
        FROM Employee E INNER JOIN Computer C On E.CompId = C.CompId AND Dept =' ETA'