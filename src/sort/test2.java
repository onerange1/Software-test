package sort;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class test2 {
   	@Test
	public void testAddall() {
		Addall A = new Addall();
		double arr[] = {1, 3, 6, 2, 5, 4};
		double num = A.addall(arr);
		System.out.println("����1��Ϊ��" + num);
		assertEquals(num, 21, 0.0001);		
		
		double arr1[] = {-1, -1, -1, -1, -1, -1};
		num = A.addall(arr1);
		System.out.println("����2��Ϊ��" + num);
		
		double arr2[] = {99999999,99999999,99999999,99999999,99999999 };
		num = A.addall(arr2);
		System.out.println("����3��Ϊ��" + num);
   	}
}