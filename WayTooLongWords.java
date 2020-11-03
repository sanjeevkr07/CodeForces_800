package codeForces_800;

import java.util.Scanner;

public class WayTooLongWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//71A
		
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t>0) {
			String word=sc.nextLine();
			int len=word.length();
			if(len<=10) {
				System.out.println(word);
			}
			else {
				String nw=word.substring(0,1)+(len-2)+word.substring(len-1,len);
				System.out.println(nw);
			}
			t--;
			
		}
		
		
		
		
		sc.close();
		

	}

}
