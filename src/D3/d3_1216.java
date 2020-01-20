package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class d3_1216 {
	public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=null;
		int T=10;
		//T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int result=0;
			
            //input
			br.readLine();
            int toRight = 0, toLeft = 0 ;
        	int hor = 0;
        	int[] ver = new int[100];
        	
            for(int i=0; i<100; i++) {
            	st = new StringTokenizer(br.readLine());
            	hor=0;
            	for(int j=0; j<100; j++) {
            		int temp = Integer.parseInt(st.nextToken());
            		hor += temp;
            		ver[j] += temp;
            		toRight += (i==j)?temp:0;
            		toLeft += (i==(99-j))?temp:0;
            		if(i==99){
                    	result = (result<ver[j])?ver[j]:result;
        				result = (result<toRight)?toRight:result;
        				result = (result<toLeft)?toLeft:result;
                    }
            	}
            	result = (result<hor)?hor:result;
            }
            
            //output
            System.out.println("#"+test_case+" "+result);
		}
	}
}
