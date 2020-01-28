package D4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.function.Consumer;

public class d4_3752 {
	static HashSet<Integer> map = new HashSet<Integer>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ys0star\\eclipse-workspace\\SWexpert\\src/input.txt"));
//        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=null;
		int T=Integer.parseInt(br.readLine());
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[n];
        	for(int i=0; i<n; i++) {
        		arr[i] = Integer.parseInt(st.nextToken());
        	}
        	for(int i=0; i<n; i++) {
        		HashSet<Integer> temp = (HashSet<Integer>) map.clone();
        		for(int e : temp) {
        			map.add(arr[i]+e);
        		}
    			map.add(arr[i]);
        	}
            System.out.println("#"+test_case+" "+(map.size()+1));
            map.clear();
		}
	}
	public static int[] sort(int[] arr) {
		int[] temp = new int[100];
		for(int i=0; i<arr.length; i++)
			temp[arr[i]-1]++;
		int index=0;
		for(int i=0; i<arr.length; i++) {
			while(temp[i]>0) {
				arr[index++] = i+1;
				temp[i]--;
			}
		}
		return arr;
	}
}
