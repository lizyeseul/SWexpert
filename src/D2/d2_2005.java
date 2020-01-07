package D2;

import java.util.Scanner;

public class d2_2005 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int result;
			int n = sc.nextInt();

			System.out.println("#"+test_case);
			
			int[][] tri = new int[n][n];
			tri[0][0] = 1;
			System.out.println(tri[0][0]);
			for(int i=1; i<n; i++) {
				for(int j=0; j<=i; j++) {
					if(j==0) {
						tri[i][j] = 1;
						System.out.print(tri[i][j]+" ");
					} else if(j==i){
						tri[i][j] = 1;
						System.out.print(tri[i][j]+" ");
					} else {
						tri[i][j] = tri[i-1][j-1]+tri[i-1][j];
						System.out.print(tri[i][j]+" ");
					}
				}
				System.out.println();
			}
			
		}
	}
}
