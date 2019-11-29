package sort;

import static org.junit.Assert.assertEquals;

import org.apache.commons.math3.analysis.function.Subtract;
import org.junit.Test;

public class test4 {


   	
   	@Test
   	public void testgetSub( ) {
   		getSub S = new getSub();
   			Subtract s = new Subtract();
   			S.GetSub(10, 5);
   			System.out.println("10ºÍ5µÄ²îÎª:" + S.GetSub(10, 5));
   			assertEquals(S.GetSub(10, 5), s.value(10, 5), 0.0001);
   	}
}
