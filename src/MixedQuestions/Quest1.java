//1) Find out list of pass and fail students in given list those attendance is more than 60%.
package MixedQuestions;
import java.util.*;
import java.util.stream.*;
public class Quest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		List<Integer>  list=Arrays.asList(90,80,50,44,67,78,80,83,60,63,53);
		
		List<Integer> pas=list.stream().filter(x->x>60).toList();
		
		System.out.println(pas);
	}

}
