package StreamAPI;

import java.util.List;
//import java.util.stream.*;
import java.util.*;
public class SortedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Integer> l1=List.of(21,45,56,78,96,112,5);
    
    List<Integer> sorted1=l1.stream().sorted(Comparator.reverseOrder()).toList();
    
    System.out.println(sorted1);
    
    List<Integer> sorted2=l1.stream().sorted((x,y)->y.compareTo(x)).toList();
    
    System.out.println(sorted2);
    
    int maximum=l1.stream().max((x,y)->x.compareTo(y)).get();
    
    System.out.println(maximum);
    
    
	}

}
