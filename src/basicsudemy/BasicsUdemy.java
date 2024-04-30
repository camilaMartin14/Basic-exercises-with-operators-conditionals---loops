
package basicsudemy;

import java.util.Locale;
import java.util.Scanner;


public class BasicsUdemy {
    /* Ask for 2 numbers and indicate  the minor number
    if they are equal  also indicate it.
    */
    
    public static void main(String[] args) {
   


//SCANNER hacer funcionar
    Scanner scanner = new Scanner (System.in);
    scanner.useDelimiter ("\n"); //si o si esta barra, es para strings largos
    scanner.useLocale(Locale.US);//Usamos . como coma
    

      
    //Ejercicio scanner | Scanner exercise
        Scanner keyboard = new Scanner (System.in);
        keyboard.useDelimiter("\n"); //Alt+92
        
        
        System.out.println("Hello! Please write your name :)");
        String name = keyboard.next();
        
        System.out.println("Welcome " +name + "!");
        System.out.println("------------------------------------");
    
                
        //ask for 2 numbers and show its addition, substraction, multiplication and division

        Scanner kb = new Scanner (System.in);
        System.out.println("Write two numbers you want to calculate below: ");
        System.out.println("Number 1");
        int num1 = kb.nextInt();
        
        System.out.println("Number 2");
        int num2 = kb.nextInt();
        
        
        
        
        int addition = num1 + num2;
        System.out.println("The addition is =" +addition);
        int substraction = num1-num2;
        System.out.println("The substraction is = "+substraction);
        int  multiplication = num1 * num2;
        System.out.println("The multiplication is = " +multiplication);
        double division = (double)num1/num2;
               //Ponemos un casting (pasamos de un tipo a otro compatible)

        
        if (num2 == 0) {
                System.out.println("The division is = It is not posible to divide by 0");
        } else {
               //Metemos un if para que no pueda dividir en 0:

        System.out.println("The division is = "+division);
        }
        
        System.out.println("------------------------------------");

        
        
        System.out.println("Now I am going to show you the smaller of two numbers that you choose using If and Else");
        
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Please insert the fisrt number");
        int num3 = sc.nextInt();
        
        System.out.println("Please insert the second number");
        int num4 = sc.nextInt();
        
        //we condition... 
        
        
        if (num3<=num4) {
            if (num3 == num4) {
                System.out.println("Number 1 and 2 are equals");
            } else  {  
                System.out.println("Number 1 is less than number 2");
            }
        } else   {
            System.out.println("Number 2 is less than number 1");
        } 
        System.out.println("------------------------------------");
        /* 
        Mostrar los números pares que entre el 1 y 10
        */
        System.out.println("Now i am going to show the pair numbers between 1 and 10 with While and For ");
            //While
            System.out.println("While --------------");
            int i=0; //i for integers
            while (i <= 10) {
                if (i % 2 ==0) {
                    System.out.println(i);
                }
                i++;     
            } 
            //For ---> useful for when i have a defined range
            System.out.println("For ---------------");
        for (int j = 1; j <= 10; j++) {
                 if (i % 2 ==0) {
                 }  
            
        }
        System.out.println("------------------------------------");

        //Perdimos un nro por consola y mostramos hasta latabla del 10
        System.out.println("Write a number of which you want to know its table"); 
        Scanner scann = new Scanner (System.in);
        int num5 = scann.nextInt ();
        int res = 0;
        for (int h = 1; h <= 10; h++) {
            res = h * num5;
            System.out.println(num5 + " * " + h + " = "+ res);
            
        }

        
        
        
    
    
    }
    
    
}
