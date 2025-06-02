package day5;
import java.util.*;
public class HashmapManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> students = new HashMap<Integer, String>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for ( int i = 0; i < n ; i++)
		{
			int j = sc.nextInt();
			String name = sc.nextLine();
			students.put(j, name);
		}
		System.out.println("enter the key to remove");
		int k = sc.nextInt();
		System.out.println("Removing the value using the key");
		students.remove(k);
		System.out.println("Updating the student name");
		int z = sc.nextInt();
		String c = sc.nextLine();
		students.replace(z, c);
		System.out.println("updated hashmap:");
		for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println( entry.getKey() + "," + entry.getValue());
        }
		System.out.println("checking the value");
		int x = sc.nextInt();
		String v = sc.nextLine();
		if(students.containsKey(x)) {
			System.out.println("Found");
		}
		for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println( entry.getKey() + "," + entry.getValue());
        }
		
	}

}
