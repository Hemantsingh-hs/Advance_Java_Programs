///10) Write a Java program to filter numbers divisible by 3 from a list of integers.

package PraticeQuestions;

import java.util.Arrays;
import java.util.List;

public class Quest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> numbers=Arrays.asList(30,20,21,11,22,34,101);
		 
		 List<Integer> num=numbers.stream().filter(x->x%3==0).toList();
		 
		 System.out.println(num);
	}

}
