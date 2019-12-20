import java.awt.event.*;
import javax.swing.*;

public class ButtonText{
public static void main(String[] args){
JFrame f1=new JFrame("Button Example");

final JTextField tf1=new JTextField();
tf1.setBounds(70,50,150,20);


JButton b1=new JButton("Click Here");
b1.setBounds(50,100,95,30);

b1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	tf1.setText("Hello World");
}
});

f1.add(b1);
f1.add(tf1);
f1.setSize(400,400);
f1.setLayout(null);
f1.setVisible(true);
}
}