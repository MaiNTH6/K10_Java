package lab_03;
/**
 * Finding maximum value/minimum value from an integer array
 *
 * int[] intArr = {1, 2, 3, 4, 5};
 *
 * Minimum: 1
 * Maximum: 5
 */

public class Lab03_2 {
    public static void main(String[] args) {
        int[] intArray = {10, 9, 15, 3, 18, 32, 33};
        int arrayLength = intArray.length;

        int minArray = intArray[0];
        int maxArray = intArray[0];

        for (int i = 0; i < arrayLength; i++) {
            if(minArray > intArray[i]){
                minArray = intArray[i];
            }
            if(maxArray < intArray[i]){
                maxArray = intArray[i];
            }

        }
        System.out.printf("Maximum value in array: %d\n", maxArray);
        System.out.printf("Minimum value in array: %d\n", minArray);

    }
}
