/**
 * Ganpati Bappa Morya 
 * Mitali Nikumbh
 */

/**
 * Cyclically rotate an array by one
 */


package Arrays;

public class rotate_by_one {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        
        int temp = arr[arr.length-1];
        

        for(int i=arr.length-1;i>0;i--) {
            int j=i-1;
            arr[i] = arr[j];
            j--;
        }


        arr[0] = temp;

        for(int i: arr) {
            System.out.print(i+" ");
        }
    }    
}
