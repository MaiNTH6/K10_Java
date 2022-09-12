package lab_02;

import java.util.Scanner;

/**
 * Get input from user about height(m) and weight(kg) then calculate BMI
 *
 *     Underweight = <18.5
 *     Normal weight = 18.5 – 24.9
 *     Overweight = 25–29.9
 *     Obesity = BMI of 30 or greater
 *
 * BMI = weight / (height x 2)
 */

public class Lab02_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter height: ");
        float enterHeight = scanner.nextFloat();

        System.out.println("Please enter weight: ");
        float enterWeight = scanner.nextFloat();

        float BMI = enterWeight / (enterHeight * 2);

        System.out.printf("Your Height is: %fm\n", enterHeight);
        System.out.printf("Your Weight is: %fkg\n", enterWeight);
        System.out.printf("Your BMI is: %f - ", BMI);

        if(BMI <=18.5){
            System.out.println("Underweight");
        }else if(BMI <= 24.9){
            System.out.println("Normal weight");
        }else if(BMI >=25 && BMI <= 29.9){
            System.out.println("Overweight");
        }else{
            System.out.println("Obesity");
        }

    }
}
