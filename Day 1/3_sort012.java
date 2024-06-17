package Arrays;

/**
 * Ganpati Bappa Morya 
 * Mitali Nikumbh
 */

/**
 * Sort an array of 0s, 1s and 2s
 */


// Method 1

public class sort012 {
    public static void main(String[] args) {
        int[] arr = {0,2,1,2,0};

        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i=0;i<arr.length;i++) {
            
            if(arr[i] == 0) {
                zero++;
            }
            else if(arr[i] == 1) {
                one++;
            }
            else {
                two++;
            }
        }

        int i = 0;

        while(zero>0) {
            arr[i] = 0;
            i++;
            zero--;
        }

        while(one>0) {
            arr[i] = 1;
            i++;
            one--;
        }

        while(two>0) {
            arr[i] = 2;
            i++;
            two--;
        }

        for(int j: arr) {
            System.out.println(j);
        }
        
    }
}

// -------------------------------------------------------------------------------------------

// Method 2: Using the inbuild Arrays.sort function [;-) a shortcut method]

import java.util.Arrays;
public class sort012 {
    public static void main(String[] args) {
        int[] arr = {0,2,1,2,0};

        Arrays.sort(arr);

        for(int i: arr) {
            System.out.println(i);
        }
    }
}
