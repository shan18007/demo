package pro;

import java.util.ArrayList;
import java.util.List;

public class T3 {
	public static void te(List<String> ob) {
		ob.forEach(System.out::println);
	}

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("shan");
		list.add("Ann");
		list.add("Sunil");
		list.add("Akshay");
		List<String> subList = list.subList(1, 3);
		te(subList);
	}
}
