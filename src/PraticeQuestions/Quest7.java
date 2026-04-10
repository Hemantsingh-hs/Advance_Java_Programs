//7) Write a Java program to filter odd numbers from a list of integers.

package PraticeQuestions;

import java.util.Arrays;
import java.util.List;

public class Quest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> numbers=Arrays.asList(30,20,21,11,22,34,101);
		 
		 List<Integer> odd=numbers.stream().filter(x->x%2!=0).toList();
		 
		 System.out.println(odd);
		 
		 
		 
	}

}
