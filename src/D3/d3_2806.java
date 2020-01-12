package D3;

import java.util.Scanner;

public class d3_2806 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int result=0;
			
			//input
			int n=sc.nextInt();
			
			//calculate
			boolean[][] chess= new boolean[n][n];
			result = nextQ(n, 0, chess, 0);
			
			//output
			System.out.print("#"+test_case);
			System.out.println(" "+result);
		}
	}
	public static int nextQ(int n, int depth, boolean[][] chess, int count) {
		if(depth == n-1){
			for(int w = 0; w < n; w++) {
				if(isQueen(chess, n, depth, w) == false) {
					count ++;
				}
			}
			return count;
		}
		
		for(int w = 0; w < n; w++) {
			if(isQueen(chess, n, depth, w) == false) {
				chess[depth][w] = true;
				count = nextQ(n, depth+1, chess, count);
			}
			chess[depth][w] = false;
		}
		return count;
	}
	public static boolean isQueen(boolean[][] chess, int n, int x, int y) {
		for(int i=0; i<n; i++) {
			if(chess[x][i] == true || chess[i][y] == true)//가로, 세로
				return true;
			if(x-(i+1) >=0 && y-(i+1)>= 0 && chess[x-(i+1)][y-(i+1)] == true)//왼쪽위 대각선
				return true;
			if(x-(i+1) >=0 && y+(i+1) < n && chess[x-(i+1)][y+(i+1)] == true)//오른쪽 위 대각선
				return true;
		}
		return false;
	}
}
