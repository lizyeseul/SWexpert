package D3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class d3_1493 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ys0star\\eclipse-workspace\\SWexpert\\src\\D3/input2.txt"));
        //BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=null;
		int T;
		T=Integer.parseInt(br.readLine());
		
		for(int test_case = 1; test_case <= T; test_case++) {
			//int result=0;
			boolean flag = true;
			
            //input
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
        	ArrayList<Integer> people = new ArrayList<>();

			st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++) {
            	people.add(Integer.parseInt(st.nextToken()));
            }
            
            Collections.sort(people);
            int index = 0;
            while(index<people.size()) {
            	int time = people.get(index);
            	int bread = (time/m)*k - (index+1);
            	if(bread<0) {
            		flag = false;
            		break;
            	}
            	index++;
            }
            //output
            if(flag == true)
                System.out.println("#"+test_case+" Possible");
            else
                System.out.println("#"+test_case+" Impossible");
		}
	}
	/*
	public static int[] partition(int[] arr, int left, int right) {
		if(left>=right)
			return arr;
		int middle = (right+left)/2;
		arr = partition(arr, left, middle);
		arr = partition(arr, middle+1, right);
		arr = MergeSort(arr, left, middle, right);
		return arr;
	}
	public static int[] MergeSort(int[] arr, int left, int middle, int right) {
		int[] temp = arr.clone();
		
		int lIndex=left, rIndex=middle+1;
		for(int i=left; i<=right; i++) {
			if(rIndex >= 0 && lIndex >= 0) {
				if(arr[lIndex]<arr[rIndex]) {//left
					temp[i] = arr[lIndex];
					if(lIndex == middle)	lIndex=-1;
					else					lIndex++;
				} else {//right
					temp[i] = arr[rIndex];
					if(rIndex == right)		rIndex=-1;
					else					rIndex++;
				}
			} else if(rIndex == -1) {
				temp[i] = arr[lIndex];
				lIndex ++;
			} else if(lIndex == -1) {
				temp[i] = arr[rIndex];
				rIndex ++;
			}
		}
		return temp;
	}*/
}
