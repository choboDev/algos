package algo;

public class Numbers{
	private int value;
	public Numbers(int value){
		setValue(value);
	}
	public int getValue(){
		return value;
	}
	public void setValue(int value){
		this.value=value;
	}
	
	@Override
	public String toString() {
		return "numbers [value=" + value + "]";
	}
	
	
}