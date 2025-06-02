package day5;
import java.util.*;
public class HashsetManipulation {

	public static void main(String[] args) {
		 HashSet<String> mobiles = new HashSet<String>();
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 for (int i =0 ; i< n;i++)
		 {
			 String name = sc.next();
			 mobiles.add(name);
		 }
		 if (mobiles.contains("IPhone")) {
			 System.out.println("mobile is found");
		 }
		 else {System.out.println("not found");
		 }
			 ArrayList<String> models = new ArrayList<String>(mobiles);
			 System.out.println(models.getClass().getName());
			 for(String model:models) {
				 System.out.println(model);
			 }
			 System.out.println("Using an iterator:");
			 Iterator<String> iterator = mobiles.iterator();
		        while (iterator.hasNext()) {
		            System.out.println(iterator.next());
		        }
		        
		        sc.close(); 
	}

}
