package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Dairy Queen");
        System.out.println("1# Vanila ice cream");
        System.out.println("2# Chocolate ice cream");
        System.out.println("3# Cookies and cream ice cream");
        System.out.println("4# Mint ice cream");
        System.out.println("5# Oreo ice cream");
        System.out.print("Enter a number between 1 and 10: ");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int number = Integer.parseInt(input);

        do
        {
            if(number > 5 || number < 1 && number != 0)
            {
                System.out.println("Dairy Queen");
                System.out.println("1# Vanila ice cream");
                System.out.println("2# Chocolate ice cream");
                System.out.println("3# Cookies and cream ice cream");
                System.out.println("4# Mint ice cream");
                System.out.println("5# Oreo ice cream");
                System.out.print("Enter a number between 1 and 10: ");
                number = 0;
            }
        }while(number != 1 && number != 2 && number != 3 && number != 4 && number != 5);

        System.out.print("You have ordered number " + number + " thank you have a good day.");

    }
}
