
import java.util.Scanner;
public class Main
{
    
    public static void Primenum(int num){
        for(int i=1; i<=num; i++){
            int count=0;
            for(int j=1; j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }
       
    }
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int num= sc.nextInt();
		Primenum(num);
	}
}