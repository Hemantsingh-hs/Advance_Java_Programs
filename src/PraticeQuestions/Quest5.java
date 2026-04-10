//5) Write a Java program to filter all strings that end with the letter 'A' from a list of
//strings.

package PraticeQuestions;
import java.util.*;
import java.util.stream.*;
public class Quest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
  List<String> names=Arrays.asList("Hemant","Anna","Banna","Sharma","Depika","gollu");
  
  List<String> nam=names.stream().filter(x->x.endsWith("a")).collect(Collectors.toList());
  
  System.out.println(nam);
  
  
  
	}

}
