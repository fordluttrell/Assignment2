import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class FinderTest {

    @Test
    void testFindMin() {
        int[] array = new int[] {1,2,4,5};
        assertEquals(Finder.findMin(array), 1);
    }

    @Test
    void testFindMax() {
        int[] array = new int[] {1,2,4,5};
        assertEquals(Finder.findMax(array), 5);
    }

    @Test
    void testFindMinNullArray() {
        int[] array =  null;
        assertEquals(Finder.findMin(array), Integer.MIN_VALUE);
    }

    @Test
    void testFindMinEmptyArray() {
        int[] array =  new int[0];
        assertEquals(Finder.findMin(array), Integer.MIN_VALUE);
    }

    //...

    @Test
    void testFindMaxNullArray() {
        int[] array =  null;
        assertEquals(Finder.findMax(array), Integer.MAX_VALUE);
    }

    @Test
    void testFindMaxEmptyArray() {
        int[] array = new int[0];
        assertEquals(Finder.findMax(array), Integer.MAX_VALUE);

    }
}