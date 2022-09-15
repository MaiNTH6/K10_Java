package lab_03;
/**
 * Sort an integer array from min to max
 *
 * Input: {12, 34, 1, 16, 28}
 * Expected output: {1, 12, 16, 28, 34}
 */
public class Lab03_3 {
    public static void main(String[] args) {
        int[] intArray = {7,0,11,9,25,7,9,23};
        int arrayLength = intArray.length;
        System.out.println("Sort array from min to max: ");
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                if(intArray[i] < intArray[j]){
                    int tg = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = tg;
                }

            }

        }

        for (int i = 0; i < arrayLength; i++)
            System.out.println(intArray[i] + " ");

        }

    }

