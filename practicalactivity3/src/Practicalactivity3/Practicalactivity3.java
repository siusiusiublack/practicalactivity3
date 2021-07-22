/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicalactivity3;
import java.util.Scanner;

/**
 *
 * @author meilingandrea
 */
public class Practicalactivity3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("We provide 4 options to you as below: ");//Display option to user
        System.out.println("1. Orange ,price:$2/piece");
        System.out.println("2. Pineapple ,price:$3/piece");
        System.out.println("3. Lemon ,price:$4/piece");
        System.out.println("4. Apple,price:$5/piece");
        System.out.println("0. Exit ");
        System.out.println("Please enter your option:  ");
        
        int option = input.nextInt();//User can input what option they want here
        int one =0;//Define options as intergers
        int two =0;
        int three=0;
        int four=0;
        int sum =0;//Define the sum of option's quantity as interger
        int sum2 =0;
        int sum3 =0;
        int sum4 =0;
        while (option !=0)//user input their option to trigger the quantity loop
        {
            switch (option){//user input the quantity they want 
                case 1:
                    System.out.println("Enter the quantity  u want");
                    one = input.nextInt();
                    sum+= one;
                    break ;
                    
                case 2:
                    System.out.println("Enter the quantity u want");
                    two = input.nextInt();
                    sum2+=two;
                    break;
                    
                case 3:
                    System.out.println("Enter the quantity u want");
                    three =input.nextInt();
                    sum3+=0;
                    break;
                    
                case 4:
                    System.out.println("Enter the quantity u want");
                    four =input.nextInt();
                    sum4+=0;
                    break;
                    
                    
                    
                    
                default :
                    System.out.println("your input is invalid");
                    break;
                         
            }
            
        System.out.println("We provide 4 options to you as below: ");//Display input option to user
        System.out.println("1. Orange ");
        System.out.println("2. Pineapple ");
        System.out.println("3. Lemon ");
        System.out.println("4. Apple");
        System.out.println("0. Exit ");
        System.out.println("Please enter your option:  ");
        
        option = input.nextInt();
           
        }
        System.out.println("you have exited ");
        
        if ( one > 0 ){System.out.println("here is how many Orange u orderd :"+sum+" and how much u need to pay $"+sum*2);}//display quantity output and how much user need to pay for the fruits
        if ( two > 0 ){System.out.println("here is how many Pineapple u orderd :"+sum2+" and how much u need to pay $"+sum2*3);}
        if ( three >0 ){System.out.println("here is how many Lemon u orderd :"+sum3+" and how much u need to pay $"+sum3*4);}
        if ( four >0 ){System.out.println("here is how many Apple u ordered"+sum4+" and how much u need to pay $"+sum4*5);}
       
        
        
        
        
        
        
        
       
    }
    
   
    
}   
