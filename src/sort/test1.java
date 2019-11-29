package sort;

import static org.junit.Assert.*;
import org.junit.Test;

public class test1 {

	@Test
	public void testSort1() {          
		Sort s = new Sort();
		double arr[] = {1, 3, 6, 2, 5, 4};
		double arr1[] = {1, 2, 3, 4, 5, 6};
		s.sort(arr);
		for (int i = 0; i < arr.length; i ++) {
			System.out.print(arr[i] + "  ");
			assertEquals(arr[i], arr1[i], 0.0001);
		}
		System.out.print("\n");
	}
	
	@Test
	public void testSort2() {          
		Sort s = new Sort();
		double arr[] = {-1, -1, -1, -1, -1, -1};
		s.sort(arr);
		for (int i = 0; i < arr.length; i ++) {
			System.out.print(arr[i] + "  ");
			
		}
		System.out.print("\n");
	}
	
	@Test
	public void testSort3() {          
		Sort s = new Sort();
		double arr[] = {99999999,99999999,99999999,99999999,99999999 };
		s.sort(arr);
		for (int i = 0; i < arr.length; i ++) {
			System.out.print(arr[i] + "  ");
			
		}
		System.out.print("\n");
	}
	
}

