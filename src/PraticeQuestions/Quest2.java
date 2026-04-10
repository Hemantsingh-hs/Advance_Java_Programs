
//2) Write a Java program to filter numbers greater than 50 from a list of integers and store
//them in a new list.

package PraticeQuestions;

import java.util.*;
import java.util.stream.*;
public class Quest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> numbers=Arrays.asList(34,23,45,56,66,90,12);
     
     List<Integer> num=numbers.stream().filter(x->x>50).collect(Collectors.toList());
     
     System.out.println(num);
     
     
	}

}
