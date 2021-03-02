If column names are not used then values must be provided for all columns in the order of their specification during table creation.

If column names are used then the data provided in the values clause must have the same data type of column at same position.

Multiple rows can be inserted through a single INSERT statement only when it is used with SELECT statement. You will learn about SELECT QUERY shortly.

While inserting data, column values should match column type definition(e.g., you can’t insert a textual value into the numerical column/attribute). If the column is of strings or date time or characters, they need to be enclosed in single quotes(You cannot use double quotes). String data is case sensitive and will be stored as given within quotes. If the data is numeric, you don't need the quotes. NULL also should not be enclosed with quotes.