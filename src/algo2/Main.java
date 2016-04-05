package algo2;

import java.util.*;
public class Main{
   public static void main(String args[]){
       Scanner cin = new Scanner(System.in);
       int z=0;
       int b=cin.nextInt();
       int[] a=new int[b];
       for(int i=0;i<b;i++){
    	   a[i]=cin.nextInt();
       }
	   for(int i=0;i<b;i++){
		   if(i==0){
			   System.out.print("0 ");
		   }
		   for(int j=i-1;j>=0;j--){
			   if(a[i]<a[j]){
				   System.out.print((j+1)+" ");
				   break;
			   }else if(j==0){
				   System.out.print("0 ");
			   }
		   }
	   }
	   
   }
}