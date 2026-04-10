package classprogram;
import java.util.*;
import java.util.stream.Collectors;
public class day2_dublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		List<Integer> l1=List.of(10,30,30,11,223,33,33,12,70,50,60);
		
		l1.stream().distinct().forEach(System.out::println);
		
		List<Integer> l2=l1.stream().distinct().skip(1).toList();
		System.out.println(l2);
		
//		List<Integer> l3=l1.stream().skip(1).count();
		
		List<Integer> l4=l1.stream().filter(x->x%2==0).limit(3).collect(Collectors.toList());
		
		System.out.println(l4);
	}

}
