
public class Main
{
public static class Student{
    //combining data members and member functions in a single unit or class. and also controlling access using access specifiers.
    private int id=111;
    private String name="syam";
    private void Details(){
        System.out.println("Id:"+id+" "+"Name:"+name);
    }

}
public static class Employee extends Student{
    void Details(){
         System.out.println("Id:"+id+" "+"Name:"+name);
    }
}

	public static void main(String[] args) {
		//System.out.println("Hello World");
        Employee emp= new Employee();
        emp.Details();
	}
}