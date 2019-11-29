package sort;

import org.apache.commons.math3.analysis.function.Add;
import org.apache.commons.math3.analysis.function.Subtract;
import org.apache.commons.math3.analysis.function.Max;
import org.apache.commons.math3.analysis.function.Min;

class Sort {
	Max Ma = new Max();
	public double[] sort(double arr[]) {
		for (int i = 1; i < arr.length; i ++) {
			boolean flag = true;
			for (int j = 0; j < arr.length - i; j ++) {
				double num = Ma.value(arr[j], arr[j+1]); 
				if (num == arr[j]) {
					arr[j] = arr[j+1];
					arr[j+1] = num;
					flag = false;
				}
			}
			if (flag) {
				break;
			}
		}
		return arr;
	}
}

class Addall {
	Add A = new Add();
	double num = 0;
	public double addall(double arr[]) {
		for (int i = 0; i < arr.length; i ++) {
			num = A.value(num, arr[i]);
		}
		return num;
	}
}

class getSub { 
	Subtract S = new Subtract();
	double GetSub(double x, double y) {
		double num = S.value(x, y);
        return num;
	}
}
	
class GetMin {
	Min Mi = new Min();
	double num = 999999;
	public double getMin(double arr[]) {
		for (int i = 0; i < arr.length; i ++) {
			num = Mi.value(num, arr[i]);
			}
		return num;
	}
}



