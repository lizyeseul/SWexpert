package D3;

import java.util.Scanner;

public class d3_1244 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int result=0;
			
			//input
			String numbers = sc.next();
			int swapCount = sc.nextInt();
			
			//calculate
			int sort = 0;
			while(swapCount>0) {
				if(isSort(numbers) == true) {
					break;
				}
				int[] findM = max(numbers, sort);
				int maxIndex = findM[1];
				int count = findM[2];
				int minIndex = minindex(numbers, count, sort);
				while(minIndex == maxIndex) {
					sort++;
					findM = max(numbers, sort);
					maxIndex = findM[1];
					count = findM[2];
					minIndex = minindex(numbers, count, sort);
				}
				if(minIndex == sort)	sort++;
				System.out.println("max: "+maxIndex+", min: "+minIndex+", count: "+count);

				System.out.print(numbers+"->");
				char temp = numbers.charAt(maxIndex);
				numbers = numbers.substring(0,maxIndex)+numbers.charAt(minIndex)+numbers.substring(maxIndex+1);
				numbers = numbers.substring(0,minIndex)+temp+numbers.substring(minIndex+1);
				System.out.println(numbers);
				swapCount--;
			}
			if(swapCount != 0) {
				if(swapCount %2==1) {
					if(isSame(numbers) == false) {
						//System.out.print(numbers+"->");
						char temp = numbers.charAt(numbers.length()-1);
						numbers = numbers.substring(0,numbers.length()-1)+numbers.charAt(numbers.length()-2)+numbers.substring(numbers.length());
						numbers = numbers.substring(0,numbers.length()-2)+temp+numbers.substring(numbers.length()-1);
						//System.out.println(numbers);
					}
				}
			}
			
			//output
			System.out.print("#"+test_case);
			System.out.println(" "+numbers);
		}
	}
	public static int[] max(String a, int sort) {
		int[] result = {0,0,1};
		for(int k=a.length()-1; k>=sort; k--) {
			if(a.charAt(k)>(int)result[0]) {
				result[0] = a.charAt(k);
				result[1] = k;
				result[2] = 1;
			} else if(a.charAt(k)==(int)result[0]) {
				result[2]++;
			}
		}
		return result;
	}
	public static int minindex(String a, int count, int i) {
		int result=i;
		for(int k=i+1; k<a.length(); k++) {
			count--;
			if(count==0) {
				return result;
			}
			if(a.charAt(k)<a.charAt(result)) {
				result = k;
			}
		}
		return result;
	}
	public static boolean isSort(String a) {
		for(int l=a.length()-1; l>0; l--) {
			if(a.charAt(l-1) < a.charAt(l))
				return false;
		}
		return true;
	}
	public static boolean isSame(String a) {
		for(int m=0; m<a.length()-1; m++) {
			if(a.charAt(m) == a.charAt(m+1))
				return true;
		}
		return false;
	}
}
