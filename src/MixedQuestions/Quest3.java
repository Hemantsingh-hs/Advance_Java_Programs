//3) Write a Java program to create a list of integers and use Stream API to filter all even
//numbers, square them, and print the result using forEach().

package MixedQuestions;

import java.util.Arrays;
import java.util.List;

public class Quest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>  list=Arrays.asList(1,2,3,4,5,6,7);
		
		list.stream().filter(x->x%2==0).map(x->x*x).forEach(System.out::println);
		
		
	}

}
