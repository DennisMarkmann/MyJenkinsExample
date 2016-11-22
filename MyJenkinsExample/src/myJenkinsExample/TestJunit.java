package myJenkinsExample;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	
   String message = "Hello World";	

   @Test
   public void testPrintMessage() {
      assertEquals("Hello World",message);
   }
}
