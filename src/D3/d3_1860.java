package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class d3_1860 {
	public static void main(String[] args) throws IOException {
		
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=null;
		int T=1;
		//T=br.read();
		
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
	public static int[] partition(int[] arr, int left, int right) {
		if(left>=right) {
			return arr;
		}
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
					if(lIndex == middle)
						lIndex=-1;
					else
						lIndex++;
				} else {//right
					temp[i] = arr[rIndex];
					if(rIndex == right)
						rIndex=-1;
					else
						rIndex++;
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
	}
}
