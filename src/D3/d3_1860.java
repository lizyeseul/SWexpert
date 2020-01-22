package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class d3_1860 {
	public static void main(String[] args) throws IOException {
		
		

		System.out.println("start");
		int arr[] = {3,1,2,5,4};
		arr = partition(arr, 0, 4);
		
		for(int k=0; k<5; k++) {
			System.out.print(arr[k]+" ");
		}
		
		
		System.out.println("end");
		
		
		/*
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
		}*/
	}
	public static int[] partition(int[] arr, int left, int right) {
		if(left>=right) {
			return arr;
		}
		int middle = (right+left)/2;
		arr = partition(arr, left, middle);
		arr = partition(arr, middle+1, right);
		arr = MergeSort(arr, left, middle, right);
		

		for(int k=0; k<5; k++) {
			System.out.print(arr[k]+" ");
		}
		System.out.println();
		
		return arr;
	}
	public static int[] MergeSort(int[] arr, int left, int middle, int right) {
		int[] temp = new int[right-left+1];
	
		int lIndex=left, rIndex=middle+1;
		for(int i=left; i<=right; i++) {
			//1 2 4   3 5
			boolean max = (arr[lIndex]<arr[rIndex])?true:false;
			if(max == true) {//left
				int count=0;
				while(arr[lIndex]<arr[rIndex] && (lIndex+count)<middle) {
					count++;
				}
				for(int j=i; j<i+count; j++) {
					temp[j] = arr[lIndex];
					lIndex++;
				}
				i += count;
			} else  {//left
				int count=0;
				while(arr[rIndex]<arr[lIndex] && (rIndex+count)<right) {
					count++;
				}
				for(int j=i; j<i+count; j++) {
					temp[j] = arr[rIndex];
					rIndex++;
				}
				i += count;
			}
		}
		
		for(int i=left; i<=right; i++) {
			arr[i] = temp[i-left];
		}
		
		return arr;
	}
}
