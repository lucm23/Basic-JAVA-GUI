//LUC CODES....
import java.awt.*;
import java.awt.event.*;
//import java.awt.event.ActionListener;
import javax.swing.*;


public class GUI implements ActionListener {

    private int count = 0;
    private JFrame frame;
    private JLabel label;
    private JPanel panel;

    
    public GUI(){

        

         frame = new JFrame();
        JButton button = new JButton("Click me ");
        button.addActionListener(this);
        label = new  JLabel("Number of clicks: 0");


        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Luc's window");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main (String[] args){

        new GUI();
    }

    @Override
    public void actionPerformed (ActionEvent e){
        count++;
        label.setText("Nbr of clicks: " + count);
    }
}
