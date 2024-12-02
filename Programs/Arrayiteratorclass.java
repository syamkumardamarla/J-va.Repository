import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Main
{
	public static void main(String[] args) {
		ArrayList <String> arrlist= new ArrayList <String>();
		arrlist.add("mango");
		arrlist.add("apple");
		arrlist.add("banana");
		arrlist.add("coconut");
		System.out.println(arrlist);
		Iterator itr=arrlist.iterator(); //getting iterator class
		while(itr.hasNext()){ // checking whether iterator has elements
		    System.out.println(itr.next()); //iterate one by one elements and move to the next one
		}
        //sorting array list
        Collections.sort(arrlist);
        System.out.println(arrlist);
	}
}