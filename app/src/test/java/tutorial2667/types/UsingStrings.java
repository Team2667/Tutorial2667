package tutorial2667.types;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsingStrings {
    
    @Test
    public void stringsAreOneOrMoreCharactersInsideQuotes(){
        String s = "This is a string";
        assertEquals("This is a string", s);
    }

    @Test
    public void thePlusOperatorWorksDifferentForStrings(){
        String s = "Hello ";
        String w = "world!";
        
        //
        // When you use the plus operator on strings, they are concatinated together. This
        // means that a new, longer string is created consisting of the string on the left and
        // the string on the right.
        //
        // TODO: Guess what s + w is and then add a call to assertEquals to test your guess
    }

    @Test
    public void ifYouTryToAddAnIntToAStringYouGetAString(){
        int x = 500;
        String s = " bottles of bear on the wall";
        
        // When you use the + operator to add an int to a string, the int first gets converted
        // to a string and then the + operator is applied to 2 strings.
        //
        // TODO: Guess what x + s is and then add a call to assertEquals to test your guess
    }
}
