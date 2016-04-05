package algo6;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Main{
	static int[][] K=new int[5][21];

	public static void main(String args[]) throws Exception{
/*    	System.setIn(new FileInputStream("sample_input2.txt"));
    	
    	Scanner sc=new Scanner(System.in);
    	
    	int T=sc.nextInt();
    	
    	int[][] array=new int[T][T];
    	int[] visited=new int[T];
    	for(int i=0;i<T;i++)
    		visited[i]=0;
    	
    	for(int i=0;i<T;i++){
    		for(int j=0;j<T;j++){
    			array[i][j]=sc.nextInt();
    		}
    	}
    	
    	for(int i=0;i<T;i++){
    		for(int j=0;j<T;j++){
    			System.out.print(array[i][j]+" ");
    		}
    		System.out.println();
    	}
    	*/
    	
    	
	    int[] price = {0, 10,1,100};
	    int[] weight = {0, 4,1,11};
	    int Weight = 10; //베낭 10kg
	    int max_val = knapsack(3, Weight, price, weight);
	    System.out.println("max price: "+ max_val);
    	
    	
    	
    }
    
    public static int knapsack(int n, int W, int price[], int weight[]){
    	for(int i=0;i<=n;i++){
    		K[i][0]=0;
    	}
    	for(int w=0;w<=W;w++){
    		K[0][w]=0;
    	}
    	
    	
    	for(int i=1;i<=n;i++){
    		for(int w=1;w<=W;w++){
    			if(weight[i]>w){
    				K[i][w]=K[i-1][w];
    			}
				else{
					int selected_val=K[i-1][w-weight[i]+price[i]]+price[i];
					int unselected_val=K[i-1][w];
					K[i][w]=selected_val>unselected_val ? selected_val:unselected_val;
				}
    		}
		}
    	return K[n][W];
	}
        
}