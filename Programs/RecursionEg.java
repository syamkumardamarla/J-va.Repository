
public class Main
{
    public static int Sum(int num){
        if(num>0){
            return num+Sum(num-1);
        }
        else{
            return num;
        }

    }

	public static void main(String[] args) {
		//System.out.println("Hello World");
        System.out.println(Sum(10));
	}
}