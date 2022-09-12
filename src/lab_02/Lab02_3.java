package lab_02;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Lab 2.1 + Suggest user to increase/decrease weight
 */
public class Lab02_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Height: ");
        float enterHeight = scanner.nextFloat();

        System.out.println("Please enter Weight: ");
        float enterWeight = scanner.nextFloat();

        float BMI = enterWeight / (enterHeight *2);
        float weightMin = 18.5f * (enterHeight *2);
        float weightMax = 24.9f * (enterHeight *2);

        System.out.printf("Your BMI is: %f\n", BMI);
        System.out.printf("weightMin: %fkg\n", weightMin);
        System.out.printf("weightMax: %fkg\n", weightMax);

        if(enterWeight < weightMin){
            System.out.printf("You need increase: %fkg", weightMin - enterWeight);
        }else {
            System.out.printf("You should reduce: %fkg", enterWeight - weightMax);
        }
    }
}

