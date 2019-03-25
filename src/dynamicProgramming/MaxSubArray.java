package dynamicProgramming;

public class MaxSubArray {

//	int arr[] = {-2,-3,4,-1,-2,1,5,-3};
//	int n = 8;
	
	int arr[] = {-5, -4, -3, -2};
	int n = 4;
	void kadane() {
		int sum = 0;
		
		int dp[] = new int[n];
		for(int i=0; i<n; i++) {
			dp[i] = 0;
		}
		dp[0] = arr[0];
		for(int i = 1; i<n; i++) {
			int max = Math.max(dp[i-1] + arr[i], arr[i]);
			dp[i] = max;
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(dp[i]);
		}
	}
	
	public static void main(String[] args) {
		MaxSubArray m = new MaxSubArray();
		m.kadane();
	}
}
