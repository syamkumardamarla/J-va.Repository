

public class Main
{
    
    public static void leftangleTriangle(int rows){
        for(int i=0; i<rows; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
	public static void main(String[] args) {
	    leftangleTriangle(5);
	    
	}
}