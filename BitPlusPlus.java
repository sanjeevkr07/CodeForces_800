package codeForces_800;

import java.util.Scanner;

public class BitPlusPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		int val=0;
		while(t>0) {
			String op=sc.nextLine();
			if(op.equals("X++") || op.equals("++X"))
				val++;
			if(op.equals("X--") || op.equals("--X"))
				val--;
			
			t--;
			
		}
		System.out.println(val);
		sc.close();

	}

}
