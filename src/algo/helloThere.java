package algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class helloThere {
	public static void main(String[] args){
		//MyStack stack=new MyStack(10);
		Stack<String> stack=new Stack<String>();
		
		for(int i=1;i<=5;i++){
			stack.push("데이터-"+i);
		}
		
		stack.push("데이터-6");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		Numbers a=new Numbers(1);
		Numbers b=new Numbers(2);
		
		System.out.println("a="+a+", b="+b);
		swap(a,b);
		System.out.println("a="+a+", b="+b);
		
		
		
		
	}

	public static void swap(Numbers a, Numbers b){
		Numbers temp=new Numbers(0);
		temp.setValue(a.getValue());
		a.setValue(b.getValue());
		b.setValue(temp.getValue());
	}
	
	

}

