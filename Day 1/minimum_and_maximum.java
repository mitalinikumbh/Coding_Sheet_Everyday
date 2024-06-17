package Arrays;

/**
 * Ganpati Bappa Morya 
 * Mitali Nikumbh
 */

/**
 * find minimum and maximum element in an array
 */

public class minimum_and_maximum {
    public static void main(String[] args) {
        int arr[] = {3,2,1,56,1000,167};

        int max = arr[0];
        int min=arr[0];
        for(int i = 0; i<arr.length;i++)
        {
            if(arr[i]>max)          // returns maximum
            {
                max = arr[i]; 
            }
            if(arr[i]<min){                  // else returns minimum
                min = arr[i];
            }
        }
        System.out.println();

        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
    }
}
