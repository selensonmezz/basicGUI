package cs105;

        import javax.swing.*;
        import java.awt.*;

public class Main {


    public static void main(String[] args) {
        JFrame frame =new JFrame("CS 102 App");
        frame.setLayout(new GridLayout(0,1));
        frame.setSize(200,200);

        JPanel panel1= new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.add(panel1);
        JLabel label0 =new JLabel("Hi");
        panel1.add(label0);

        JTextField text= new JTextField();
        frame.add(text);

        JPanel panel2= new JPanel();
        panel2.setLayout(new FlowLayout());
        frame.add(panel2);
        JButton button1= new JButton("Append");
        panel2.add(button1);
        JButton button2= new JButton("Reset");
        panel2.add(button2);
        frame.add(panel2);


        JPanel panel3= new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.add(panel3);
        JRadioButton radio1= new JRadioButton("lowercase");
        //this one is check oldu time search this
        panel3.add(radio1);

        JPanel panel4= new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.add(panel4);
        JRadioButton radio2= new JRadioButton("UPPERCASE");
        panel4.add(radio2);


        frame.setVisible(true);



    }
}

