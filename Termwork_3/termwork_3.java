/*--------------------------------------------------------------------------------------------

    problem statement: 
        
        Write a Java Program for the following problem scenario.

        Scenario:
        A package named "BasicMath" is to be created which has a class named Basic and has 
        methods to perform following computations:

        i.   Addition of two numbers
        ii.  Subtraction of two numbers.
        iii. Multiplication of two numbers
        iv.  Division of two numbers.

        Another package named "AdvancedMath" is to be created which has a class named Advanced 
        and has methods to perform following computations using built in features of java.

        i.   Find sine of an angle.
        ii.  Find ab.
        iii. Find log10 of a number.

        To test above scenes, another class named TestDemo is to be created defined inside a 
        default package. This class must invoke all the methods of Basic and Advanced classes.

    Termwork-3

    Date: 1-5-2022

    Author: Meeth Sakaria

    Theory: 

    -> Packages: Package in Java is a mechanism to encapsulate a group of classes,
    sub packages and interfaces.

--------------------------------------------------------------------------------------------*/

import BasicMath.Basic;
import AdvancedMath.Advanced;
import java.util.Scanner;
import java.text.DecimalFormat;

public class termwork_3{
    
    private static final DecimalFormat df = new DecimalFormat("0.0000");
    private static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int menuChoice=0;
        
        while(menuChoice!=8){
            try{
                System.out.printf("\n\n\n\n");
                System.out.println("  MENU ");
                System.out.println("  ------------------- "); 
                System.out.println("  1 to ADD two numbers");
                System.out.println("  2 to Subtract two numbers"); 
                System.out.println("  3 to Multiply two numbers");
                System.out.println("  4 to Divide two numbers"); 
                System.out.println("  5 to find sine of the given angle in degrees");
                System.out.println("  6 to find absolute value"); 
                System.out.println("  7 to find log10");
                System.out.println("  8 to Exit");
                
                System.out.print ("  Enter your option : ");
                menuChoice = in.nextInt ();
                
                switch (menuChoice)
                {
                    case 1 : {
                        add();
                        break;
                    }
                    case 2 : {
                        subtract();
                        break;
                    }
                    case 3 : {
                        multiply();
                        break;
                    }
                    case 4 : {
                        divide();
                        break;
                    }
                    case 5 : {
                        sine();
                        break;
                    }
                    case 6 : {
                        abs();
                        break;
                    }
                    case 7 : {
                        log();
                        break;
                    }
                }
            } finally{}
        }
    }   

    private static void add() {
        
        float num1,num2,res;
        
        System.out.print("  Enter two numbers: ");
        num1=in.nextInt();
        num2=in.nextInt();
        
        Basic b1 = new Basic();
        res=b1.addition(num1, num2);
        
        System.out.println("  The addition of two numbers is: " + df.format(res));
    }

    private static void subtract() {
        
        float num1,num2,res;
        
        System.out.print("  Enter two numbers: ");
        num1=in.nextInt();
        num2=in.nextInt();
        
        Basic b2 = new Basic();
        res=b2.subtraction(num1, num2);
        
        System.out.println("  The subtraction of two numbers is: " + df.format(res));
    }

    private static void multiply() {
        
        float num1,num2,res;
        
        System.out.print("  Enter two numbers: ");
        num1=in.nextInt();
        num2=in.nextInt();
        
        Basic b3 = new Basic();
        res=b3.multiplication(num1, num2);
        
        System.out.println("  The multiplication of two numbers is: " + df.format(res));
    }

    private static void divide() {
        
        float num1,num2,res;
        
        System.out.print("  Enter two numbers: ");
        num1=in.nextInt();
        num2=in.nextInt();
        
        Basic b4 = new Basic();
        res=b4.division(num1, num2);
        
        System.out.println("  The division of two numbers is: " + df.format(res));
    }

    private static void sine() {
        
        double degree,res;
        
        System.out.print("  Enter the angle in degrees: ");
        degree=in.nextInt();
        
        Advanced a1 = new Advanced();
        res=a1.sine(degree);
        
        System.out.println("  The sine of " + degree + "is:" + df.format(res));
    }

    private static void abs() {
        
        double num,res;
        
        System.out.print("  Enter a number: ");
        num=in.nextInt();
        
        Advanced a2 = new Advanced();
        res=a2.ab(num);
        
        System.out.println("  The absolute value is: " + df.format(res));
    }

    private static void log() {
        
        double num,res;
        
        System.out.print("  Enter a number: ");
        num=in.nextInt();
        
        Advanced a3 = new Advanced();
        res=a3.log(num);
        
        System.out.println("  The log10 value is: " + df.format(res));
    }
}

/*--------------------------------------------------------------

    Sample input and output:

    CASE 1:

        MENU
        -------------------
        1 to ADD two numbers
        2 to Subtract two numbers
        3 to Multiply two numbers
        4 to Divide two numbers
        5 to find sine of the given angle in degrees
        6 to find absolute value
        7 to find log10
        8 to Exit
        Enter your option : 1
        Enter two numbers: 2 3
        The addition of two numbers is: 5.0000

    
    CASE 2:

        MENU
        -------------------
        1 to ADD two numbers
        2 to Subtract two numbers0.
        3 to Multiply two numbers
        4 to Divide two numbers
        5 to find sine of the given angle in degrees
        6 to find absolute value
        7 to find log10
        8 to Exit
        Enter your option : 2
        Enter two numbers: 3 2
        The subtraction of two numbers is: 1.0000


    CASE 3:

        MENU
        -------------------
        1 to ADD two numbers
        2 to Subtract two numbers
        3 to Multiply two numbers
        4 to Divide two numbers
        5 to find sine of the given angle in degrees
        6 to find absolute value
        7 to find log10
        8 to Exit
        Enter your option : 3
        Enter two numbers: 2 3
        The multiplication of two numbers is: 6.0000

    CASE 4:

        MENU
        -------------------
        1 to ADD two numbers
        2 to Subtract two numbers
        3 to Multiply two numbers
        4 to Divide two numbers
        5 to find sine of the given angle in degrees
        6 to find absolute value
        7 to find log10
        8 to Exit
        Enter your option : 4
        Enter two numbers: 4 2
        The division of two numbers is: 2.0000


    CASE 5:
    
        MENU
        -------------------
        1 to ADD two numbers
        2 to Subtract two numbers
        3 to Multiply two numbers
        4 to Divide two numbers
        5 to find sine of the given angle in degrees
        6 to find absolute value
        7 to find log10
        8 to Exit
        Enter your option : 5
        Enter the angle in degrees: 45
        The sine of 45.0 is:0.7071

    
    CASE 6:

        MENU
        -------------------
        1 to ADD two numbers
        2 to Subtract two numbers
        3 to Multiply two numbers
        4 to Divide two numbers
        5 to find sine of the given angle in degrees
        6 to find absolute value
        7 to find log10
        8 to Exit
        Enter your option : 6
        Enter a number: -8
        The absolute value is: 8.0000

    
    CASE 7:

        MENU
        -------------------
        1 to ADD two numbers
        2 to Subtract two numbers
        3 to Multiply two numbers
        4 to Divide two numbers
        5 to find sine of the given angle in degrees
        6 to find absolute value
        7 to find log10
        8 to Exit
        Enter your option : 7
        Enter a number: 150
        The log10 value is: 2.1761

--------------------------------------------------------------*/

