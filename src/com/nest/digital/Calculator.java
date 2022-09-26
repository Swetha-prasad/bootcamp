package com.nest.digital;
import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args) {
        System.out.println("calculator");
        int x = 15, y = 12;
        int choice;
        while (true) {
            System.out.println("select an option");
            System.out.println("1.select addition");
            System.out.println("2.select subtraction");
            System.out.println("3.select multiplication");
            System.out.println("4.select division");
            System.out.println("5. Exit");
            Scanner scanner=new Scanner(System.in);
            choice =scanner.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println(x+y);
                    break;
                case 2:
                    System.out.println(x-y);
                    break;
                case 3:
                    System.out.println(x*y);
                    break;
                case 4:
                    System.out.println(x/y);
                    break;
                case 5:
                    System.exit(0);
            }

        }
    }
}
