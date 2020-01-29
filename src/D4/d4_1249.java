package D4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.function.Consumer;

public class d4_1249 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ys0star\\eclipse-workspace\\SWexpert\\src/input.txt"));
//        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=null;
		int T=Integer.parseInt(br.readLine());
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[n+1][n+1];
			int[][] cost = new int[n+1][n+1];
        	for(int i=1; i<=n; i++) {
    			st = new StringTokenizer(br.readLine());
        		for(int j=1; j<=n; j++) {
            		arr[i][j] = Integer.parseInt(st.nextToken());
            		cost[i][j] = ((arr[i-1][j] < arr[i][j-1])?arr[i-1][j]:arr[i][j-1]) + arr[i][j];
        		}
        	}
            System.out.println("#"+test_case+" "+cost[n][n]);
		}
	}
}
