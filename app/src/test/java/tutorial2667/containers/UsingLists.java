package tutorial2667.containers;

import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.google.common.escape.ArrayBasedUnicodeEscaper;

//Be sure and do the UsingArrayContainers exercise before comleting this one.
//
// Lists are like arrays but better because they are more flexible. They grow dynamically
// as you add items to them. You don't need to know how big the list needs to be when you declare it.
//
// Lists also use a lot of concepts that we will cover later like polymorphisim and dynamic types.
// For now, it will be like magic but once we cover it, it will make complete sense.
public class UsingLists {
    @Test
    public void listsAreInitializedWithTheNewOperator(){

        // Inorder to initialize a list you need to use the new operator to create
        // something called an ArrayList and you need to give it a type.
        // Note: this is where we touch on polymorhisim and dynamic types mentioned above.

        // Example: a list of Strings
        List<String> stringList = new ArrayList<String>();
    }

    @Test
    public void addMethodAddsToAList(){
        List<String> stringList = new ArrayList<String>();
        
        // The add method is used to put items in a list. This method
        // takes the item you are inserting into the list as a parameter.
        // Example:
        // stringList.add("apples")
        //
        // TODO: Add 3 items to stringList


        // The get method is used to get things from a list. This method takes
        // the index of the thing you want to access as a parameter.
        //
        // Example:
        // stringList.get(1);
        // 
        // TODO: Add 3 assertEquals function calls to verify that the list contains
        // all of the items you added to
        

        // You can access elements of the list by calling the get method and passing in the
        // index of the element you want to access.
        // example: stringList.get(0)

        // TODO: Add assertEquals function calls that verify each element in the stringList.
    }

    @Test
    public void listsCanContainAnyType(){
        // You specify the type of object you want to store in lists in the angle brackets.
        // You already saw an example of a list containing Strings:
        // Example: List<String> strs = new ArrayList<String>();
        //
        // If you want to create a list that contains ints, use Integers in the angle brackets.
        // (so why not just use 'int'? Don't worry about it for now. We'll cover that later.)
        //
        // TODO: Create a List of integers, add 3 integers to the list and then use assertEquals
        // to verify that the list contains the values you added.
    }    
}
