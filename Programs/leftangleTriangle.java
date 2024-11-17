

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




public class Main
{
    public static void leftangle(int rows){
        for(int i=0; i<rows; i++){
            for(int j=0; j<=i; j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
        
    }
	public static void main(String[] args) {
		leftangle(5);
	}
}





public class Main
{
    public static void leftangle(int rows){
        for(int i=0; i<rows; i++){
            for(int j=0; j<=i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
        
    }
	public static void main(String[] args) {
		leftangle(5);
	}
}
