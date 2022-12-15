import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
   void addFail() {
     fail("Not implemented");
  }
    @Test
    void add() {
        System.out.println("Add method");
        int actual=Calculator.add(2,3);
        assertEquals(5,actual,"Test failed. ");
    }

    @Test
    void testCase1(){
        System.out.println("Test case 1");
    }
    @Test
    void testCase2(){
        System.out.println("Test case 2");
        assertTrue(Calculator.operator.equals("add"));
        assertEquals("add",Calculator.operator);
    }

    @Test
    void testCase3(){
        System.out.println("Test case 3");
        assertArrayEquals(new int[]{1,2,3}, new int[]{1,3,2}, "Arrays are the not same. ");
    }

    @Test
    void testCase4(){
        System.out.println("Test case 4");
        String nullString=null;
        String notNullString="Cydeo";

        assertNull(nullString);
        assertNotNull(notNullString);
    }
    @Test
    void testCase5(){
        System.out.println("Test case 5");

        Calculator c1=new Calculator();
        Calculator c2=c1;
        Calculator c3=new Calculator();
        assertSame(c1,c2);
        assertNotSame(c1,c3);
    }
}