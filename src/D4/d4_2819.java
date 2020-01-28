package D4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class d4_2819 {
	static char[][] arr = new char[4][4];
	static HashSet<String> map = new HashSet<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ys0star\\eclipse-workspace\\SWexpert\\src/input.txt"));
//        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=null;
		int T=Integer.parseInt(br.readLine());
		
		for(int test_case = 1; test_case <= T; test_case++) {
        	for(int i=0; i<4; i++) {
        		st = new StringTokenizer(br.readLine());
        		for(int j=0; j<4; j++) {
            		arr[i][j] = st.nextToken().charAt(0);
        		}
        	}
        	for(int i=0; i<4; i++) {
        		for(int j=0; j<4; j++) {
                	count("", i,j);
        		}
        	}
            System.out.println("#"+test_case+" "+map.size());
		}
	}
	public static void count(String line, int x, int y) {
		if(line.length() == 7) {
			if(!map.contains(line))
				System.out.println(line);
			map.add(line);
			return;
		}
		//System.out.println(x+" x : y "+y);
		
		line += arr[x][y];
		
		if(x>0)
			count(line, x-1, y);
		if(y>0)
			count(line, x, y-1);
		if(y<3)
			count(line, x, y+1);
		if(x<3)
			count(line, x+1, y);
			
		line = line.substring(0, line.length()-1);
		
		return;
	}
}
