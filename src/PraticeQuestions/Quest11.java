
//11) Write a Java program using map() to convert a list of lowercase strings into uppercase
//strings.

package PraticeQuestions;

import java.util.Arrays;
import java.util.List;

public class Quest11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("Hemant","Anna","Banna","Sharma","Depika","gollu");
		
		List<String> nam=names.stream().map(x->x.toUpperCase()).toList();
		
		System.out.println(nam);
	}

}
