package cc.imeetu.iu.timlibrary;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect()/* throws Exception */ {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void addition_print() {
//        assertNotEquals(5, 1);
//        System.out.println(124 % 35);
        int page = 5;
        page += 1;
        System.out.println(page);
    }
}