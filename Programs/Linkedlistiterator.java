import java.util.*;
public class Main
{
	public static void main(String[] args) {
		LinkedList <String> linkedlist= new LinkedList<String>();
		linkedlist.add("apple");
		linkedlist.add("Mango");
		linkedlist.add("banana");
		linkedlist.add("grapes");
		Iterator itr=linkedlist.iterator();
		while(itr.hasNext()){
		    System.out.println(itr.next());
		}
	}
}