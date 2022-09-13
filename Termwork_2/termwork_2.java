/*--------------------------------------------------------------------------------------------
    
    problem statement: 
        
        Prepare object oriented design specification for the following problem 
        description and implement in Java language.

        You are asked to write a discount system for a beauty saloon, which provides services 
        and sells beauty products. It offers 3 types of memberships: Premium, Gold and Silver. 
        Premium, gold and silver members receive a discount of 20%, 15%, and 10%, respectively, 
        for all services provided. Customers without membership receive no discount. All members 
        receive a flat 10% discount on products purchased. Your system shall consist of three 
        classes: Customer, Discount and Visit. It shall compute the total bill if a customer 
        purchases x of products and y of services,for a visit.

    Termwork-2

    Date: 1-5-2022

    Author: Meeth Sakaria

    Theory: 

    -> toString: It is a method present in object class. Every class is initially 
    extended from the object class, hence we can override the toString method.
    it is used to convert any input to string.

    -> 'This': It is used to refer to the current object in a method. 
    It will differentiate between parameters and variables of present class.

--------------------------------------------------------------------------------------------*/

import java.util.*;

class Customer {

    private String name;
    private boolean member;
    private int memberType;
    private int Id;

    public Customer() {
        this.member = false;
    }

    public Customer(int Id,String name, boolean member, int memberType) {
        this.Id = Id;
        this.name = name;
        this.member = member;
        this.memberType = memberType;
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public int getMemberType() {
        return memberType;
    }

    public void setMemberType(int memberType) {
        this.memberType = memberType;
    }

    public int getCustomerId(){
        return Id;
    }

    public String printMemberType(int type){
        if(type==1)
            return "Premium";
        else if(type==2)
            return "Gold";
        else if(type==3)
            return "Silver";
        else
            return "No Membership";
    }
}

class Visit extends Customer {

    private Customer name;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer name, Date date) {
        this.name = name;
        this.date = date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = this.serviceExpense + serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = this.productExpense + productExpense;
    }

    public double getTotalExpense() {
        return  (serviceExpense - (serviceExpense * Discount.getServiceDiscount(name.getMemberType()))) +
                (productExpense - (productExpense * Discount.getProductDiscount(name.getMemberType())));

    }

    public String toString() {
        return "\n  customer name: " + name.getName() +"\n  customer member: " + name.isMember() +
                "\n  customer member type: " + name.printMemberType(name.getMemberType()) +"\n  date: " + date +
                "\n  serviceExpense: " + serviceExpense +"\n  productExpense: " + productExpense;
    }
}

class Discount {

    public static double getServiceDiscount(int type) {
        if(type==1)
            return 0.2;         //service discount premium;
        else if(type==2)
            return 0.15;        //service discount gold;
        else if(type==3)
            return 0.1;         //service discount silver;
        else
            return 0;
    }

    public static double getProductDiscount(int type) {
        if(type==1)
                return 0.1;     //product discount;
        else if(type==2)
                return 0.1;     //product discount;
        else if(type==3)
                return 0.1;     //product discount;
        else
            return 0;
    }
}

public class termwork_2{

    private static int i=0;
    
    //variables to hold customer details
    private static int customerId;
    private static String customerName;
    private static boolean ismember;
    private static int membertype;
    private static Customer customerPool[] = new Customer[100];
    static int customerIndex = -1;
    static boolean customerFound = false;
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args){
        
        int menuChoice=0;
        
        while(menuChoice!=3){
            try{
                System.out.printf("\n\n");
                System.out.println("  MENU    ");
                System.out.println("  --------------------    ");  
                System.out.println("  1 to Create Customer");
                System.out.println("  2 to Customer visit"); 
                System.out.println("  3 to Exit");
                System.out.print("  Enter an your option : ");
                menuChoice = in.nextInt ();
                switch (menuChoice)
                {
                    case 1 : {
                        createCustomer();
                        break;
                    }
                    case 2 : {
                        customerVisit();
                        break;
                    }
                }
            } finally{};
        }
    }
    
    private static void createCustomer(){
        
        System.out.print("\n  Enter customer Id: ");
        customerId = in.nextInt();
        
        if(isCustomer(customerId) == true){
            System.out.println("  Customer Id already exist");
        }
        else {
            in.nextLine();

            System.out.print("  Enter Customer name: ");
            customerName = in.nextLine();
            
            System.out.print("  is the customer a member: ");
            ismember = in.nextBoolean();
            
            if(ismember){
                System.out.println("\n  1: Premium\n  2: Gold\n  3: Silver\n  4: No membership\n");
                System.out.print("  Enter the membership type: ");
                membertype = in.nextInt();
            }
            else{
                membertype = 4;
            }
            
            customerPool[i] = new Customer(customerId,customerName,ismember,membertype);
            System.out.println("  the customer created is: " + customerPool[i].toString());
            i++;
        }

    }

    private static void customerVisit(){
        
        System.out.print("\n  Enter customer Id: ");
        customerId = in.nextInt();
        
        if(isCustomer(customerId) == true)
            computeBill(customerPool[customerIndex]);
        else
            System.out.println("  Customer not Found");
    }

    private static void computeBill(Customer c){
        
        double product,service;
        Visit v1 = new Visit(c, new Date());    
        
        System.out.print("  Enter the service expense: ");
        service = in.nextDouble();
        v1.setServiceExpense(service);
        
        System.out.print("  Enter the product expense: ");
        product = in.nextDouble();
        v1.setProductExpense(product);
        
        System.out.println("\n  The details of the customer are: ");
        System.out.println(v1.toString());
        System.out.println("  Total expense made by " + c.getName() + " = " + v1.getTotalExpense());
    }

    private static boolean isCustomer(int customerId){
        
        int j=0;
        customerFound=false;
        
        while((customerFound == false)&&(j<i)){
            if(customerId == customerPool[j].getCustomerId()){
                customerFound = true;
                customerIndex = j;
            }
            j++;
        }
        return customerFound;
    }
}

/*---------------------------------------------------------
    
    Sample input and output:

    CASE 1:

        MENU
        --------------------
        1 to Create Customer
        2 to Customer visit
        3 to Exit
        Enter an your option : 1
    
        Enter customer Id: 15
        Enter Customer name: chris
        is the customer a member: true
    
        1: Premium
        2: Gold
        3: Silver
        4: No membership

        Enter the membership type: 1
        the customer created is: Customer@16b98e56


    CASE 2:
    
        MENU
        --------------------
        1 to Create Customer
        2 to Customer visit
        3 to Exit
        Enter an your option : 2
    
        Enter customer Id: 15
        Enter the product expense: 6000
        Enter the service expense: 8000
        
        The details of the customer are:

        customer name: chris
        customer member: true
        customer member type: Premium
        date: Sun May 01 19:30:55 IST 2022
        serviceExpense: 8000.0
        productExpense: 6000.0
        Total expense made by chris = 11800.0

---------------------------------------------------------*/