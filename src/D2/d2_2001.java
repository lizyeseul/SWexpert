


package D2;

import java.util.Scanner;

public class d2_2001 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int result=0;
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			//input
			int[][] pari = new int[n][n];
			pari[0][0] = sc.nextInt();
			for(int i=1; i<n*n; i++) {
				pari[i/n][i%n] = sc.nextInt();
			}
			
			//calculate
			int max =0;
			for(int i=0; i<=n-m; i++) {
				for(int j=0; j<=n-m; j++) {
					//sum
					if(j==0) {
						max=0;
						for(int h=i; h<m+i; h++) {
							for(int w=0; w<m; w++) {
								max+=pari[h][w];
							}
						}
					}else {
						for(int h=i; h<i+m; h++) {
							max -= pari[h][j-1];
							max += pari[h][j+m-1];
						}
					}
					if(max > result) {
						result = max;
					}
				}
			}
			

			//output
			System.out.print("#"+test_case);
			System.out.println(" "+result);
		}
	}
}
