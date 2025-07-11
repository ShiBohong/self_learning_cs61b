package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 15, 16, 17, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 289 -> 18", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesSimple2() {
        IntList lst = IntList.of(20, 21, 22, 23, 24);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("20 -> 21 -> 22 -> 529 -> 24", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesSimple3() {
        IntList lst = IntList.of(2, 6, 7, 10, 11);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("4 -> 6 -> 49 -> 10 -> 121", lst.toString());
        assertTrue(changed);
    }
}
