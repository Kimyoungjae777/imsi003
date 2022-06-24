package 생활코딩;

public class Calculator {
	int left;
	int right;
	public void setOperands(int right,int left) {
		
		this.left=left;
		this.right=right;		
	}
	
	public void sum() {
		
		System.out.println(this.right+this.left);
		
	}
	
	public void avg() {
		System.out.println((this.right+this.left)/2);
	}
	
	
}
