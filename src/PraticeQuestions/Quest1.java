//1) Write a Java program to extract the names of all students from a list of Student objects
//using map().

package PraticeQuestions;

import java.util.*;

class Student{
	int id;
	String name;
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	void display(){
		System.out.println("Hey"+id+"Your Name"+name);
	}
}

public class Quest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Student> list=Arrays.asList(
    		new Student(101,"Hemant"),
    		new Student(102,"Banna"),
    		new Student(103,"RajaBeta"),
    		new Student(104,"Billu Kumar")
    		);
    
      list.stream().map(x->x.name).forEach(System.out::println);
      
      
      
    
	}

}
