package classprogram;

import java.util.Arrays;
import java.util.*;
import java.util.stream.*;
public class pratice2_filter_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  List<String> names=Arrays.asList("hemant","binod","ram","sham","rubi","shurti");
  
  List<String> nam=names.stream().filter(x->x.length()>4).map(x->x.toUpperCase()).collect(Collectors.toList());
  
  System.out.println(nam);
  
  
	}

}
