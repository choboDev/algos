package algo5;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Main{
    public static void main(String args[]) throws Exception{
    	System.setIn(new FileInputStream("sample_input1.txt"));
    	
    	Scanner sc=new Scanner(System.in);
    	
    	/*int T=sc.nextInt();
    	for(int test_case=1;test_case<=T;++test_case){
    		int num=sc.nextInt();
    		
    		
    	}*/
    	
    	//System.out.println(factorial(3));
    	
    	int num=sc.nextInt();
    	int numNow=num;
    	String a=sc.toString();
    	System.out.println(a);
    	ArrayList<Integer> temp=new ArrayList<Integer>();
    	
/*    	for(int i=0;i<a.length();i++){
        	for(int j=97;j<123;j++){
        		if(!temp.contains(j) &(int)a.charAt(i)==j){
        			temp.add(j);
        			
        		}
        	}
        	
    	}*/
    	int count=0;
    	
    	for(int i=0;i<a.length();i++){
    		count=0;
    		for(int j=97;j<123;j++){
    			if((int)a.charAt(i)==j){
    				temp.add(j);
    			}else if(!temp.contains(j)){
    				count++;
    			}
    		}
    		System.out.println(a.charAt(i)+count);
    	}
    	
    	
    }
    
    public static int factorial(int n){
    	if(n<=1)
    		return n;
    	else
    		return(factorial(n-1)*n);
    	
    }
}