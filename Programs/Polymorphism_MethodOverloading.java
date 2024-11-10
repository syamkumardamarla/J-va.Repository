public class Main{

    public static class MethodOverloading{
        void Multiply(int x,int y){
            System.out.println( x*y);
        }
        void Multiply(int x,int y,int z){
           System.out.println( x*y);
        }
        void Multiply(String name,int marks){
            System.out.println(name+" "+marks);
        }
        
    }

    public static void main(String[] args){
        MethodOverloading mo= new MethodOverloading();
        mo.Multiply(5,6);
        mo.Multiply(5,6,2);
        mo.Multiply("syam",56);
    }
}