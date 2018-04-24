import java.util.*;

public class Main{
	public static void main(String args[]){

		Vector vector = new Vector();

		for (int i = 0; i < 5; i++) {
			vector.add(i);
		}

		Enumeration enumer = vector.elements();
		EnumAdapt enumerationAdapter = new EnumAdapt(enumer);
		
		System.out.println("Stuff");
		
		while(enumerationAdapter.hasNext()){
			System.out.println("Exists: " + enumerationAdapter.hasNext());
			System.out.println(enumerationAdapter.next());
		}

		System.out.println("Exists: " + enumerationAdapter.hasNext());

		System.out.println("Not existent :(");
		enumerationAdapter.remove();
	}
} 