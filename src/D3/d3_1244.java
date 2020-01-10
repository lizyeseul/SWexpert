package D3;

import java.util.Scanner;

public class d3_1244 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int result=0;
			
			//input
			String numbers = sc.next();
			int swapCount = sc.nextInt();
			
			//calculate
			for(int i=0; i<swapCount; i++) {
				int[] findM = max(numbers);
				int maxIndex = findM[1];
				int count = findM[2];
				int minIndex = minindex(numbers, count);
				
				char temp = numbers.charAt(maxIndex);
				numbers = 
			}
			
			//output
			System.out.print("#"+test_case);
			System.out.println(" "+result);
		}
	}
	public static int[] max(String a) {
		int[] result = {0,0,1};
		for(int k=a.length(); k>=0; k--) {
			if(a.charAt(k)>result[0]) {
				result[0] = a.charAt(k);
				result[1] = k;
				result[2] = 1;
			} else if(a.charAt(k)==result[0]) {
				result[2]++;
			}
		}
		return result;
	}
	public static int minindex(String a, int count) {
		int result=0;
		for(int k=1; k>=a.length(); k++) {
			count--;
			if(count==0) {
				return result;
			}
			
			if(a.charAt(k)<a.charAt(result)) {
				result = k;
			}
			
		}
		return result;
	}
}
