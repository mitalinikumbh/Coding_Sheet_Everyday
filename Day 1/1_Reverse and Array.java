package Arrays;

/**
 * Ganpati Bappa Morya 
 * Mitali Nikumbh
 */


/**
 * reverse_an_array
 */




// By using an extra array (not an optimized solution) 
public class reverse_an_array {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int revA[] = new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            revA[i] = arr[arr.length-i-1];
        }

        for(int i =0;i<revA.length;i++)
        {
            System.out.print(revA[i]+" ");
        }
    }
}

// -------------------------------------------------------------------------------------------------------------------
// Method 2: Change the array in place 

public class reverse_an_array {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};

        int start = 0;    // 0
        int end = arr.length-1;  // 4
        int temp; // variable to store the first element of the array

        // using the while loop for iteration
        while(start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        } 

        for(int i: arr)
        {
            System.out.print(i+" ");
        }
    }
}
