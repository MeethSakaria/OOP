/*--------------------------------------------------------------------------------------------

    problem statement: 
    
        Write a Java Program to do the following. 

        a) Creates three threads.
        b) The first thread should print the prime numbers between 1 and 100;
        c) Second thread should print prime numbers between 101 and 200; and
        d) Third thread should print prime numbers between 201 and 300.
        e) It is mandatory that first thread must print first, followed by second and third threads.
        f) Output should be:
        Thread-SMJ: Primes between 1 and 100 
        Thread-JVV: Primes between 101 and 200 
        Thread-Myself: Primes between 201 and 300
        g) All threads must call the same method generatePrime () to print prime numbers.

    Termwork-5

    Date: 18-5-2022

    Author: Meeth Sakaria

    Theory: 

    -> Threads: Threads are subprocess with lightweight with the smallest unit of 
    processes and also has separate paths of execution.

    Threads can be created using two methods:
        1) By extending Thread Class.
        2) By Implementing a Runnable interface.

--------------------------------------------------------------------------------------------*/

import java.util.*;

class NewThread implements Runnable { 
    
    String name;
    Thread t;
    int num1,num2;
    
    public synchronized void generatePrime(String name,int num1,int num2){ 
        
        int flag;
        System.out.println("The prime numbers between " + num1 + " and " + num2 + " are: ");
        
        for(int i = num1; i<=num2; i++) {
            flag = 1;
            for(int j = 2; j<=Math.sqrt(i); j++)
            {
                if(i%j == 0)
                {
                    flag = 0;
                    break;  
                }
            }
            if(flag == 1)
                System.out.println(i);        
        }
    }
    
    NewThread(String threadname, int num1,int num2) { 
        name = threadname;
        t = new Thread(this, name);  
        this.num1=num1;
        this.num2=num2;
    }

    public  void run() {
        System.out.println("New thread: " + t);   
        generatePrime(name, num1, num2);
    }
}
     
class termwork_5 {
    public static void main(String args[]) {    
        
        NewThread t1 = new NewThread("SMJ",1,100);
        NewThread t2 = new NewThread("JVV",101,200);
        NewThread t3 = new NewThread("Myself",201,300);
    
        try{
            t1.t.start();
            t1.t.join();

            t2.t.start();
            t2.t.join();

            t3.t.start();
            t3.t.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

/*--------------------------------------------------------------
    
    Sample input and output

        New thread: Thread[SMJ,5,main]
        The prime numbers between 1 and 100 are: 
        1
        2
        3
        5
        7
        11
        13
        17
        19
        23
        29
        31
        37
        41
        43
        47
        53
        59
        61
        67
        71
        73
        79
        83
        89
        97
        New thread: Thread[JVV,5,main]
        The prime numbers between 101 and 200 are:
        101
        103
        107
        109
        113
        127
        131
        137
        139
        149
        151
        157
        163
        167
        173
        179
        181
        191
        193
        197
        199
        New thread: Thread[Myself,5,main]
        The prime numbers between 201 and 300 are:
        211
        223
        227
        229
        233
        239
        241
        251
        257
        263
        269
        271
        277
        281
        283
        293
        
--------------------------------------------------------------*/