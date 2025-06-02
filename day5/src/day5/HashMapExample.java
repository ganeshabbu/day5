package day5;
import java.util.*;
public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> students = new HashMap<Integer,String>();
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n;i++)
		{
			int z = sc.nextInt();
			String s = sc.nextLine();
			students.put(z,s);
		}
		for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println( entry.getKey() + "," + entry.getValue());
        }

	}

}
