/*--------------------------------------------------------------------------------------------

    problem statement: 
        
        Solving the given UML diagram and implementing it.

    Termwork-1

    Date: 29-3-2022

    Author: Meeth Sakaria

    Theory: 
    
    -> Abstract class:  It is used to put architectural constraints on design.
    We cannot create instances for an abstract class,but we can inherit from the abstract class.

    -> toString: It is a method present in object class. Every class is initially 
    extended from the object class, hence we can override the toString method.
    it is used to convert any input to string.

    -> 'This': It is used to refer to the current object in a method. 
    It will differentiate between parameters and variables of present class.

    -> 'super': It is a reference variable which is used to refer immediate parent class object.

--------------------------------------------------------------------------------------------*/

import java.util.Scanner;

abstract class Person {
	
    private String name;
	private String address;

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

    public String getName() {
		return name;
	}

	public void setName(String name) {
	    this.name = name;
	}
	
    public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
    public String toString(){
        return "\n  Name: " + this.name + "\n  Address: " + this.address;
    }
}

class Student extends Person{
	
    private String program;
	private int year;
    private double fee;

	public Student(String name, String address,String program,int year, double fee) {
		super(name,address);
        this.program = program;
        this.year = year;
        this.fee = fee;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}
	
    public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

    public double getFee(){
        return fee;
    }

    public void setFee(Double fee){
        this.fee = fee;
    }
    
    public String toString(){
        return (super.toString()+"\n  Program: " + this.program + "\n  Year: " + this.year + "\n  Fee: " + this.fee);
    }
}

class Staff extends Person{
	
    private String school;
    private double pay;

	public Staff(String name, String address,String school,double pay) {
		super(name, address);
        this.school = school;
        this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
    public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}
    
    public String toString(){
        return (super.toString()+"\n  School: " + this.school + "\n  Pay: " + this.pay);  
    }
}

public class termwork_1 {
    
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args){
        
        String name,address,program,school,name1,address1;
        int year;
        double pay,fee;
        
        System.out.println("  Enter the details of the students:\n");

        System.out.print("  Enter the name of the Student: ");
        name = in.nextLine();
        
        System.out.print("  Enter the Address of the Student: ");
        address = in.nextLine();

        System.out.print("  Enter the program of the Student: ");
        program = in.nextLine();
        
        System.out.print("  Enter the year in which the Student is studying: ");
        year = in.nextInt();

        System.out.print("  Enter the Fees of the Student: ");
        fee = in.nextDouble();

        in.nextLine();
        System.out.println("\n  Enter the details of the staff:\n");

        System.out.print("  Enter the name of the Staff: ");
        name1 = in.nextLine();

        System.out.print("  Enter the Address of the Staff: ");
        address1 = in.nextLine();

        System.out.print("  Enter the School of the Staff: ");
        school = in.nextLine();

        System.out.print("  Enter the Pay of the Staff: ");
        pay = in.nextDouble();

        Student s = new Student(name,address,program,year,fee);
        Staff s1 = new Staff(name1,address1,school,pay);

        System.out.println("\n  The Details are as follows: \n");

        System.out.println(s.toString());
        System.out.println();
        System.out.println(s1.toString());
    }
}

/*-------------------------------------------------------------- 

    Sample input and output:

        Enter the details of the students:

        Enter the name of the Student: Rahul
        Enter the Address of the Student: Hubli
        Enter the program of the Student: CSE
        Enter the year in which the Student is studying: 2
        Enter the Fees of the Student: 75000
        
        Enter the details of the staff:

        Enter the name of the Staff: Rahul
        Enter the Address of the Staff: Hubli
        Enter the School of the Staff: SDM
        Enter the Pay of the Staff: 25000

        
        The Details are as follows:


        Name: Rahul
        Address: Hubli
        Program: CSE
        Year: 2
        Fee: 75000.0


        Name: Rahul
        Address: Hubli
        School: SDM
        Pay: 25000.0

--------------------------------------------------------------*/
