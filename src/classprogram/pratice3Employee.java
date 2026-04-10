package classprogram;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.*;

class Employee{
	int id;
	String name;
	
	float salary;
	
	Employee(int id,String name,float salary){
		
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	};
	
}
public class pratice3Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Employee> emp=Arrays.asList(
    		new Employee(101,"hemant",90000),
    		new Employee(102,"gaurav",70000),
    		new Employee(103,"monu",30000),
    		new Employee(101,"ajju",40000));
	
//	private Collection<Employee> emp;
	List<String> name=emp.stream().filter(x->x.salary>60000).map(x->x.name.toUpperCase()).collect(Collectors.toList());
	
	System.out.println(name);
}
}
