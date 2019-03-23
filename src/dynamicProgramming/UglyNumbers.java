package dynamicProgramming;

public class UglyNumbers {
	
	int minimum(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}
	void findNthUglyNumber (int n) {
		
		int[] ugly = new int[n];
		
		ugly[0] = 1;
		int i2 = 0;
		int i3 = 0;
		int i5 = 0;
		
		int next_mul_2 = 2;
		int next_mul_3 = 3;
		int next_mul_5 = 5;
		
		for(int i = 1; i< n; i++) {
			
			int min = minimum(next_mul_2, next_mul_3, next_mul_5);
			ugly[i] = min;
			if(min == next_mul_2) {
				i2++;
				next_mul_2 = ugly[i2] * 2;
			}
			if(min == next_mul_3) {
				i3++;
				next_mul_3 = ugly[i3] * 3;
			}
			if(min == next_mul_5) {
				i5++;
				next_mul_5 = ugly[i5] * 5;
			}
		}
		
		for(int i = 0; i< n; i++) {
			System.out.println(ugly[i]);
		}
		
	}
	public static void main(String[] args) {
		UglyNumbers u = new UglyNumbers();
		u.findNthUglyNumber(15);
	}
}
