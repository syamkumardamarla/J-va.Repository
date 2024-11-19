import java.util.Scanner;

public class Main
{
    public static void findVowels(String name){
        for(int i=0; i<name.length();i++){
            if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u' ){
                System.out.println(name.charAt(i));
            }
        }
        
    }
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    String name= sc.nextLine();
		findVowels(name);
	}
}