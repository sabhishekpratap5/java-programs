import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Test1 {
		public static void main(String args[]) {
		//create TreeSet object
		 
		TreeSet<Employee> treeSet = new TreeSet<Employee>();     
		     
		       //add elements to TreeSet
		    treeSet.add(new Employee("abc",1));
		    treeSet.add(new Employee("xyz",2));
		    treeSet.add(new Employee("ssd",3));
		    treeSet.add(new Employee("ert",4));
		         
		    java.util.Iterator<Employee> itr = treeSet.iterator();
		 
		 while(itr.hasNext()){
		 
		     Employee obj= (Employee)itr.next();
		     System.out.println(obj.getName()+"  "+obj.getId()); 

		  }         

		}
}

