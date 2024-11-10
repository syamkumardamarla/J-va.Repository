public class Main{
    interface Student{
         void Details();
    }

    public static class Employee implements Student{
        public void Details(){
            String name="Syam";
            System.out.println("Child Class method Overriden the Parent class:"+name);
        }
    }

    public static void main(String[] args){
        //System.out.println("hello");
        Student emp=new Employee(); //creating object for interface
        emp.Details();
    }
}