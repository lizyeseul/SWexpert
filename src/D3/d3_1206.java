package D3;

import java.util.Scanner;

public class d3_1206 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=10;
//		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int result=0;
			
			//input
			int building = sc.nextInt();
			int height[] = new int[building];
			for(int i=0; i<building; i++) {
				height[i] = sc.nextInt();
			}
			//calculate
			int[] view= new int[building];
			for(int i=0; i<building-2; i++) {
				int tempMax = max(height[i], height[i+1]);
				if(tempMax < height[i+2]) {
					view[i+2] = height[i+2]-tempMax;
				} else {
					view[i+2] = -1;
				}
				
				if(view[i] > 0) {
					int tempLeft = view[i];
					tempMax = max(height[i+1], height[i+2]);
					if(tempMax < height[i]) {
						int tempRight = height[i]-tempMax;
						result += min(tempLeft, tempRight);
					}
				}
			}
			
			//output
			System.out.print("#"+test_case);
			System.out.println(" "+result);
		}
	}
	public static int max(int a, int b) {
		if(a>b) return a;
		else return b;
	}

	public static int min(int a, int b) {
		if(b>a) return a;
		else return b;
	}
}
