package algo4;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

	static int N, M;
	static int[] input=new int[40];
	static long Min;
	static long Sum;
	
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample_input.txt"));
		
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		long startTime = System.currentTimeMillis();
		
		List<Integer> userList=Collections.synchronizedList(new ArrayList()); 
		for(int i=0;i<=1000000000;i++){
			if(Integer.bitCount(i)==5)
				userList.add(i);
		}
		
		
		for(int test_case=1;test_case<=T; ++test_case){
			N=sc.nextInt();
			M=sc.nextInt();

			Min=0;
			Sum=0;
			for(int i=0;i<userList.size();i++)
			{
				if((int)userList.get(i)>=N){
					
					if(Min==0)
						Min=(int)userList.get(i);
					Sum+=(int)userList.get(i);
					
					
					if((int)userList.get(i)>M)
						break;
				}
			}
			System.out.println("#"+test_case+" Min="+Min+" Sum="+Sum);			
		}
		long endTime = System.currentTimeMillis();

		System.out.println("finish : " + (endTime - startTime) + "(ms)");
	}
}
