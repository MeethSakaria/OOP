import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class StringNotPalindromeException extends Exception {
    public String toString(){
        return "not palindrome";
    }
}

class Concatenate extends Frame implements ActionListener {

    private Label str,str1;
    private TextField tstr,tstr1;
    private Button submit;
    private Label ans;
    private TextField tans;

    public Concatenate()
    {
        setTitle("Concatenate");
        setBounds(300, 90, 900, 600);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setLayout(null);

        str = new Label("Enter a String1: ");
        str.setFont(new Font("Arial", Font.PLAIN, 20));
        str.setSize(150, 20);
        str.setLocation(200, 100);
        add(str);

        tstr = new TextField();
        tstr.setFont(new Font("Arial", Font.PLAIN, 15));
        tstr.setSize(190, 20);
        tstr.setLocation(350, 100);
        add(tstr);

        str1 = new Label("Enter a String2: ");
        str1.setFont(new Font("Arial", Font.PLAIN, 20));
        str1.setSize(150, 20);
        str1.setLocation(200, 150);
        add(str1);

        tstr1 = new TextField();
        tstr1.setFont(new Font("Arial", Font.PLAIN, 15));
        tstr1.setSize(190, 20);
        tstr1.setLocation(350, 150);
        add(tstr1);
    
        submit = new Button("Submit");
        submit.setFont(new Font("Arial", Font.PLAIN, 15));
        submit.setSize(100, 20);
        submit.setLocation(250,200);
        submit.addActionListener(this);
        add(submit);

        ans = new Label("Concatenated ");
        ans.setFont(new Font("Arial", Font.PLAIN, 20));
        ans.setSize(150, 20);
        ans.setLocation(200, 250);
        add(ans);

        tans = new TextField();
        tans.setFont(new Font("Arial", Font.PLAIN, 15));
        tans.setSize(300, 20);
        tans.setLocation(350, 250);
        add(tans);


    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit)
        {
            String s = tstr.getText();
            String s1=tstr1.getText();
            String s3=s+s1;
            String s4="";
        int n=s3.length();
        
        for (int i = (n- 1); i >=0; --i) {
            s4 = s4 + s3.charAt(i);
        }
        
        try {
            if (s3.toLowerCase().equals(s4.toLowerCase()))
            { 
            tans.setText(s3);
            tans.setEditable(false);
            }
            else
                throw new StringNotPalindromeException();
        } catch (StringNotPalindromeException a) {
            tans.setText(a.toString());
            tans.setEditable(false);
        }
    }
    } 
}  

class program_2 {
    public static void main(String[] args) throws Exception{
        new Concatenate();
    }
}
