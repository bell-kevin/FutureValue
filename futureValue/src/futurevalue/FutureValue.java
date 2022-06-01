package futurevalue;

import java.util.Scanner;

public class FutureValue {

    public static void main(String[] args) {
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
