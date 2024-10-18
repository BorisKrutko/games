package LW6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("LW6");
        setSize(1000, 500);
        JPanel panelToAddSt = new JPanel();
        JPanel panelToLabels = new JPanel(); 

        JLabel input = new JLabel();
        input.setBackground(Color.YELLOW);
        input.setBorder(BorderFactory.createLineBorder(Color.RED, 2));

        JLabel output = new JLabel();
        output.setBackground(Color.YELLOW);
        output.setBorder(BorderFactory.createLineBorder(Color.RED, 2));

        JButton sort = new JButton("Sort");

        JButton add = new JButton("add");

        JTextField studentToAdd = new JTextField();
        input.setBackground(Color.YELLOW);
        input.setBorder(BorderFactory.createLineBorder(Color.RED, 2));

        JButton openFile = new JButton("open");

        panelToAddSt.add(studentToAdd);
        panelToAddSt.add(add);
        panelToAddSt.setLayout(new GridLayout(1, 2));

        panelToLabels.add(input);
        panelToLabels.add(output);
        panelToLabels.setLayout(new GridLayout(1, 2));


        add(sort, BorderLayout.SOUTH);
        add(panelToAddSt, BorderLayout.NORTH);
        add(openFile, BorderLayout.WEST);
        add(panelToLabels, BorderLayout.CENTER); 
        
        

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
