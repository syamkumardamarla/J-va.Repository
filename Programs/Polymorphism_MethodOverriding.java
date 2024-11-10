public class Main{

    public static class MethodOverridingParent{
       
        void Multiply(String name,int marks){
            System.out.println("parent class method:"+" "+name+" "+marks);
        }
        
    }
    public static class MethodOverridingChild extends MethodOverridingParent{
       
        void Multiply(String name,int marks){
            System.out.println("Child class method:"+" "+name+" "+marks);
        }
        
    }


    public static void main(String[] args){
        MethodOverridingChild mo= new MethodOverridingChild();
        mo.Multiply("syam",56);
    }
}