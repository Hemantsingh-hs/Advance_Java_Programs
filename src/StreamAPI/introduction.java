package StreamAPI;
import java.util.*;
import java.util.stream.Stream;
public class introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int[] arr= {4,5,56,63,2,2,6};
		int sum=Arrays.stream(arr).filter(x->x%2==0).sum();
		System.out.println(sum);
		List<String> list=Arrays.asList("apple","banana","alo");
		
//		1
		Stream<String> mystream=list.stream();
		
		String[] array= {"apple","banana","mango"};
//		2
		Stream<String> stream=Arrays.stream(array);
//		3
		Stream<Integer> integerNumber=Stream.of(1,2,3,4,5,6,7,8);
		
//		4
		Stream<Integer> limit=Stream.iterate(0,n->n+1).limit(100);
		
//		5
		Stream<String> gen=Stream.generate(()->"hello").limit(10);
	
	
	}

}
