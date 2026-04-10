package classprogram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

class Student{
	int id;
	String name;
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
}
public class pratice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Student> student=Arrays.asList(new Student(1,"xyz"),
    		 new Student(2,"abc"),
    		 new Student(3,"mamu"));
     List<String> name=student.stream().map(x->x.name).collect(Collectors.toList());
     
 System.out.println(name);
     

	}

}
