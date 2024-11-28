import java.util.ArrayList;
import java.util.Collections;
public class Main
{
	public static void main(String[] args) {
		ArrayList <Integer> arrlist= new ArrayList <Integer>();
		arrlist.add(30);
		arrlist.add(20);
		arrlist.add(10);
		arrlist.add(5);
		System.out.println(arrlist);
			for(int list:arrlist){ //for each loop
		    System.out.println(list);
		}
		System.out.println("Value at index:"+arrlist.get(3)); //get(Indexnumber);
		arrlist.set(3,45);
		System.out.println(arrlist);
		Collections.sort(arrlist); //sorting using collections 
		System.out.println("Sorting array elements:"+arrlist);
	    
	
	}
}