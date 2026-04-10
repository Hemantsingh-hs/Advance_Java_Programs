package StreamAPI;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;
public class reduceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List<Integer> list=Arrays.asList(23,20,10,21,11,10,9);
//   int sum=0;
//     List<Integer> s= list.stream().map((x)->sum+x).collect(Collectors.toList());
//   System.out.println(s);
      list.stream().reduce((e1,e2)->e1+e2).ifPresent(System.out::println);
      
      int sum=list.stream().reduce(0,(e1,e2)->e1+e2);
      
      System.out.println(sum);
	}

}
