package D3;

import java.util.Scanner;

public class d3_1216 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=1;
		//T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int result=0;
            
            //input
			int casee = sc.nextInt();
            char[][] entire = new char[100][100];
            for(int i=0; i<8; i++) {
                String temp = sc.next();
                entire[i] = temp.toCharArray();
            }
             
            //calculate
            for(int i=0; i<100; i++) {
            	for(int j=0; j<100; j++) {
                	//È¦¼öÀÎ °æ¿ì
                	int tempH1 = 1, tempV1 = 1;
                	int l = j-1, r=j+1;
                	while(l>=0 && r<100) {
                		if(tempH1 > 0 && entire[i][l] != entire[i][r]) {
                			if(tempH1 > result) {
                        		result = tempH1;
                        		System.out.println(result+": È¦, °¡·Î"+i+" "+j);
                        	}
                			tempH1 = -1;
                		} else if(tempH1 > 0 && entire[i][l] == entire[i][r]) {
                			tempH1 += 2;
                		}
                		if(tempV1 > 0 && entire[l][i] != entire[r][i]) {
                			if(tempV1 > result) {
                        		result = tempV1;
                        		System.out.println(result+": È¦, ¼¼·Î"+i+" "+j);
                        	}
                			tempV1 = -1;
                		} else if(tempV1 > 0 && entire[l][i] == entire[r][i]) {
                			tempV1 += 2;
                		}
                		l--; r++;
                	}
                	//Â¦¼öÀÎ °æ¿ì
            		if(j<99) {
            			if(entire[i][j] == entire[i][j+1]) {
            				int tempH2 = 2;
                        	l = j-1; r=j+2;
                        	while(l>=0 && r<100) {
                        		if(entire[i][l] != entire[i][r]) {
                        			break;
                        		}
                        		tempH2 += 2;
                        		l--; r++;
                        	}
                        	if(tempH2 > result) {
                        		result = tempH2;
                        		System.out.println(result+": Â¦, °¡·Î"+i+" "+j);
                        	}
            			}
            			if(entire[j][i] == entire[j+1][i]) {
            				int tempV2 = 2;
                        	l = j-1; r=j+2;
                        	while(l>=0 && r<100) {
                        		if(entire[l][i] != entire[r][i]) {
                        			break;
                        		}
                        		tempV2 += 2;
                        		l--; r++;
                        	}
                        	if(tempV2 > result) {
                        		result = tempV2;
                        		System.out.println(result+": Â¦, ¼¼·Î"+i+" "+j);
                        	}
            			}
            		}
                	
            	}
            }
             
            //output
            System.out.print("#"+test_case);
            System.out.println(" "+result);
		}
	}
}
