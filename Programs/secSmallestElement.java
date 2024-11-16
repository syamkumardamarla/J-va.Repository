

public class Main
{
    public static void maxElement(int arr[]){
        int max=arr[0],secmax=arr[0];
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
            
        }
        for(int i=0; i<arr.length;i++){
            if(secmax<arr[i] && arr[i]!=max){
                secmax=arr[i];
            }
        }
        
        System.out.println(secmax);
    }
	public static void main(String[] args) {
	    int arr[]={33,13,12,10,45,6,7,4,31};
		maxElement(arr);
	}
}