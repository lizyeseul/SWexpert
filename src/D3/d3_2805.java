package D3;

import java.util.Scanner;

public class d3_2805 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int result=0;
			
			//input
			int n = sc.nextInt();
			String[] farm = new String[n];
			for(int i=0; i<n; i++) {
				farm[i] = sc.next();
			}
			
			//calculate
			int k=n/2;
			for(int i=0; i<k; i++) {
				for(int j=k-i; j<n-k+i; j++) {
					result += (int)farm[i].charAt(j)-48;
				}
			}
			int i= k;
			for(int j=0; j<n; j++) {
				result += (int)farm[i].charAt(j)-48;
			}
			for(i=k+1; i<n; i++) {
				for(int j=i-k; j<n-i+k; j++) {
					result += (int)farm[i].charAt(j)-48;
				}
			}
			
			//output
			System.out.print("#"+test_case);
			System.out.println(" "+result);
		}
	}
}
