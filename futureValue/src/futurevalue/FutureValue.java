/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futurevalue;

import java.util.Scanner;

/**
 *
 * @author 4800590195
 */
public class FutureValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Future Value Calculator by Kevin Bell \n");
        Scanner computerKeyboardInput = new Scanner(System.in);
        double interestRate;
        double futureValue = 0;
        int numberOfCycles = 0;
        double growthAmount;
        double presentValue;
        int i;
        System.out.print("How much money are you depositing? ");
        presentValue = computerKeyboardInput.nextDouble();
        System.out.print("Which interest rate did you choose? ");
        interestRate = computerKeyboardInput.nextDouble();
        System.out.print("How many cycles do you want to wait? ");
        numberOfCycles = computerKeyboardInput.nextInt();
        interestRate = interestRate / 100.00;
        futureValue = presentValue;
        for (i = 0; i < numberOfCycles; i++) {
            growthAmount = futureValue * interestRate;
            futureValue = futureValue + growthAmount;
        }
        System.out.println("After " + numberOfCycles + " cycles, it's worth $" + futureValue);
    }
}
