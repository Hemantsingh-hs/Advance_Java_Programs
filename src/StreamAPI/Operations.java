package StreamAPI;

import java.util.Arrays;
import java.util.stream.*;
import java.util.*;
public class Operations {

	public static void main(String[] args) {
		// TODO Auto-gene rated method stub
 List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,9,10);
  
// List<Integer> filteredList=list.stream().filter(x->x%2==0).collect(Collectors.toList());
// 
// System.out.println(filteredList);
// 
// List<Integer> mappedList=filteredList.stream().map(x->x/2).collect(Collectors.toList());
// System.out.println(mappedList);
 
 // both combined
 List<Integer> filteredListMap=list.stream().filter(x->x%2==0).map(x->x/2).collect(Collectors.toList());
 List<Integer> filteredListMapdis=list.stream().filter(x->x%2==0).map(x->x/2).distinct().collect(Collectors.toList());
 
 System.out.println(filteredListMap);
 
 System.out.println(filteredListMapdis);
 
 List<Integer> list2=Arrays.asList(34,6,7,8,23,5,6,9,0);
 //Sorted comparators
 List<Integer> sortDesc=list2.stream().sorted((x,y)->(y-x)).limit(5).collect(Collectors.toList());
 
 System.out.println(sortDesc);
 
 List<Integer> iter=Stream.iterate(0, x->x+1).limit(31).filter(x->x%2==0).skip(1).collect(Collectors.toList());
 
 System.out.println(iter);
 
 //max min
	}

}
