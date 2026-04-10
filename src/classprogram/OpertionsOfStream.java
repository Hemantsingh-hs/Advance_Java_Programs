package classprogram;

import java.util.*;
import java.util.stream.*;
public class OpertionsOfStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Integer> list=Arrays.asList(3,4,22,6,8,9,15);
  
    List<Integer> EvenStream=list.stream().filter(x->x%2==0).collect(Collectors.toList());
    
    List<Integer> Map=list.stream().filter(x->x%2==0).map(x->x*x).collect(Collectors.toList());
    

    
    
    System.out.println(EvenStream);
    System.out.println(Map);
	}

}
