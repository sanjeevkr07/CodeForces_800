package codeForces_800;

import java.util.Scanner;

public class Watermelon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4A
		
		
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();
		if(w>3 && w%2==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		sc.close();

	}

}
