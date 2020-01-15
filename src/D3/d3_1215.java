package D3;

import java.util.Scanner;

public class d3_1215 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=1;
		//T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int result=0;
			
			//input
			int n = sc.nextInt();
			char[][] entire = new char[8][8];
			for(int i=0; i<8; i++) {
				String temp = sc.next();
				entire[i] = temp.toCharArray();
			}
			
			//calculate
			for(int i=0; i<8; i++) {
				String tempH="";
				String tempV="";
				for(int j=0; j<n; j++) {
					tempH += entire[i][j];
					tempV += entire[j][i];
				}
				
				if(isPal(n,tempH)==true)
					result++;
				if(isPal(n,tempV)==true)
					result++;
				
				for(int j=1; j<=8-n; j++) {
					tempH = tempH.substring(1);
					tempH += entire[i][j+n-1];
					if(isPal(n,tempH)==true)
						result++;
					
					tempV = tempV.substring(1);
					tempV += entire[j+n-1][i];
					if(isPal(n,tempV)==true)
						result++;
				}
			}
			
			//output
			System.out.print("#"+test_case);
			System.out.println(" "+result);
		}
	}
	public static boolean isPal(int n, String arr) {
		for(int k=0; k<=n/2; k++) {
			if(arr.charAt(k) != arr.charAt(n-k-1)) {
				return false;
			}
		}
		return true;
	}
}
