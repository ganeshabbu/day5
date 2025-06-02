package day5;
import java.util.*;
public class ArrayListManipulations {

	public static void main(String[] args) {
		ArrayList<String> mobilemodels = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i =0 ; i < n;i++) {
			String sm = sc.nextLine();
			mobilemodels.add(sm);
		}
		Collections.sort(mobilemodels);
		
	}

}
