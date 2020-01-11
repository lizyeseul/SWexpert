package D3;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class d3_1208 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=1;
		//T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int result=0;
			
			//input
			int count = sc.nextInt();
			Hashtable<Integer, ArrayList<Integer>> height = new Hashtable<Integer, ArrayList<Integer>>();
			for(int i=1; i<=100; i++) {
				int h = sc.nextInt();
				ArrayList<Integer> temp = new ArrayList<>();
				if(height.get(h) != null)
				{
					temp = height.get(h);
				}
				temp.add(i);
				height.put(h, temp);
			}
			
			//calculate
			int high = 100, low = 1;
			while(height.get(high) == null || height.get(high).size() == 0)	high--;
			while(height.get(low) == null || height.get(low).size() == 0)	low++;
			if(high<=low) break;
			while(count>0) {
				
				/*
				 * System.out.println("h: "+high+", l: "+low);
				 * System.out.println(height.get(high)+":h l:"+height.get(low));
				 * System.out.println(height.get(high-1)+":h l:"+height.get(low+1));
				 */
				 		
				
				ArrayList<Integer> curH = height.get(high);
				ArrayList<Integer> curL = height.get(low);
				ArrayList<Integer> nextH = height.get(high-1);
				ArrayList<Integer> nextL = height.get(low+1);
				
				if(nextH == null)	nextH = new ArrayList<Integer>();
				if(nextL == null)	nextL = new ArrayList<Integer>();
				nextH.add(curH.get(0));
				nextL.add(curL.get(0));
				curH.remove(0);
				curL.remove(0);
				
				height.put(high, curH);
				height.put(high-1, nextH);
				height.put(low, curL);
				height.put(low+1, nextL);
				count--;
				while(height.get(high) == null || height.get(high).size() == 0)	high--;
				while(height.get(low) == null || height.get(low).size() == 0)	low++;
				if(high<=low) break;
			}
			result = high-low;
			
			//output
			System.out.print("#"+test_case);
			System.out.println(" "+result);
		}
	}
	
}
