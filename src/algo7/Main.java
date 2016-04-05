package algo7;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Main{
	public static void main(String args[]) throws Exception{
    	System.setIn(new FileInputStream("sample_input3.txt"));
    	
    	Scanner sc=new Scanner(System.in);
    	
    	int T=sc.nextInt();
    	ArrayList<Integer> array=new ArrayList<Integer>();
    	
    	
    	for(int i=0;i<T;i++)
    		array.add(sc.nextInt());

    	for(int i=0;i<T;i++)
    		System.out.print(array.get(i)+" ");
    	
    	array.sort(null);
    	
    	System.out.println();
    	for(int i=0;i<T;i++)
    		System.out.print(array.get(i)+" ");
    	
//    	ArrayList<abc> array2=new ArrayList<abc>();
//    	abc temp;

    	
    	ArrayList<String> array2=new ArrayList<String>();
    	for(int i=0;i<T;i++)
    		array2.add(sc.next());
    	
    	System.out.println();
    	for(int i=0;i<T;i++)
    		System.out.print(array2.get(i)+" ");
    	
    	bubbleSort(array2);
    	System.out.println();
    	for(int i=0;i<T;i++)
    		System.out.print(array2.get(i)+" ");
    }
	
//	public class abc{
//		int a;
//		String b;
//	}
	
	public static void bubbleSort(ArrayList a){
		char temp;
		for(int i=0;i<a.size()-1;i++){
			for(int j=i;j<a.size()-1;j++){
				if(true)
				{
					temp=(char)a.get(j);
					a.set(j, a.get(j+1));
					a.set(j+1, temp);					
				}
			}
		}
	}
}