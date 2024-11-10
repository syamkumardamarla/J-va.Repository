public class Main{

    public static class Student{
        int id=111;
        String name="Hello";
        void Details(){
            int id=222;
            String name="syam";
            System.out.println("id:"+id+" "+"name:"+name);
            System.out.println("this value:"+this.id+" "+"name:"+this.name);
            //this keyword helps to access current object Members.
        }
    }
    public static class Employee extends Student{
        void Info(){
            super.Details();
            System.out.println(super.id);//super keyword is used to refer Parent class  members means variables and Methods
        }
    }
    public static void main(String[] args){
        Employee s=new Employee();
        s.Info();
        
    }
}