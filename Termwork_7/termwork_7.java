/*-----------------------------------------------------------------------------------------------------

    problem statement: 
    
        Write a Java Program to do the following.
        
    Termwork-7

    Date: 13-6-2022

    Author: Meeth Sakaria

-----------------------------------------------------------------------------------------------------*/
import java.io.*;

public class termwork_7 {
    
    public static void main(String[] args) throws IOException{    
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            StreamTokenizer tok = new StreamTokenizer(reader);
            
            while(tok.nextToken()!=tok.TT_EOF)
            {
                String line = tok.sval;
                
                if(line!=null)
                {
                    System.out.println("\n" + line);
                } 
                
                line.length();
                System.out.println("\nThe length of the string is : " + line.length() + "\n");
                
                for(int i=0;i<line.length();i++)
                {
                    if(line.charAt(i)=='a')
                    {
                        System.out.println("'a' is present at index : "+ (i+1));
                    }
                } 
            }
        }catch(NullPointerException e){}
        catch(IOException e){}
    }
}