package Day191022;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    Calculator S;
    @Before
    public  void before()
    { this.S=new Calculator();}
    @Test
    public void add() {


        int Sum= S.add(2,3);
        assertEquals(5,Sum);
    }

    @Test
    public void sub() {
        Calculator S=new Calculator();
        int Sum= S.sub(3,1);
        assertEquals(2,Sum);
    }

    @Test
    public void mul() {
    }

    @Test
    public void div() {
    }
}