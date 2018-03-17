
public class Employee1 implements Comparable<Employee>{ 

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
 
    public Employee1 (String name, int id){
        this.name=name;
        this.id=id;
    }
 
    @Override    public int compareTo(Employee obj) {
        if (this.getId() == obj.getId()) return 0;
        else
        
        if (this.getId() < obj.getId()) return 1;
        else return -1;
            
}