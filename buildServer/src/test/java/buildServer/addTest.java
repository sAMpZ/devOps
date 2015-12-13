package buildServer;

import junit.framework.TestCase;
public class addTest extends TestCase {
   protected int value1, value2;
   
   helloWorld hello = new helloWorld();
   // assigning the values
   protected void setUp(){
      value1=3;
      value2=3;
   }

   // test method to add two values
   public void testAdd(){
      double result= hello.add(value1, value2);
      assertTrue(result == 6);
   }
}