/*---------------------------------------------------------------------------------------------

    problem statement: 

        Write a Java Program to do the following.

        a) It takes a string as command-line argument and checks whether it is palindrome or not.
        b) If the string is palindrome, then it must print its length and
        c) If the string is palindrome, then it converts that string to upper case letters.
        d) If the string is not palindrome, then it should generate a user-defined
        exception StringNotPalindromeException.

    Termwork-4

    Date: 09-5-2022

    Author: Meeth Sakaria

    Theory:
    
    -> Exception: A java exception is an object that describes an exceptional 
    condition that has occurred in a piece of code
    
    -> Try: The try statement allows user to define a block of code to  be tested for 
    errors while it is being executed.
    
    -> Catch: The catch statement allows user to define a block of code to be executed
    if an error occurs in the ter block.

---------------------------------------------------------------------------------------------*/

class StringNotPalindromeException extends Exception {
}

public class termwork_4{
    public static void main(String[] args){
        
        int i=0,n;
        String s1,s2="";
        
        s1=args[0];
        n=s1.length();
        
        for (i = (n- 1); i >=0; --i) {
            s2 = s2 + s1.charAt(i);
        }
        
        try {
            if (s1.toLowerCase().equals(s2.toLowerCase())) 
            {
                System.out.println(s1 + " is a Palindrome String.");
                System.out.println("The length of the string is " + s1.length());
                System.out.println("The string in upper case is " + s1.toUpperCase());
            }
            else
                throw new StringNotPalindromeException();
        } catch (StringNotPalindromeException s) {
            System.out.print("String is not Palindrome: " + s);
        }
    }
}

/*--------------------------------------------------------------------------------------------
    
    Sample input and output 
    
    CASE 1:

        PS C:\Users\Dell\Desktop\Termwork_4> java termwork_4      
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out 
        of bounds for length 0 at termwork_4.main(termwork_4.java:38)
    
    CASE 2:

        PS C:\Users\Dell\Desktop\Termwork_4> java termwork_4 meeth
        String is not Palindrome: StringNotPalindromeException
    
    CASE 3:

        PS C:\Users\Dell\Desktop\Termwork_4> java termwork_4 gadag
        gadag is a Palindrome String.
        The length of the string is 5
        The string in upper case is GADAG
        
--------------------------------------------------------------------------------------------*/