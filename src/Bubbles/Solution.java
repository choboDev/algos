package Bubbles;
import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {

	static int N, M;
	static int[] input=new int[40];
	static int Answer;
	
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("bubble_input.txt"));
		
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		for(int test_case=1;test_case<=T; ++test_case){
			N=sc.nextInt();
			//M=sc.nextInt();
			for(int i=0;i<N;i++){
				input[i]=sc.nextInt();
			}
			
			/*********************************
			 * 
			 알고리즘
			 * 
			 */
			
			input=BubbleSort(input, N);
			
			Answer=-1;
			
			for(int i=0;i<N;i++){
				System.out.print(input[i]+" ");
			}
			
			//System.out.println("#"+test_case+" "+Answer);
			System.out.println();
		}
		
	}
	
	public static int[] BubbleSort(int[] array, int Size){
		int temp;
		for(int i=Size-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(array[j]>array[j+1]){
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return array;
		
	}

}
