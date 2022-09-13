/*-----------------------------------------------------------------------------------------------------

    problem statement: 
    
        Write a Java Program to do the following.
        
        a) Create an interface AdvancedArithmetic which contains a method signature 
        int divisor_sum (int n).
        b) Create a class called MyCalculator which implements the interface.
        c) The divisorSum function returns the sum of all the divisors of 'n' supplied as parameter. 
        For example, divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value 
        of n will be at most 1000.

    Termwork-6

    Date: 15-5-2022

    Author: Meeth Sakaria

    Theory:
    
    -> interface: An interface in JAVA programming language is defined as an abstract type 
    used to specify the behaviour of a class. An interface contains static constant and 
    abstract methods. In the JAVA interface only abstract methods are permitted not 
    the method body.

-----------------------------------------------------------------------------------------------------*/

import java.util.Scanner;

interface AdvancedArithmetic{
   int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic{
    
    public int divisor_sum(int n){
        
        int sum=1,i;
        
        if(n<=1000)
        {
            for(i=2;i<=(n/2);i++)
            {
                if(n%i==0)
                    sum=sum+i;
            }
            if(n!=1)
                return sum+n;
            else 
                return sum;
        }
        else 
        {
            System.out.println("\nNumber is outside the range\n");
            System.exit(0);
            return(0);
        }
    }
}

public class termwork_6 {
    
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.print("\nEnter the number: ");
        int n=in.nextInt();
        
        AdvancedArithmetic c = new MyCalculator(); 
        int sum = c.divisor_sum(n);
        
        System.out.println("\nThe sum of all the divisors of " + n + " is: " + sum);
    }
}

/*---------------------------------------------------------

    Sample input and output

    CASE 1:    
        
        Enter the number: 254

        The sum of all the divisors of 254 is: 384    
    
    CASE 2:

        Enter the number: 2585

        Number is outside the range
        
---------------------------------------------------------*/