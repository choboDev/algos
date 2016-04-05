package algo3;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Solution {

	static int N, M;
	static int[] input=new int[40];
	static int Answer;
	
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample_input.txt"));
		
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		for(int test_case=1;test_case<=T; ++test_case){
			N=sc.nextInt();
			M=sc.nextInt();
			for(int i=0;i<N-1;i++){
				input[i]=sc.nextInt();
			}
			
			/*********************************
			 * 
			 알고리즘
			 * 
			 */
			Answer=-1;
			
			System.out.println("#"+test_case+" "+Answer);
		}
		
	}

}
