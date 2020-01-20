package D3;

import java.util.Scanner;

public class d3_1216 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=10;
		//T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int result=0;
			
            //input
			int casee = sc.nextInt();
            int[][] entire = new int[100][100];
            for(int i=0; i<100; i++) {
            	for(int j=0; j<100; j++) {
            		entire[i][j] = sc.nextInt();
            	}
            }
             
            //calculate
            int toRight = 0, toLeft = 0 ;
            int[] ver = new int[100];
            for(int i=0; i<100; i++) {
            	int hor = 0;
            	for(int j=0; j<100; j++) {
            		hor += entire[i][j];
            		ver[j] += entire[i][j];
            		toRight += (i==j)?entire[i][j]:0;
            		toLeft += (i==(99-j))?entire[i][j]:0;
            	}
            	result = (result<hor)?hor:result;
            }
        	result = (result<toRight)?toRight:result;
        	result = (result<toLeft)?toLeft:result;
        	for(int i=0; i<100; i++) {
            	result = (result<ver[i])?ver[i]:result;        		
        	}
            
            
            //output
            System.out.print("#"+test_case);
            System.out.println(" "+result);
		}
	}
}
