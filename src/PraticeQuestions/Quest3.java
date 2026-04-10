//3) Write a Java program to filter positive numbers greater than 20 from a list of integers.
package PraticeQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class Quest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		   List<Integer> numbers=Arrays.asList(34,23,45,56,66,90,12);
		   
		   List<Integer> num=numbers.stream().filter(x->x>20).collect(Collectors.toList());
		   
		   System.out.print(num);;
		   
	
	}

}
