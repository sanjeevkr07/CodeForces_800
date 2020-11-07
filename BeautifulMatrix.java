package codeForces_800;

import java.util.Scanner;

public class BeautifulMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//263A
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[5][5];
		int x=0,y=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j]=sc.nextInt();
				if(arr[i][j]==1) {
					x=i+1;
					y=j+1;
				}
			}
		}
		System.out.println(Math.abs(3-x)+Math.abs(3-y));
		sc.close();

	}

}
