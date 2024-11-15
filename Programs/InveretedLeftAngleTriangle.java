

public class Main
{
    
    public static void leftanglePyramid(int rows){
        for(int i=rows; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
	public static void main(String[] args) {
	    leftanglePyramid(5);
	    
	}
}