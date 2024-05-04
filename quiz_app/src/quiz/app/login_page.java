package quiz.app;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;
import java.awt.*;

public class login_page extends JFrame implements ActionListener {
    JTextField text;
    JButton back, next;

    login_page(){
        //setting color for our frame bg
        getContentPane().setBackground(Color.WHITE);
        //now the buttons will be by default touching the borders so if we want to make that it our according then we will do this
        setLayout(null);


        //now we will use icons and will set the location
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        //now we will set icons
        Image i=i1.getImage().getScaledInstance(550,500,Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(i);
        //now the image will go to our frame using JLabel
        //so JLabel is used to insert any image or text in our frame
        JLabel image=new JLabel(i2);
        //now the image is in JLabel we have to set it in the frame
        image.setBounds(450,0,550,500);
        add(image);

        //now I want some text in my frame so, again I will use JLabel
        JLabel heading=new JLabel("TAKE QUIZ");
        heading.setBounds(140,60,300,45);
        heading.setFont(new Font("SHAHEEN RANDOM QUIZ",Font.BOLD,40));
        heading.setForeground(new Color(22,99,54));
        add(heading);

        JLabel name=new JLabel("Enter your name");
        name.setBounds(160,230,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,16));
        name.setForeground(new Color(22,99,54));
        add(name);

        //now I will create a text field for user
        text = new JTextField();
        text.setBounds(80,200,300,25);
        text.setFont(new Font("Times New Roman",Font.BOLD,18));
        add(text);


        next=new JButton("Next");
        next.setBounds(100,270,120,25);
        next.setBackground(new Color(22,99,54));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        back=new JButton("Back");
        back.setBounds(250,270,120,25);
        back.setBackground(new Color(22,99,54));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);



        setSize(1000,500);
        setLocation(200,150);
        setUndecorated(true);
        //here by default frame is invisible so, we will make it visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==next){
            String name=text.getText();
            setVisible(false);
            new rules(name);
        }else if (e.getSource()==back){
            System.exit(100);
        }
    }

    public static void main(String[] args) {
        new login_page();
    }
}
