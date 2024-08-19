import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String args[]) {
		
		int search[] = {1, 2, 3, 4, 5, 6, 7, 8};
		binarySearch(search, 0, search.length-1, 2);
	}
	
	public static void binarySearch(int arr[], int first, int last, int key) {
		
		int mid =(first+last)/2;
		
		while(first <=last) {
			
			if(arr[mid] <key) {
				first =mid+1;
			}else if(arr[mid] ==key) {
				System.out.println("Element is found at index: " + mid);  
		        break;  
			}else {
				last =  mid-1;
			}
			
			mid =(first+last)/2;
			
			
		}
		
		if(first>last) {
			System.out.println("No Element Found");
		}
		
		
	}

}
