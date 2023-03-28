import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

public class PersonTest {

    @Test
    public void test1() {
        boolean result = Person.isTeenager(13);
        assertTrue(result);
    }

    @Test
    public void test2() {
        boolean result = Person.isTeenager(19);
        assertTrue(result);
    }

    @Test
    public void test3() {
        boolean result = Person.isTeenager(20);
        assertTrue(result);
    }

    @Test
    public void test4() {
        boolean result = Person.isTeenager(12);
        assertFalse(result);
    }

    @Test
    public void test5() {
        boolean result = Person.isTeenager(10);
        assertFalse(result);
    }

    @Test
    public void test6() {
        boolean result = Person.isTeenager(-3);
        assertFalse(result);
    }

    @Test
    public void test7() {
        boolean result = Person.isTeenager(999);
        assertFalse(result);
    }
}