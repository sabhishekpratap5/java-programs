import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LibraryEntry {
public static void main(String[] args) {
ArrayList<Person>arrayList=new ArrayList<Person>();
Scanner scanner=new Scanner(System.in);
	System.out.println("1 Incoming person: ");
	System.out.println("2 Outgoing person: ");
	System.out.println("Enter your choice");
	int choice=scanner.nextInt();
	switch (choice) {
	case 1:Person person=new Person("pradeep",900043,25,"10pm","JavaBook");
	       arrayList.add(person)
		
		break;

	default:
		break;
	}

}
}
