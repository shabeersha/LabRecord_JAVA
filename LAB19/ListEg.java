import java.awt.*;
import java.awt.event.*;
public class ListEg extends Frame
{
 Button b1;
 Button b2;
 ListEg(){
 
 List l1=new List(5);
 l1.setBounds(100,100,75,75);
 l1.add("item 1");
 l1.add("item 2");
 l1.add("item 3");
 l1.add("item 4");
 l1.add("item 5");
 add(l1);
 b1=new Button("add");
 b1.setBounds(200,100,50,25);

 b2=new Button("remove");
 b2.setBounds(300,100,50,25);
 TextField tf=new TextField();
 tf.setBounds(200,75,50,25);
 add(b1);
 add(b2);
 add(tf);
 setSize(400,400);
 setLayout(null);
 setVisible(true);


 b1.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e)
 {
 l1.add(tf.getText());
 }
 });
 b2.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e)
 {
 l1.remove(l1.getSelectedItem());
 }
 });
 }
 public static void main(String args[])
 {
 new ListEg();
 }
 }  