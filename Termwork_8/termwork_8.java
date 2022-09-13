/*-----------------------------------------------------------------------------------------------------

    problem statement: 
    
        Write a Java Program to do the following.
        
    Termwork-8

    Date: 20-6-2022

    Author: Meeth Sakaria    

-----------------------------------------------------------------------------------------------------*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class registrationForm extends JFrame implements ActionListener {

    private Label title;
    private Label name;
    private TextField tname;
    private Label mobileno;
    private TextField tmobileno;
    private Label gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private Label dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private Label add;
    private JTextArea tadd;
    private CheckBox term;
    private Button submit;
    private Button reset;
    private JTextArea tout;
    private Label res;
 
    private String[] dates = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
                               "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
    
    private String[] months = { "Jan", "feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec" };
    
    private String[] years = { "1995", "1996", "1997", "1998","1999", "2000", "2001", "2002", "2003", "2004", "2005",
                               "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016",
                               "2017", "2018", "2019", "2020", "2021", "2022" };

    public registrationForm()
    {
        setTitle("Registration Form");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setLayout(null);

        title = new Label("Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        add(title);

        name = new Label("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        add(name);

        tname = new TextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        add(tname);

        mobileno = new Label("Mobile");
        mobileno.setFont(new Font("Arial", Font.PLAIN, 20));
        mobileno.setSize(100, 20);
        mobileno.setLocation(100, 150);
        add(mobileno);

        tmobileno = new TextField();
        tmobileno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmobileno.setSize(150, 20);
        tmobileno.setLocation(200, 150);
        add(tmobileno);

        gender = new Label("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 200);
        add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 200);
        add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 200);
        add(female);

        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        dob = new Label("DOB");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(100, 250);
        add(dob);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(200, 250);
        add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(250, 250);
        add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(320, 250);
        add(year);

        add = new Label("Address");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(100, 300);
        add(add);

        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 300);
        add(tadd);

        term = new CheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 400);
        add(term);

        submit = new Button("Submit");
        submit.setFont(new Font("Arial", Font.PLAIN, 15));
        submit.setSize(100, 20);
        submit.setLocation(150, 450);
        submit.addActionListener(this);
        add(submit);

        reset = new Button("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        add(reset);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setEditable(false);
        add(tout);

        res = new Label("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        add(res);

    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == submit)
        {
            if (term.isSelected())
            {
                String data,data1,data2,data3;
                data = "Name : " + tname.getText() + "\n" + "Mobile : " + tmobileno.getText() + "\n";
                if (male.isSelected())
                    data1 = "Gender : Male" + "\n";
                else
                    data1 = "Gender : Female" + "\n";

                data2 = "DOB : " + (String) date.getSelectedItem() + "/" + (String) month.getSelectedItem() + "/" + (String) year.getSelectedItem() + "\n";
                data3 = "Address : " + tadd.getText();
                tout.setText(data + data1 + data2 + data3);
                tout.setEditable(false);
                res.setText("Registration Successfully..");
            }
            else
            {
                tout.setText("");
                res.setText("Please accept the terms & conditions..");
            }
        }

        else if (e.getSource() == reset)
        {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            tmobileno.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
        }
    }
}

class termwork_8 {
    public static void main(String[] args) throws Exception{
        new registrationForm();
    }
}