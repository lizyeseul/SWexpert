package Contest;

import java.util.Scanner;

public class contest_d2_2357 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			String n = sc.next();

			if(n.contains("9"))
				System.out.println("#"+test_case+" Yes");
			else
				System.out.println("#"+test_case+" No");
		}
	}
}
