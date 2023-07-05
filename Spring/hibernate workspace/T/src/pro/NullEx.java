package pro;

public class NullEx {
String name;
	public void a(String s) {
	this.name=s;
	}
	public static void main(String[] args) {
		NullEx ob=new NullEx();
		ob.a(null);
		System.out.println(ob.toString());
	}
}
