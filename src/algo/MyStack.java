package algo;

public class MyStack {
	private Object[] stackArray;
	private int maxSize;
	private int top;
	
	public MyStack(int maxSize){
		this.maxSize=maxSize;
		this.stackArray=new Object[maxSize];
		this.top=-1;
	}
	
	public boolean empty(){
		return (top==-1);
	}
	
	public boolean full(){
		return (top==maxSize-1);
	}
	
	public void push(Object item){
		if(full()){
			throw new ArrayIndexOutOfBoundsException((top+1)+">="+maxSize);
		}
		stackArray[++top]=item;
	}
	
	public Object peek(){
		if(empty()){
			throw new ArrayIndexOutOfBoundsException(top);
		}
		return stackArray[top];
	}
	
	public Object pop(){
		Object item=peek();
		top--;
		return item;
	}
}
