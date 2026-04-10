package classprogram;

import java.util.Arrays;
//import java.util.stream.IntStream;
import java.util.stream.*;
import java.util.*;
public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {3,4,5,6,7,8,9};
      
      IntStream s=Arrays.stream(arr);
      
      s.forEach(x->System.out.println(x));
      
      Stream<Integer> s2=Stream.of(2,6,45,34);
      
      s2.forEach(x->System.out.println(x));
      
      List<Integer> list=Arrays.asList(45,5,32,67,89);
      
      System.out.println("List :");
      list.forEach((x)->System.out.println(x));
      
	}

}
