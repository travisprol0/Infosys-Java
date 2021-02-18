package Arrays;

/* 

Next, you will learn about Multi-dimensional arrays.

Multi-dimensional arrays are arrays of arrays with each element of the array holding the reference of other arrays. A multi-dimensional array is created by appending one set of square brackets ([]) per dimension.

Let's see a simple example to declare, instantiate, initialize and display a 2-dimensional (2D) array.

Syntax for creating 2D array:
Note: The second dimension, i.e., the column size is optional.
*/

dataType[][] arrayVarName = new dataType[rowsize][columnsize];

//Here, the row size is 7, and the column size is 2
//The 0th index stores the Max temperature and 1st index stores the Min temperature
int[][] dayWiseTemperature = new int[7][2];    
dayWiseTemperature[0][0]=29; // Initialization 
dayWiseTemperature[0][1]=21;
//and so on
//Another way of creating and initializing 2D array 
int[][] dayWiseTemperature = new int[][]  {
        {29,21},
		{24,23},
		{26,22},
		{28,23},
		{29,24},
		{23,20},
		{29,21}
    };

        //Updating an element of a 2D array 
dayWiseTemperature[2][0]=33;
//Displaying value of an element of a 2D array 
System.out.println(dayWiseTemperature[2][0]); 

//Program to illustrate the use of multidimensional array  
class MultiDimensional {
	public static void main(String[] args) {
		// Declaring and initializing 2D array
		int[][] dayWiseTemperature = new int[][] { { 29, 21 }, { 24, 23 },
				{ 26, 22 }, { 28, 23 }, { 29, 24 }, { 23, 20 }, { 29, 21 } };

		// Displaying 2D array
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 2; j++) {
				if (j == 0)
					System.out.println("Max Temperature is "
							+ dayWiseTemperature[i][j] + " on day " + i);
				else
					System.out.println("Min Temperature is "
							+ dayWiseTemperature[i][j] + " on day " + i);
			}
		}
	}
}