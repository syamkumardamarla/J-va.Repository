
import java.util.Scanner;
public class Main
{
    public static void reverseNum(int num){
        int rev=0,rem;
        while(num>0){
            rem= num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        reverseNum(num);
	}
}