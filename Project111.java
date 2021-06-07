
package project111;

import java.util.Scanner;

public class Project111 {

   
    public static void main(String[] args) {
      
    String name;
    int creditTotal;
    int creditGot;
    int creditCost;
    int creditSemester;
    double creditLeft;
    double semesterLeft;
    double totalPay;
       
    Scanner keyboard = new Scanner (System.in);
       
        //Users name
        System.out.print("What is your name?");
        name = keyboard.nextLine();
        
        //how many credits total
        System.out.print(name + ",   how many credits shoud you take total?");
        creditTotal=keyboard.nextInt();
        
        //how many got already
        System.out.print(name+ ",  how many credits did you already get?");
        creditGot=keyboard.nextInt();
        
        //calculating how many credits left
        creditLeft=creditTotal-creditGot;
        
        //how many credits per semester
        System.out.print(name + ", how many credits per semester do you usually take?");
        creditSemester=keyboard.nextInt();
        
        //how much is for the one credit
        System.out.print(name + ",  what is the cost per one credit?");
        creditCost=keyboard.nextInt();
        
        semesterLeft=creditLeft/creditSemester;
        totalPay=creditLeft*creditCost;
        
        System.out.print("So"+ name + ",  for to complete your degree you need"
                + " to take more  " + creditLeft + "  credits.\n");
        
        System.out.printf("Which would include %.1f\n", semesterLeft); 
        System.out.print ( "  semesters for you"+
                "  and would cost $"+totalPay);
           
        
    }
    
}
   
    
    

