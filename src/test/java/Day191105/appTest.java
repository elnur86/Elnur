package Day191105;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class appTest {

    private app app1;

    @Before
    public void setUp() {
        this.app1= new app();
    }

    @Test
    public void calc1() {
        assertEquals(1,app1.calc("()()()"));
    }
    @Test
    public void calc2() {
        assertEquals(2,app1.calc("(())()(())"));
    }
    @Test
    public void calc3() {
        assertEquals(3,app1.calc("()((()))()"));
    }
}