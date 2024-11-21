

public class Main
{
    
    public static void Swapvalues(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+" "+"b="+b);
    }
     
	public static void main(String[] args) {
	   
		Swapvalues(88,77);
		
	}
}