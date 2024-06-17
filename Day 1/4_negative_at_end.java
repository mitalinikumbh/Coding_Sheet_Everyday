/**
 * Ganpati Bappa Morya 
 * Mitali Nikumbh
 */

/**
 * Move all negative elements to end
 */

package Arrays;

import java.util.ArrayList;

public class negative_at_end {
    public static void main(String[] args) {
        int[] arr = {1,-1,3,2,-7,-5,11,6};

        
        int arrcopy[] = new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>=0) {
                arrcopy[k] = arr[i];
                k++;
            }
        }

        for(int i=0;i<arr.length;i++) {
            if(arr[i]<0) {
                arrcopy[k] = arr[i];
                k++;
            }
        }

        for(int i=0;i<arr.length;i++) {
            arr[i] = arrcopy[i];
        }

        for(int i: arr) {
            System.out.print(i+" ");
        }
        
    }
}
