
package tutorial2667.types;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UsingBooleans {

    @Test
    public void booleansAreTrueOrFalse(){
        boolean t = true;
        boolean f = false;

        assertTrue(t);
        assertFalse(f);
    }

    @Test
    public void equalOperator(){

// == is the equal operator java. It evaluates to true
// when 2 things have the same value. Otherwise it evaluates to false
//

        int i1 = 20;
        int i2 = 30;
        int i3 = 10;

// 2 things compared with an equal operator a boolean expression.expression.
// The following is an example of a boolean expression
// 
// i1 + i3 == i2
//
// A boolean variable can be assigned to the result of a
// boolean expressions. The following is an example
        boolean b1 = i1 + i3 == i2;

        // TODO: assert b1 to either be true assertTrue(b1) or false assertFalse(b1)
    }

    @Test
    public void notOperator(){
        // the not operator is !.  ! makes true false and false true.
        assertTrue(!false);
        assertFalse(!true);
    
        int i1 = 20;
        int i2 = 30;
        int i3 = 10;
    
        boolean b1 = i1 + i3 == i2;

        // TODO: use the not operator to make the following 'assertFalse' call pass.
        assertFalse(b1);
    }
    
    @Test
    public void greaterThanOperator(){
        boolean b = 100 > 10;
        boolean b1 = 10 > 100;
        boolean b2 = 100 > 100;

        //TODO: add assertTrue() or assertFalse() calls for b, b1 and b2
        // so the test passes
    }

    @Test
    public void lessThanOperator(){
        boolean b = 100 < 10;
        boolean b1 = 10 < 100;
        boolean b2 = 100 < 100;

        // TODO: add assertTrue() or assertFalse() calls for b, b1 and b2
        // so the test passes
    }

    @Test
    public void greaterThanOrEqualOperator(){
        boolean b = 100 >= 10;
        boolean b2 = 10 >= 100;
        boolean b3 = 100 >= 100;

    
        // TODO: add assertTrue() or assertFalse() calls for b, b1 and b2
        // so the test passes
    }

        @Test
    public void lessThanOrEqualOperator(){
        boolean b = 10 <= 100;
        boolean b2 = 100 <= 10;
        boolean b3 = 100 <= 100;
    
        // TODO: add assertTrue() or assertFalse() calls for b, b1 and b2
        // so the test passes
    }

    @Test 
    void notEqualOperator(){

        // The != operator evaulates to true if 2 things do not have the same value.
        boolean b = 100 != 10;
        boolean b1 = 10 != 100;
        boolean b2 = 100 != 100;

        // TODO: add assertTrue() or assertFalse() calls for b, b1 and b2
        // so the test passes
    }

    @Test
    void carefulUsingEqualsWithStrings(){
        // Using equals with strings in tricky. We'll cover why in a later lesson.
        // And when we do, you'll be like; yea, that makes total sense. But for now
        // know that when comparing strings for equality, its best to use the method
        // equals(). We'll also get into the 'new' operator in more detail later.
        // exampel: s1.equals(s2)

        String s1 = new String("cat");
        String s2 = new String("cat");

        // TODO: in an assertTrue() function call, use the equals operator to compare
        // s1 to s2. 
        // Next, writhe an assertTrue() statement that compares s1 to s2 using equals()
    }
}