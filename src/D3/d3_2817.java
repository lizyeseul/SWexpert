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
			
			
			//output
			System.out.print("#"+test_case);
			System.out.println(" "+result);
		}
	}
	
}
