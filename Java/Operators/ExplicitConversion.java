/*

Explicit Conversion is used when you want to assign a value of larger range data type to a smaller range data type. This conversion is not done by the compiler implicitly as there can be loss of data in some cases. Hence, programmer has to be cautious about such conversions. This is also known as Narrowing conversion. 
*/

double totalPrice = 200;
int newPrice = totalPrice;


// This will give you an error because you are going from a bigger data type (double) to a smaller data type (int)

int newPrice = (int)totalPrice 
