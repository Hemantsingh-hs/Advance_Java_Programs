package MixedQuestions;

import java.util.Arrays;
import java.util.List;

public class Quest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>  list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		int  l=list.stream().filter(x->x%2==0).distinct().map(x->x*x).reduce(0,(e1,e2)->e1+e2);
		System.out.println(l);
	}

}
