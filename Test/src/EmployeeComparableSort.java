import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparableSort {
 
 /**
  * @param args
  */
 public static void main(String[] args) {
	
  List<Employee> employees = new ArrayList<Employee>();
  employees.add(new Employee("Dinesh", 18000, 30 ));
  employees.add(new Employee("Pankaj", 19000,22));
  employees.add(new Employee("Mayur", 14000,23));
  employees.add(new Employee("Pravin", 22000,45));
 
  System.out.println("Sort By Employee age");
  Collections.sort(employees);
 
  printEmployees(employees);
 
 }
 
 // print employee
 public static void printEmployees(List employees) {
 
	 
	 for(int i=0;i<employees.size();i++)
	 {
		 Employee e=(Employee)employees.get(i);
		 System.out.println("Age->" + e.emplAge + " Name-> " + e.empName
			     + " Salary-> " + e.empSalary);
		 
	 }
 }
}
