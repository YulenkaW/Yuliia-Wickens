
package javaapplication14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class JavaApplication14 {

    public static void main(String[] args) throws FileNotFoundException {
            String mode;
            
       Scanner keyboard = new Scanner(System.in);
      
       System.out. println("Hello, which mode are you gonna use?(manage/shop)");
       mode = keyboard.nextLine();
              if (mode.equalsIgnoreCase("manage")){
           String filename;
           String itemName;
           int price;
                             
           System.out.println("Ok, you can write the name of the purchase"); 
           filename=keyboard.nextLine();
           PrintWriter outputFile=new PrintWriter(filename);
           
           System.out.println("Ok, you can write the price of the purchase");
           price=keyboard.nextInt();
           
           for (int i=1; i<=price; i++)
           {
           System.out.print("Enter the name of the product with price  " +i);
           itemName=keyboard.nextLine();
           outputFile.println(itemName);
           }
           outputFile.close();
        
        String useAgain = "Y";

             while (useAgain.equalsIgnoreCase("y")) {
             System.out.println("Do you want to put more items and prices? ( y/n )");
             useAgain = keyboard.nextLine();
             }
              }   
         
           
          else if (mode.equalsIgnoreCase("shop")){
         System.out.println("you are welcome to buy!");
         System.out.print("Enter the name of file with price: ");
             String filename=keyboard.nextLine();
             
            
             File file=new File(filename);
             Scanner PrintWriter = new Scanner(filename); 
        while (PrintWriter.hasNext()) {
            System.out.println(PrintWriter.nextLine());

             if (!file.exists())
                System.out.println("Reading " + file.getAbsolutePath());
            PrintWriter=new Scanner(file); 
            while (PrintWriter.hasNext()) {
                System.out.println(PrintWriter.nextLine());
            }
            PrintWriter.close();
             {
                 System.out.println("you can not buy this item- we do not have it.");
                 System.exit(0);
             }
             Scanner inputFile=new Scanner(file);
             double sum=0;
             while (inputFile.hasNext())
             {
                 double number =inputFile.nextDouble();
                 
                 sum=sum+number;
             }
             inputFile.close();
             String cardNumber;
             System.out.println("your total of the purchase is "+sum);
             System.out.println ("Tell me your card number for to pay for your choise.");
                 cardNumber=keyboard.nextLine();
             System.out.println ("We gonna get the " + sum+ "from your card "+cardNumber);
        }
             }
         
        else
        {
        System.out.println("choose from two modes pls");
        }
}
}

        
                 