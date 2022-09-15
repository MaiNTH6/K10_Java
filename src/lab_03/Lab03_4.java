package lab_03;
/**
 * Merge 2 SORTED integer array into one SORTED array
 *
 * Array 01: {1, 12, 16, 28, 34}
 * Array 02: {1, 13, 16, 27, 99}
 *
 * Expected output: {1, 1, 12, 13, 16, 16, 27, 28, 34, 99}
 */

public class Lab03_4 {
    public static void main(String[] args) {
        int[] myArray1 = {1,0,5,77,80};
        int[] myArray2 = {9,10,5,70,88};
        System.out.println("After merge array: ");
        // Cong mang
        int arrayLength = myArray1.length + myArray2.length;
        int[] mergeArray = new int[arrayLength];
        int i =0;
        for (int arrayElement : myArray1) {
            mergeArray[i] = arrayElement;
            i++;
        }
        for (int arrayElement : myArray2) {
            mergeArray[i] = arrayElement;
            i++;

        }
        // Sap xep tang dan
        for (int j = 0; j < arrayLength; j++) {
            for (int k = 0; k < arrayLength ; k++) {
                if(mergeArray[j] < mergeArray[k]){
                    int tg = mergeArray[j];
                    mergeArray[j] = mergeArray[k];
                    mergeArray[k] = tg;

                }

            }

        }
        for (int j = 0; j < arrayLength; j++) {
            System.out.println(mergeArray[j]);

        }
    }
}
