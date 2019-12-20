import java.awt.event.*;
import javax.swing.*;

public class Addition{
	public static void main(String[] args){
	
	JFrame f1=new JFrame("Addition");

	final JTextField tf1=new JTextField();
	tf1.setBounds(50,50,150,20);
	f1.add(tf1);

	JLabel l1=new JLabel("+");
	l1.setBounds(110,75,20,20);
	f1.add(l1);
	
	final JTextField tf2=new JTextField();
	tf2.setBounds(50,100,150,20);
	f1.add(tf2);
	
	JButton b1=new JButton("Result");
	b1.setBounds(50,130,95,30);
	f1.add(b1);
	
	JLabel l2=new JLabel(" ");
	l2.setBounds(50,160,95,20);
	f1.add(l2);
	
	b1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){

	if(tf1.getText().trim().isEmpty()||tf2.getText().trim().isEmpty())
	{
	l2.setText("Invalid");
         }
	else{
	int a=Integer.parseInt(tf1.getText());
	int b=Integer.parseInt(tf2.getText());
	int c=0;
	
	c=a+b;
	
	
	l2.setText(String.valueOf("Result:"+c));
	}

	}
	});

	
	f1.setSize(400,400);
	f1.setLayout(null);
	f1.setVisible(true);
	}

}