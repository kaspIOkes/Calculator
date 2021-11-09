package com.company;

import javax.lang.model.type.NullType;
import java.util.Scanner;

public class Main {

    public static void mainMenu (){
        System.out.println("Menu:");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.print("What's your choice ?: ");
    }

    public static void calculation (int operator){
        int a = 0, b = 0, c = 0;
        double aDou = 0, bDou = 0, cDou = 0;

        Scanner scanInt = new Scanner(System.in);

        switch (operator){
            case 1: System.out.println("_-==Addition==-_");
                break;
            case 2: System.out.println("_-==Substraction==-_");
                break;
            case 3: System.out.println("_-==Multiplication==-_");
                break;
            case 4: System.out.println("_-==Division==-_");
                break;
            default: System.out.println("Operator unknown");
                break;
        }

            System.out.print("Input first number: ");
            aDou = scanInt.nextDouble();
            System.out.print("Input second number: ");
            bDou = scanInt.nextDouble();

        switch (operator){
            case 1: cDou = aDou + bDou;
                System.out.println("Addition is : " + cDou);
                break;
            case 2: cDou = aDou - bDou;
                System.out.println("Substraction is : " + cDou);
                break;
            case 3: cDou = aDou * bDou;
                System.out.println("Multiplication is : " + cDou);
                break;
            case 4:
                if  (aDou != 0){
                    if (bDou != 0){
                        cDou = aDou / bDou;
                        System.out.println("Division is : " + cDou);
                        break;
                    } else System.out.println("Don't divide with 0!");
                } else System.out.println("Don't divide with 0!");

            default:
                System.out.println(".");
            }
        }


    public static void main(String[] args) {

        int choice;
        String continueIt = null, isTrue = "n";
        Scanner inputChoice = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);


        do {
            mainMenu();
            try {
                choice = inputChoice.nextInt();
                calculation(choice);
                System.out.println("Would you like to exit, (Y/N) ?:  ");
                continueIt = inputStr.next();
            }catch (Exception exception) {
                System.out.println("There is no such choice!");
                System.out.println("Please reload the app.");
            }finally {
                System.out.println("Thank you.");
            }
        } while (isTrue.equalsIgnoreCase(continueIt));

        


    }
}
