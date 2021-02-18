// Syntax for creating on one line

dataType[] arrayVarName = {elementsOfArraySeparatedByComma};

long [] restaurantContacts ={99999999L, 98999999L, 9099999L};

// Syntax for using the new keyword

dataType[] arrayVarName = new dataType[size];

arrayVarName[index] = element;

long [] restaurantContacts = new long [3];
restaurantContacts [0] = 9992346725L;
restaurantContacts [1] = 9992346726L;
restaurantContacts [2] = 9992346727L;

// Syntax for creating the array in different lines

dataType [] arrayVarName;

arrayVarName = new dataType[size]

arrayVarName[index] = element;


long[] restaurantContacts;
restaurantContacts = new long[3]
restaurantContacts[0] = 9992346725L;
restaurantContacts[1] = 9992346726L;
restaurantContacts[2] = 9992346727L;
System.out.println(restaurantContacts [1]);