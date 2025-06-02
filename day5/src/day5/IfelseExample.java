package day5;
import java.util.*;
public class IfelseExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String day = sc.nextLine().toLowerCase();
		switch(day) {
		case "monday":
			System.out.println("Lets learn python");
			break;
		case "tuesday":
			System.out.println("Lets learn Java");
			break;
		case "wednesday":
			System.out.println("Lets learn Angular js");
			break;
		case "thuresday":
			System.out.println("Lets learn scala");
			break;
		case "friday":
			System.out.println("Lets learn python");
			break;
		case "saturday":
			System.out.println("Lets learn python");
			break;
		case "sunday":
			System.out.println("Lets learn python");
			break;
		default:
			break;
		}
		sc.close();
	}

}
