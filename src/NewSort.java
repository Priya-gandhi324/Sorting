
public class NewSort {
	
	void sort(int arr[]) 
    { 
        int n = arr.length; 

        for (int i = 0; i < n-1; i++) 
        { 
            //minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swap minimum element with the first element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 

    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        NewSort ob = new NewSort(); 
	        int arr[] ={30,6,15,27,42,3,19};
	        
	        System.out.print("Original array: ");
	        ob.printArray(arr);
	        
	        ob.sort(arr);	//calling the new sort function 
	        System.out.print("Sorted array: "); 
	        ob.printArray(arr); 
	}

}
