package StreamAPI;

import java.util.Arrays;
import java.util.*;
public class toArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Integer> list=Arrays.asList(34,5,66,2,32,87,10);
    
//    Object arr[]=list.stream().toArray();
    var s=list.stream().toArray();
    System.out.println(Arrays.toString(s));
//    System.out.println(Arrays.toString(arr));
	}

}
