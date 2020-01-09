


package D2;

import java.util.Scanner;

public class d2_1989 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int result=1;
			
			//input
			String str = sc.next();
			
			//calculate
			int len = str.length();
			int middle = len/2;
			for(int i=0; i<middle; i++) {
				if(str.charAt(i) != str.charAt(len-1-i)) {
					result = 0;
					break;
				}
			}
			
			//output
			System.out.print("#"+test_case);
			System.out.println(" "+result);
		}
	}
}
