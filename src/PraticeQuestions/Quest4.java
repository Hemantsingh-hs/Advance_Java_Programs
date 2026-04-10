//4) Write a Java program to filter all strings that start with the letter 'A' from a list of
//strings.

package PraticeQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class Quest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> names=Arrays.asList("Hemant","Raju","RajaBeta","Billu","Arjun","Amit","Anmol");
		 
		 
		List<String> AName=names.stream().filter(x->x.startsWith("A")).collect(Collectors.toList());
		
		System.out.println(AName);
		 
	}

}
