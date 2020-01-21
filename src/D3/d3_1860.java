package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class d3_1860 {
	public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=null;
		int T;
		T=br.read();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int result=0;
			boolean flag = true;
			
            //input
			int n = br.read();
			int m = br.read();
			int k = br.read();
        	int[] people = new int[n];
        	
            for(int i=0; i<n; i++) {
            	people[i] = br.read();
            	if(people[i] < k) {
            		flag = false;
            	}
            }
            
            //calculation
            if(flag == true) {
            	
            }
            
            //output
            if(flag == true) {
                System.out.println("#"+test_case+" Possible");
            }
            else {
                System.out.println("#"+test_case+" Impossible");
            }
		}
	}
}
