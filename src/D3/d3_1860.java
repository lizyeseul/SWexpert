package D3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class d3_1860 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ys0star\\eclipse-workspace\\SWexpert\\src\\D3/input.txt"));
        //BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=null;
		int T;
		T=Integer.parseInt(br.readLine());
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int result=0;
			
            //input
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
            
            //output
			System.out.println("#"+test_case+" "+star(p,q));
		}
	}
	public static int star(int a, int b) {
		int[] p1 = amp(a);
		int[] p2 = amp(b);
		return sharp(p1[0]+p2[0], p1[1]+p2[1]);
	}
	public static int[] amp(int n) {
		int sum, s= 0;
		for(sum = 2; sum<=30000; sum++) {
			s = sum*(sum-1)/2;
			if(n <= s)	break;
		}
		int y = s-n+1;
		return new int[]{sum-y, y};
	}
	public static int sharp(int x, int y) {
		return ((x+y)*(x+y-1)/2)+1-y;
	}
}
