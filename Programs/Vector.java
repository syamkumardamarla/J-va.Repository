
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Vector <String> vl= new Vector <String>();
		vl.add("apple");
		vl.add("Mango");
		vl.add("banana");
		vl.add("grapes");
		Iterator itr=vl.iterator();
		while(itr.hasNext()){
		    System.out.println(itr.next());
		}
	}
}