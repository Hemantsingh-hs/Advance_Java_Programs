package classprogram;
import java.util.*;
import java.util.stream.*;
public class pratice1_filter_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Integer> numbers=Arrays.asList(2,3,4,44,67,32,22,45,11,22);
    
     
   List<Integer> newnum=numbers.stream().filter(x->x>20).map(x->x*3).collect(Collectors.toList());
   
   System.out.println(newnum);
	}

}
