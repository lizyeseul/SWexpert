package D3;

import java.util.Scanner;

public class d3_1215 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int result=0;
			
			//input
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] node = new int[n][n];
			for(int i=0; i<m; i++) {
				int start = sc.nextInt()-1;
				int end = sc.nextInt()-1;
				node[start][end]++;
				node[end][start]++;
			}
			
			//calculate
			boolean[] check = new boolean[n];
			
			for(int i=0; i<n; i++) {
				int max = Longest(node, n, i, check);
				if(max>result)
					result = max;
			}
			
			//output
			System.out.print("#"+test_case);
			System.out.println(" "+result);
		}
	}
	public static int Longest(int[][] node, int n, int start, boolean check[]) {
		check[start] = true;
		
		int tempMax = 0;
		boolean flag = false;
		for(int j=0; j<n; j++) {
			if(check[j] == true)
				continue;
			
			if(node[start][j] > 0) {
				flag = true;
				check[j] = true;
				
				int temp = Longest(node, n, j, check);
				if(temp > tempMax)
					tempMax = temp;
			}
			check[j] = false;
		}
		if(flag == false) {
			return 1;
		}
		return tempMax+1;
	}
}
