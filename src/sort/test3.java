package sort;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class test3 {
   	
   	@Test
	public void testgetMin() {
		GetMin Mi = new GetMin();
		double arr[] = {1, 3, 6, 2, 5, 4};
		double num = Mi.getMin(arr);
		System.out.println("数组中的最小值为：" + num);
		assertEquals(num, 1, 0.0001);
   	}
}
