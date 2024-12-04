import java.util.*;
public class Main
{
	public static void main(String[] args) {
		LinkedList <String> arrlist= new LinkedList<String>();
		arrlist.add("apple");
		arrlist.add("Mango");
		arrlist.add("banana");
		arrlist.add("grapes");
		Iterator itr=arrlist.iterator();
		while(itr.hasNext()){
		    System.out.println(itr.next());
		}
	}
}