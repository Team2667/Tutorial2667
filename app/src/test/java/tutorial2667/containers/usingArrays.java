package tutorial2667.containers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;


// Arrays are 0 or more variables. 
public class usingArrays {
    
    @Test
    public void arraysAreAClumpOfMultipleVariabls(){
        int numbers[] = {20, 30, 40};

        // Arrays are zero or more variables that are packed together.
        // You can access any one of the numbers using an index (ex numbers[1])
        // The index is 0 based. To get the first item in the array you use 0, (ex numbers[0].
        // 
        
        // TODO: Add an assertEquals call to test the value of each item in the array.
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
    
}
