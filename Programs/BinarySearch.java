

public class Main
{
    
    public static void BinarySearch(int arr[], int ele){
        int low=0,high=arr.length-1;
        
        boolean found=false;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==ele){
               System.out.println("Element is Found at:"+mid);
                found=true;
                break;
            }
            else if(arr[mid]<ele){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(!found){
            System.out.println("element not found");
        }
        
    }
	public static void main(String[] args) {
	    int arr[]={11,22,33,44,55,66,77,88,99};
		BinarySearch(arr,77);
		
	}
}