package D2;

import java.util.Scanner;

public class d2_2007 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			String word = sc.next();
			String pat = "";
			
			for(int i=2; i<word.length(); i+=2) {
				//System.out.println(word.substring(0, i/2)+"/"+word.substring(0, i));
				if(word.substring(0, i/2).equals(word.substring(i/2, i))) {
					pat=word.substring(0, i/2);
					break;
				}
			}
			System.out.println("#"+test_case+" "+pat.length());
		}
	}
}
