

public class Main
{
    
    public static void rightAngleTriangle(int rows){
        
        for(int i=0; i<rows; i++){
            for(int j=i; j<rows-1;j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
	public static void main(String[] args) {
	    rightAngleTriangle(5);
		
	}
}