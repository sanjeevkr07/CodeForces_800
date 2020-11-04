package codeForces_800;

import java.util.Scanner;

public class NextRound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//158A
		Scanner sc =new Scanner(System.in);
		int count=0;
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int kthValue=arr[k-1];
		
		for(int i=0;i<n;i++) {
			if(arr[i]>0 && arr[i]>=kthValue)
				count++;
		}
		System.out.println(count);
		
		sc.close();

	}

}
