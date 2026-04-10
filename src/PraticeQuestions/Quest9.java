//9) Write a Java program to filter all strings whose length is greater than 5 from a list of
//strings.

package PraticeQuestions;

import java.util.Arrays;
import java.util.List;

public class Quest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("Hemant","Anna","Banna","Sharma","Depika","gollu");
		
		List<String> nam=names.stream().filter(x->x.length()>5).toList();
		
		System.out.println(nam);
	}

}
