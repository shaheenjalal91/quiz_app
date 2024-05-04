package quiz.app;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;
import java.awt.*;

public class rules extends JFrame implements ActionListener {
    JButton Back,Start;
    String name;
    rules(String name){
        this.name=name;
        JLabel heading=new JLabel("Hi "+name+" ,Welcome to the Quiz");
        heading.setBounds(150,100,700,30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD,28));
        heading.setForeground(new Color(22,99,54));
        add(heading);

        JLabel Rules=new JLabel();
        Rules.setBounds(70,150,700,350);
        Rules.setFont(new Font("Tahuma", Font.BOLD,18));
        Rules.setForeground(new Color(22,99,54));
        Rules.setText(
            "<html>"+
                    "1. Participation in the quiz is free for all" + "<br><br>" +
                    "2. There are a total 10 questions. " + "<br><br>" +
                    "3. You only have 15 seconds to answer the question." + "<br><br>" +
                    "4. No cell phones or other devices in the room are allowed" + "<br><br>" +
                    "5. Do not copy from other sources." + "<br><br>" +
                    "6. Kindly avoid noise." + "<br><br>" +
                    "<html>"
                     );
        add(Rules);


        Back=new JButton("Back");
        Back.setBounds(300,500,100,30);
        Back.setBackground(new Color(22,99,54));
        Back.setForeground(Color.WHITE);
        Back.addActionListener(this);
        add(Back);

        Start=new JButton("Start");
        Start.setBounds(450,500,100,30);
        Start.setBackground(new Color(22,99,54));
        Start.setForeground(Color.WHITE);
        Start.addActionListener(this);
        add(Start);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/back.png"));
        Image i=i1.getImage().getScaledInstance(800,650,Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(i);
        JLabel image=new JLabel(i2);
        image.setBounds(0,0,800,650);
        add(image);

        //giving width and height to frame
        setSize(800,650);
        setLocation(350,100);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==Start){
            setVisible(false);
            new Quiz(name);
        }else{
            setVisible(false);
            new login_page();
        }
    }

    public static void main(String[] args) {
        new rules("User");
    }
}
