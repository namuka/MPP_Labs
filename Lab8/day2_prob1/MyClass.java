import java.util.function.Function;

public class MyClass {
	private int x;
	private int y;
	public MyClass(int a, int b) {
		this.x = a;
		this.y = b;
	}
	
	public void myMethod(MyClass cl) {
		//determine Java8 way current instance equals to cl;
		Function<Object, Boolean> bp = this::equals;
		System.out.println("Result: " + bp.apply(cl));
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob==null) return false;
		if(ob.getClass()!=this.getClass()) return false;
		MyClass mc = (MyClass) ob;
		if(x!=mc.x) return false;
		else if(y==mc.y) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		MyClass mc1 = new MyClass(5, 5);
		MyClass mc2 = new MyClass(5, 5);
		MyClass mc3 = new MyClass(8, 4);
		mc1.myMethod(mc2);
		mc1.myMethod(mc3);
	}
}
