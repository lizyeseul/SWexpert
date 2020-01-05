package D2;
import java.util.Scanner;

public class d2_1926 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();

		for(int i = 1; i <= n; i++)
		{
			int clap = 0;
			String num = Integer.toString(i);
			for(int k=0; k<num.length(); k++) {
				char c = num.charAt(k);
				if(c == '3' || c == '6' || c == '9') {
					clap++;
				}
			}
			if(clap == 0) {
				System.out.print(i+" ");
			}
			else {
				for(int j=0; j<clap; j++) {
					System.out.print("-");
				}
				System.out.print(" ");
			}
		}
	}
}
