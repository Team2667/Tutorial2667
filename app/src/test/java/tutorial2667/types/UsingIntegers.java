package tutorial2667.types;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsingIntegers {
    
    @Test
    public void useIntToDeclareIntegerVariables(){
        // 'int' is used to declare an integer primitive variable
        int x;

        // '=' is the assignment operator in java. It is used to assign a variable a value.
        // Change this line to make the test pass
        x = 100;

        // assertEquals is a function that will
        // compare 100 to x. If 100 is the same as x, the test will pass.
        //
        // Assuming you have the TestRunner plugin installed, Click on the arrow in the left margin
        // to run this test. 
        //
        // TODO: Try replacing 100 with an incorrect answer and run it again.
        assertEquals(100, x);
    }

    @Test
    public void aVariableCanBeAssignedAValueWhenItIsDeclared() {
        int x = 100;

        // TODO: call the assertEquals function to test that x is equal to 100.
    }

    @Test
    public void addingIntegersDoesWhatYouExpectMostOfTheTime() {
        int x = 100;
        int y = 50;
        // TODO: add an assertEquals that asserts 150 equals x + y
    }

    @Test
    public void thereIsALimmitToHowBigAnIntegerCanBe(){
        int x = Integer.MAX_VALUE;
        
        
        // TODO: Make a guess as to the value of x, and then
        // add a call to assertEquals to see if your answer is correct.
        //
        // Next, guess the value of x + 1 (hint, the answer probably won't be what you expect)
        // And then add a call to assertEquals to see if that answer is right.
    }

    @Test
    public void deviding2IntegersYeildsAnInteger() {
        int x = 9/4;

        // TODO: make a guess as to what x is then create
        // an assertEquals function call to see if your answer
        // is correct.
    }

    @Test
    public void moudulesReturnsTheRemainder() {
        int x = 9 % 4;
        // TODO: guess the value of x and then add an assertEquals call to see
        // if your guess is correct.
    }

    @Test
    public void aLongIsJustABiggerInteger() {
        long x = Long.MAX_VALUE;
        // TODO: guess the value of x and then add an assertEquals call to see
        // if your guess is correct. 
    }

    @Test
    public void integersCanBeMultipled(){
        // * is the multiplication operator. Ex, 10 * 3 = 30
        // TODO: add an assertEquals call that asserts an iteger is equal to 2 other integers 
        // multipled together.
    }
}
