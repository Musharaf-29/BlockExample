
public class BlockAndstaticBlockExample {
	static {
		System.out.println("Inside the static block");
	}
	{
		System.out.println("Inside the block");
	}
	BlockAndstaticBlockExample(){
		System.out.println("Inside the Constructor");
	}
	public static void main(String args[]) {
		BlockAndstaticBlockExample obj=new BlockAndstaticBlockExample();
	}
}
