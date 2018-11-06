import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swingx {

    public static void main(String [] args){
        JFrame frame=new JFrame("Not Forgotten");
        frame.setLayout(null);

        JLabel label=new JLabel("This is your chance");
        label.setBounds(10,25,150,26);
        frame.add(label);

        JTextField textField=new JTextField("here you type");
        textField.setBounds(10,60,150,26);
        frame.add(textField);

        JTextArea textArea=new JTextArea();
        textArea.setBounds(10,90,150,40);
        frame.add(textArea);

        JButton button=new JButton("Ok");
        button.setBounds(20,200,70,50);
        frame.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuffer stringBuffer=new StringBuffer();
                stringBuffer.append(textField.getText());
                stringBuffer.reverse();
                textArea.append(String.valueOf(stringBuffer)+"\n");
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);



    }

}
