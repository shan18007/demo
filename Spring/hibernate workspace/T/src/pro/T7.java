package pro;

import java.util.Collections;
import java.util.TreeSet;

public class T7 {
	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();
		ts.add("AAaa");
		ts.add("aAa");
		ts.add("aAaA");
		ts.add("AaA");
		System.out.println(ts);
	}
}
