//6) Write a Java program to filter positive numbers from a list of integers.

package PraticeQuestions;

import java.util.Arrays;
import java.util.*;

import java.util.stream.*;
public class Quest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List<Integer> positive=Arrays.asList(30,-20,21,-11,22,34,101);
   List<Integer> pos=positive.stream().filter(x->x>0).collect(Collectors.toList());
   
   System.out.println(pos);
   
   
  
	}

}
