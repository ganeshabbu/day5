package day5;
import java.util.*;
public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> students = new LinkedList<String>();
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i <= n;i++)
		{
			String s = sc.nextLine();
			students.add(s);
		}
		for (String student : students) {
			System.out.println(student);
		}
	}

}
