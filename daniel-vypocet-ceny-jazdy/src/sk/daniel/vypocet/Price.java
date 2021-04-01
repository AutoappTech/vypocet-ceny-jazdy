package sk.daniel.vypocet;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Price {
    public static void main(String[] args) {

        float mileage, fuelPrice, averageFuelConsumption;

        while(true) {
            try {
                System.out.println("Enter mileage in km: ");
                Scanner input = new Scanner(System.in);
                mileage = input.nextFloat();
                break;
            }
            catch(InputMismatchException | NumberFormatException ex ) {
                System.out.println("Invalid Number, Please try again");
            }
        }

        while(true) {
            try {
                System.out.println("Enter fuel price per liter in eur: ");
                Scanner input = new Scanner(System.in);
                fuelPrice = input.nextFloat();
                break;
            }
            catch(InputMismatchException | NumberFormatException ex ) {
                System.out.println("Invalid input, Please try again");
            }
        }

        while(true) {
            try {
                System.out.println("Enter average fuel consumption per 100 km: ");
                Scanner input = new Scanner(System.in);
                averageFuelConsumption = input.nextFloat();
                break;
            }
            catch(InputMismatchException | NumberFormatException ex ) {
                System.out.println("Invalid input, Please try again");
            }
        }

        String ridePrice = String.format("%.1f", (mileage / 100) * fuelPrice * averageFuelConsumption);

        System.out.println("\n------------------------\n" +"your ride costed you " + ridePrice + "€");
        System.out.println("since you've gone " + mileage + " km\n" + "and avarage spending was " + averageFuelConsumption + "L/100km");

    }
}
