/* 

Bitwise operators are used to perform manipulation of individual bits of a number.



Look at this in the curriculum 



Bitwise OR(|)
It returns bit by bit OR of the input values. If either of the bits is 1, then it gives us 1, else it gives 0

a = 10 // 1010 in binary
b = 5  // 0101 in binary

result is 1111 = 15 in decimal




Bitwise AND(&)
It returns bit by bit AND of the input values. If both bits are 1, then it gives 1, else it gives 0

a = 10 // 1010 in binary
b = 5  // 0101 in binary

result is 0000 = 0 in decimal



Leftshift operator(<<)
It takes two operators and left shifts the bits of the first operand. The second operand decides the number of places to shift. It fills 0 on voids left as a result.

The output of 10<<1 is 20

10 = 1010
left shift one
10100 = 20

Rightshift operator(>>)
It takes two operators and right shifts the bits of the first operand. The second operand decides the number of places to shift. It fills 0 on voids left as a result if the first operand is positive else it fills 1.

10 = 1010
right shift 1
0101 = 5
*/