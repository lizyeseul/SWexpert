package D2;

import java.util.Scanner;

public class d2_1859 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int day = sc.nextInt();
			int price[] = new int[day];
			for(int i=0; i<day; i++) {
				price[i] = sc.nextInt();
			}
			
			long total = 0L;
			int curM = price[day-1];
			for(int i=day-2; i>=0; i--) {
				if(curM>price[i]) {
					total += (long)curM-price[i];
				}else {
					curM = price[i];
				}
			}
			System.out.println("#"+test_case+" "+total);
		}
	}

}
