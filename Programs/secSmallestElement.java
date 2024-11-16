

public class Main
{
    public static void minElement(int arr[]){
        int min=arr[0],secmin=arr[0];
        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){
                min=arr[i];
            }
            
        }
        for(int i=0; i<arr.length;i++){
            if(secmin > arr[i] && arr[i]!=min){
                secmin=arr[i];
            }
        }
        
        System.out.println(secmin);
    }
	public static void main(String[] args) {
	    int arr[]={33,13,12,10,45,6,7,4,31};
		minElement(arr);
	}
}