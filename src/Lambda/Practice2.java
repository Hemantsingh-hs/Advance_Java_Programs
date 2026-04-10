package Lambda;

import java.util.Arrays;
import java.util.List;

interface print{
  int printInt(int x);
}
public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
//		ArrayList<Integer> list=as.
		List<String> list = Arrays.asList("hemant","vikas","vaibhav","vinod");
		
	  list.forEach((x)->System.out.println(x.toUpperCase()));
	}

}
