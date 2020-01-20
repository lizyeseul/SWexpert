package D3;

import java.util.Scanner;

public class d3_1209 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=1;
		//T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int result=0;
			
            //input
			int m = 100;
			int casee = sc.nextInt();
            char[][] entire = new char[m][m];
            for(int i=0; i<m; i++) {
                String temp = sc.next();
                entire[i] = temp.toCharArray();
            }
             
            //calculate
            for(int i=0; i<m; i++) {                
                String h = "", v = "";
            	for(int j=0; j<m; j++) {
            		h += entire[i][j];
                	v += entire[j][i];
            	}
            	int temp = max(solution(h), solution(v));
                if(result < temp) {
                	result = temp;
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
	public static int solution(String s) {
		String updateString = getUpdateString(s);
		int answer =0 ;
		int p[] = new int[updateString.length()];
		int c=0,r=0; //center, rightBounday
		
		for(int i = 1; i< updateString.length() ; i++) {
			//String 순회
			int mirror = 2*c - i;
			
			if(i < r)
				p[i] = Math.min(r-i, p[mirror]);
			
			int left = i-(1+p[i]);
			int right = i+(1+p[i]);
			while(right < updateString.length() && left >= 0 && updateString.charAt(left) == updateString.charAt(right) ) {
				left--;
				right++;
				p[i]++; 
			}
			
			if(i+ p[i] > r) {
				//rightBoundary를 넘었을 경우
				c = i; //center 갱신
				r = i + p[i]; //right boundary 갱신
				
				answer = Math.max(p[i],answer);
			}
		}
		
		
		return answer;
		
	}
	private static String getUpdateString(String s) {
		StringBuilder sb  =new StringBuilder(s);
		for(int i =0 ; i< s.length() ; i++) {
			sb.insert(i+(i+1), '#');
		}
		sb.insert(0, '#');
		
		return sb.toString();
	}

}
