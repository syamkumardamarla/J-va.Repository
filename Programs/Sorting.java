

public class Main
{
	public static void main(String[] args) {
		int arr[]={99,11,33,55,22,77,44,88,66};
		int i,j;
		//Bubble sort
		for( i=0; i<arr.length; i++){
		    for( j=0; j<arr.length-1-i; j++){
		        if(arr[j]>arr[j+1]){
		            int temp=arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=temp;
		        }
		    }
		}
		System.out.println("*******Ascending Order******");
		for(i=0; i<arr.length; i++){
		    
		   System.out.println(arr[i]);
		    }
        System.out.println("*******Descending Order******");
		for(i=arr.length-1; i>0; i--){
		    
		   System.out.println(arr[i]);
		 }
	}
}