package com.nest.menu;
import java.util.Scanner;
public class MenuDrivenClass {
    public static void main(String[] args) {
        System.out.println("Menu Driven");
        int choice;
          while(true) {
              System.out.println("Select an option");
              System.out.println("1. Add students");
              System.out.println("2. search students");
              System.out.println("3. delete students");
              System.out.println("4. view all students");
              System.out.println("5. Exit ");
              Scanner scanner=new Scanner(System.in);
              choice=scanner.nextInt();

              switch(choice)
              {
                  case 1:
                      System.out.println("Add student Selected");
                      break;
                  case 2:
                      System.out.println("Search Student Selected");
                      break;
                  case 3:
                      System.out.println("delete Student Selected");
                      break;
                  case 4:
                      System.out.println("view all Student Selected");
                      break;

                  case 5:
                      System.exit(0);
                      break;
              }
          }
    }
}
