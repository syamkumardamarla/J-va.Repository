import java.util.Scanner;
public class Main
{
    public static void linearSearch(int arr[], int ele){
        boolean found=false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==ele){
                System.out.println(ele +" "+"is found at:"+i);
                found=true;
                break;
            }
        }
        if(!found){ //means found==false;
            System.out.println(ele+" "+"is not found");
        }
    }
	public static void main(String[] args) {
	    int arr[]= {11,22,33,44,55};
	    Scanner sc=new Scanner(System.in);
	    int element = sc.nextInt();
	    linearSearch(arr,element);
		
	}
}