package D3;

import java.util.Scanner;

public class d3_2817 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int result=0;
			
			//input
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			
			//calculate
			boolean[] flag = new boolean[n];
			result = sumNum(arr, k, 0, 0, 0);
			
			//output
			System.out.print("#"+test_case);
			System.out.println(" "+result);
		}
	}
	public static int sumNum(int arr[], int k, int count, int index, int total) {
		if(index >= arr.length)
			return count;
		
		if(total+arr[index] == k) {
			count++;
		}
		
		count = sumNum(arr, k, count, index+1, total);
		if(total+arr[index] < k) {
			count = sumNum(arr, k, count, index+1, total+arr[index]);
		}
		return count;
	}
}
