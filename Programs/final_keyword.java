
public class Main
{
public static final class Student{
    final int id;
    final String name;
    final void Details(){
        System.out.println("Id:"+id+" "+"Name:"+name);
    }

}

public static class Employee extends Student{ //final class cannot be Inherited
    void Details(){ //final method cannot be Overriden
        System.out.println("Accesing final variables:"+id+" "+name);
        //final variables cannot be Modified.
    }
}

	public static void main(String[] args) {
		//System.out.println("Hello World");
        Student s= new Student();
        s.id=111;
        s.name="Syam";
        s.Details();
	}
}