import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Stack <String> sk= new Stack <String>();
        sk.push("kohli");
        sk.push("Rohith");
        sk.push("Bumrah");
        sk.push("hardik");
        Iterator itr=sk.iterator();
        while(itr.hasNext()){
          System.out.println(itr.next());  
        }
        System.out.println(sk.peek()); //returns the  top element of the stack, 
        sk.pop(); //it removes the top element of the stack
	}
}