package codeForces_800;

import java.util.Scanner;

public class PetyaAndStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//112A
		Scanner sc=new Scanner(System.in);
		String firstStr=sc.nextLine();
		String secondStr=sc.nextLine();
		int len1=firstStr.length();
		int len2=secondStr.length();
		firstStr=firstStr.toLowerCase();
		secondStr=secondStr.toLowerCase();
		if(firstStr.equals(secondStr)) {
			System.out.println(0);
		}
		
		else {
			for(int i=0;i<Math.min(len1,len2);i++) {
				if((int)firstStr.charAt(i)<(int)secondStr.charAt(i)) {
					System.out.println(-1);;
					break;
				}
				if((int)firstStr.charAt(i)>(int)secondStr.charAt(i)) {
					System.out.println(1);;
					break;
				}
			}
		}
		
		
		
		sc.close();
	}

}
