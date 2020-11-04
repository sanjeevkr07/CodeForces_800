package codeForces_800;

import java.util.Scanner;

public class Team {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//231A
		int count=0;
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			int countT=0;
			int[] arr=new int[3];
			for(int i=0;i<3;i++) {
				arr[i]=sc.nextInt();
				if(arr[i]==1)
					countT++;
			}
			if(countT>=2)
				count++;
				
			
			t--;
		}
		System.out.println(count);
		sc.close();

	}
	

}
