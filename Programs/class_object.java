
public class Main
{
public static class Student{
    int id;
    String name;
    void Details(){
        System.out.println("Id:"+id+" "+"Name:"+name);
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