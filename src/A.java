import java.io.Serializable;


public class A implements Serializable{
	
	private static final long serialVersionUID = 1L;
	public int i ;
	public A(int i){
		this.i = i;
	}
	public String toString(){
		return "a:"+i;
	}
	public static void main(String[] args) {
		System.out.println("ttttt.jar--1");
	}
}
