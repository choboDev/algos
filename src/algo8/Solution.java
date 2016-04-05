package algo8;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws Exception {
		//System.setIn(new FileInputStream("sample_input.txt"));
		
		//Scanner sc=new Scanner(System.in);
		//int T=sc.nextInt();
		
		int T=5;
		int sum=0;
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		int currentNum=1;
		int count=0;
		int n=0;

		while(n<T){
			if(count<currentNum){
				System.out.print(currentNum+" ");
				sum+=currentNum;
				count++;

				n++;
			}else{
				currentNum++;
				count=0;
			}
			
			
		}
		
		System.out.println(sum);
	}

}
