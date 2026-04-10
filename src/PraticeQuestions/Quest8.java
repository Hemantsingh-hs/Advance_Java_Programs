///8) Write a Java program to filter all strings containing 'A' from a list of strings.
package PraticeQuestions;

import java.util.Arrays;
import java.util.List;

public class Quest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("Hemant","Anna","Banna","Sharma","Depika","gollu");
		
		List<String> nam=names.stream().filter(x->x.contains("a")).toList();
		
		System.out.println(nam);
	}

}
