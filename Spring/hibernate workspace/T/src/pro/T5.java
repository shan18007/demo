package pro;

public class T5 {
	public static void main(String[] args) {

		Integer i = new Integer(1) + new Integer(2);
		System.out.println(i);
		switch (i) {
		case 3: System.out.println("three");
		break;
		
		default:
			System.out.println("other");
			break;
		}
	}
}
