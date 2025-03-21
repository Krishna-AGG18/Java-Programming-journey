# Java-Programming-journey
### default values of different primitive datatypes
---
-    byte b;      ---> 0
-    short s;     ---> 0
-    int i;       ---> 0
-    long l;      ---> 0
-    float f;     ---> 0
-    double d;    ---> 0
-    char c;      ---> '\0'
-    boolean bool;     ---> false
-    string str;       ---> null
-    int/boolean/float/double[] arr = new int[5]; // Array of size 5 [0,0,0,0,0]

-   0 and 1 is not treated as true and false

### Arrays 
---
Arrays refers to a list of same type of items.
- In Java, array is zero-indexed that is index starts from 0.
- Suppose we have a student named xyz we have to stores his age, marks in three subjects so we create array instead of 4 vars.

Syntax : 
- type[ ] arrayName = new type[size];   OR  
- type arrayName[ ] = new type[size];  Or
- type arrayName[ ] = {1,2,3,4,5,6}
-  here new keyword is used for memory allocation of a non-primitive data type.
- For above problem 
-   int[] marks = new int[4];  --->  [age,marks1,marks2,marks3]
- System.out.println(marks);   // returns a garbage value related to the address of array in memory.

Some defaults :
-         String[] strArr = new String[4];    // {null, null,null, null}
-         Boolean[] strArr = new Boolean[4];  // {false, false, false, false}

Length of array :
- arr.length : gives the length of the array 

