package PraticeQuestionsReduceStream;
import java.util.*;
public class pratice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  List<Integer> list=Arrays.asList(10,20,20,30,48,21,81);
  
   int product=list.stream().reduce(1,(e1,e2)->e1*e2);
   System.out.println(product);
   
   int max=list.stream().reduce(0,(e1,e2)->e1>e2?e1:e2);
   System.out.println(max);
  int count=0;
   int countitem=list.stream().reduce(count,(e1,e2)->e1+1);
   
   System.out.println(countitem);
   int EvenSum=list.stream().filter(x->x%2==0).reduce(0, (e1,e2)->e1+e2);
   
   System.out.println(EvenSum);
    
   List<String> s=Arrays.asList("Hemant","Singh","is","a","good","boy");
   
   String sc=s.stream().filter(x->x.length()>3).reduce("",(e1,e2)->e1+e2);
   System.out.println(sc);
   
   //6
   
   int multi=list.stream().filter(x->x%2!=0).reduce(1,(e1,e2)->e1*e2);
   
   System.out.println(multi);
   
   List<Integer> list1=Arrays.asList(10,-20,-20,30,48,21,-81);
   
   //7
   
   int negSum=list1.stream().map(x->(x>0)?x:0).reduce(0,(e1,e2)->e1+e2);
   System.out.print(negSum);
   
//   System.out.println(negSum);
   
   //8
   
   
   
   
   
   
	}

}
