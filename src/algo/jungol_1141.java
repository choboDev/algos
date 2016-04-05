package algo;

import java.util.Scanner;

public class jungol_1141 {

	//정올-알고리즘-1141. 불쾌한 날
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		
		int[] cowKi=new int[n];
		int[] see=new int[n];
		
		for(int i=0;i<n;i++){
			cowKi[i]=scan.nextInt();
		}
		
		int count=0;
		System.out.println("n:"+n);
		for(int ki : cowKi){
			count++;
			System.out.println(count+" : "+ki);
		}
		
		for(int i=0;i<n-1;i++){
			for(int k=i+1;k<n;k++){
				if(cowKi[i]<=cowKi[k])
					break;
				else{
					for(int j=i+1;j<k;j++){
							see[i]++;
					}				
				}
			}
		}
		
		
		System.out.println("n:"+n);
		for(int ki : see){
			count++;
			System.out.println(ki);
		}

	}

}
