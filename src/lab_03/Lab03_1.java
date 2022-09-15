package lab_03;
/**
 * Count how many odd, even number(s) in an integer array
 *
 * int[] intArr = {1, 2, 3, 4, 5};
 *
 * Even numders: 2
 * Odd numbers: 3
 */
public class Lab03_1 {
    public static void main(String[] args) {

        int[] myIntArray = {1,2,3,4,5,2,101};
        int arraylength = myIntArray.length;
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < arraylength; i++) {
            if(myIntArray[i]%2 ==0){
                countEven ++;
            
        }else{
                countOdd ++;
            }
        }
        System.out.printf("Count Even number: %d\n", countEven);
        System.out.printf("Count Odd number: %d\n", countOdd);
    }
}
