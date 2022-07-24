package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home implements ActionListener {
    int count = 0;
    JFrame frame;
    JLabel label;
    JButton button;
    JPanel panel;
    public Home(){
        frame = new JFrame();
        panel = new JPanel();
        button = new JButton("Click Here to Hate Go");
        label = new JLabel("");
        button.addActionListener(this);

//        =================================>>>
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Josh");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args){
        new Home();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("I hate Go " + count + " times.");
    }
}
