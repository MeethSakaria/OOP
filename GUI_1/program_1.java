//import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class NumberNegativeException extends Exception{
    public String toString(){
        return "number is negative";
    }
}
class Factorial extends Frame implements ActionListener {

    private Label title;
    private Label num;
    private TextField tnum;
    private Button submit;
    private Label ans;
    private TextField tans;

    public Factorial()
    {
        setTitle("Factorial");
        setBounds(300, 90, 900, 600);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setVisible(true);

        title = new Label("Factorial");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        add(title);

        num = new Label("Enter a number: ");
        num.setFont(new Font("Arial", Font.PLAIN, 20));
        num.setSize(150, 20);
        num.setLocation(200, 100);
        add(num);

        tnum = new TextField();
        tnum.setFont(new Font("Arial", Font.PLAIN, 20));
        tnum.setSize(200, 25);
        tnum.setLocation(350, 100);
        add(tnum);

        submit = new Button("Submit");
        submit.setFont(new Font("Arial", Font.PLAIN, 20));
        submit.setSize(100, 20);
        submit.setLocation(325, 150);
        submit.addActionListener(this);
        add(submit);
        
        ans = new Label("Factorial ");
        ans.setFont(new Font("Arial", Font.PLAIN, 20));
        ans.setSize(100, 20);
        ans.setLocation(200, 200);
        add(ans);

        tans = new TextField();
        tans.setFont(new Font("Arial", Font.PLAIN, 20));
        tans.setSize(200, 25);
        tans.setLocation(350, 200);
        add(tans);


    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == submit)
        {
            String s = tnum.getText();
            int num1 = Integer.parseInt(s);
            try{
                if(num1>=0){
                    int fact=1;
                    for(int i= num1;i>0;i--)
                        fact *=i;
                    tans.setText(String.valueOf(fact));
                    tans.setEditable(false);
                }
                else
                    throw new NumberNegativeException();
            }catch(NumberNegativeException l){
                tans.setText(l.toString());
                tans.setEditable(false);
            }

        }
    }
}

class program_1 {
    public static void main(String[] args) throws Exception{
        new Factorial();
    }
}