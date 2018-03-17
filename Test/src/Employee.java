// Employee Object
class Employee implements Comparable {
 
 public String empName;
 public double empSalary;
 public int emplAge;
 
	 

 public Employee(String empName, double empSalary,int emplAge) {
  
  
  this.empSalary = empSalary;
  this.emplAge = emplAge;
 }
 public Employee(String string, int i) {
	 this.empName = empName;
	 this.emplAge = emplAge;
}
public  int compareTo(Employee otherEmployee) {
  int age = ((Employee) otherEmployee).emplAge; // same type object
  if (this.emplAge > age)
   return -1;
  //else if (this.emplAge < age)
   return 1;
 /* else
   return 0;*/
 }

public int compareTo(Object arg0) {
	// TODO Auto-generated method stub
	return 0;
}
public Class Employee Implements Comparable<Employee>{ 

String name;
int id;

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public int getId() {
return id;
}

public void setId(int id) {
this.id = id;
}

Employee (String name, int id){
this.name=name;
this.id=id;
}

@Override    public int compareTo(Employee obj) {
if (this.getId() == obj.getId()) return 0;
else

if (this.getId() < obj.getId()) return 1;
else return -1;
}