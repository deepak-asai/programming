package dynamicProgramming;

public class LongestIncreasingSubseq {
	int arr[] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
	int count[] = new int[16];
	int n= 16;
	
	void find(){
		for ( int i = 0; i < n; i++ ) 
            count[i] = 1; 
		for(int i= 1; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(arr[j] < arr[i] && count[i] < count[j] + 1) {
					count[i] = count[j] + 1;
				}
			}
		}
		
		for(int x=0; x<n; x++) {
			System.out.print(count[x] + ", ");
		}
	}
	
	public static void main(String[] args) {
		LongestIncreasingSubseq l = new LongestIncreasingSubseq();
		l.find();
	}
	
}
