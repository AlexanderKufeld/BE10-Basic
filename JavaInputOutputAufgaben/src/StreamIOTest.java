

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class StreamIOTest {

    String file = "sum.txt";

    @Test
    public void testSumFromFile1(){
        int actual = StreamIO.sumFromFile1(file);
        int expected = 107;
        assertEquals(expected, actual);
    }

    @Test
    public void testSumFromFile2(){
        int actual = StreamIO.sumFromFile2(file);
        int expected = 107;
        assertEquals(expected, actual);
    }

    @Test
    public void testSortedStringArray(){
        String[] strArr = {"aaa", "bbbb", "a", "bb"};
        String[] actual = StreamIO.sortedStringArray(strArr);
        String[] expected = {"a", "bb", "aaa", "bbbb"};
        assertArrayEquals(expected, actual);
    }
}