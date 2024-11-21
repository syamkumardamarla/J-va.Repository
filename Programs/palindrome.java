
import java.util.Scanner;
public class Main
{
    public static void PalindromeNum(int num){
        int rev=0,rem,temp;
        temp=num;
        while(num>0){
            rem= num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(temp==rev){
            System.out.println("Palindrome Number:"+temp)
        }
        System.out.println("Not a Palidrome Number:"+temp);
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        PalindromeNum(num);
	}
}
import java.util.Scanner;
public class Main
{
    public static void PalindromeNum(int num){
        int rev=0,rem,temp;
        temp=num;
        while(num>0){
            rem= num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(temp==rev){
            System.out.println("Palindrome Number:"+temp);
        }
        else{
            System.out.println("Not a Palidrome Number:"+temp);
        }
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        PalindromeNum(num);
	}
}