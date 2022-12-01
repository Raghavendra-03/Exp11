package project.Exp11;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void test() {

        App p = new App();
        assertEquals("Hello DURGA", p.getMessage("DURGA"));

    }
    @Test
    public void testNameEmpty() {

        App c = new App();
        assertEquals("Please provide a name!", c.getMessage(" "));

    }
}