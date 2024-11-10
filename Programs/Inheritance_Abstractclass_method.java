public class Main{

    public static abstract class Student{
        int id;
        String name;
       abstract void Details();
       void Data(){
        System.out.println("Non abstract method");
       }
        
    }

    public static class Employee extends Student{
        void Details(){
            System.out.println("id:"+id+" "+"name:"+name);
        }
    }
    public static void main(String[] args){
       // System.out.println("hello");
        Employee emp= new Employee();
        emp.id=111;
        emp.name="Syam";
        emp.Details();
    }
}
