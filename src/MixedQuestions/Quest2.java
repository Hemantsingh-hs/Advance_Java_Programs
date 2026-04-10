//Write a Java program to count how many numbers in a list are greater than 50 using
//filter() and count().
package MixedQuestions;

import java.util.Arrays;
import java.util.List;

public class Quest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>  list=Arrays.asList(90,80,50,44,67,78,80,83,60,63,53);
		
		long count=list.stream().filter(x->x>50).count();
		
		System.out.println(count);
	
	}

}
