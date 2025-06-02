package day5;
import java.util.*;
public class HashsetExample {

	public static void main(String[] args) {
		 HashSet<String> students = new HashSet<String>();
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
