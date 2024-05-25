package tutorial2667.containers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Do before UsingLists
// Arrays are 0 or more variables. 
public class UsingArrayContainers {
    
    @Test
    public void arraysAreAClumpOfMultipleVariabls(){
        
        // Arrays are zero or more variables that are packed together.
        // You can access any one of the numbers using an index (ex numbers[1])
        // The index is 0 based. To get the first item in the array you use 0, (ex numbers[0].
        // 
        // The following shows how to initialize an array with a 
        // literal expression.
        int numbers[] = {20, 30, 40};

        
        // TODO: Add an assertEquals call to test the value of each item in the array.
    }

    @Test
    public void youCanHaveArraysOfAnyType(){
        // In order to declare an array, simply add [] after the variable name. 
        String strs[] = {"Montana", "North Dakota", "Minnesota"};

        double measurements[] = {1.2, 2.3, 3.4};

        // TODO: Add assertEquals calls to test the value of each item in the arrays
    }

    @Test
    public void arraysHaveALengthProperty(){
        int numbers[] = {20, 30, 40};
        int moreNumbers[] = {200, 75, 88, 50, 60};

        // You can find how big an array is by accessing the length property.
        // To access a property on a variable, you follow the name of the variable with a '.' follwed by the
        // name of the property.
        // For example, numbers.length

        // TODO: Determine how many numbers are in either numbers, or moreNumbers. Add an assertEquals

    }

    @Test
    public void arraysCanBeInitializedWithNewOperator(){
        // You can declare an array and then initialize it later using the
        // 'new' operator. This is useful the size of the array cannot be known
        // at the tme the array is declared. The following example, initializes
        // an array that can contain 100 elements. 
        //
        // int numbers[];
        // numbers = new int[100];
        //
        int numbers[] = {};

        // TODO: Run the following test to see what happens when you dont initialize the array variable.
        // Then, use the 'new' operator to initialize the numbers variable and rerun the test case.

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        assertEquals(10, numbers[0]);
        assertEquals(20, numbers[1]);
        assertEquals(30, numbers[2]);
    }

    @Test
    public void itThrowsAnIndexOutOfRangeErrorIfArrayTooSmall(){
        String[] strArray;

        strArray = new String[2];
        strArray[0] = "one";
        strArray[1] = "two";
        strArray[2] = "three";

        // TODO: Run this test to see what happens if you don't allocate enough space for an array
        // Then change the code to initialize enough space.
        assertEquals(strArray[0], "one");
        assertEquals(strArray[1], "two");
        assertEquals(strArray[2], "three");

        // Notice that, with arrays, you get one shot to allocate enough space. If you need
        // to make your array bigger, you need to initializde a new array, and then
        // copy you're values over from the old array.
    }
    
}
