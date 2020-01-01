import java.awt.*;
import java.awt.event.*;
public class CheckboxEg
{
 CheckboxEg()
 {
  Frame f=new Frame();
  final Label label=new Label();
  label.setAlignment(Label.CENTER);
  label.setSize(400,100);
  Checkbox checkbox1=new Checkbox("BCA");
  checkbox1.setBounds(100,100,50,50);
  Checkbox checkbox2=new Checkbox("BCOM");
  checkbox2.setBounds(100,150,50,50);
  Checkbox checkbox3=new Checkbox("BBA");
  checkbox3.setBounds(100,200,50,50);
  Checkbox checkbox4=new Checkbox("BA");
  checkbox4.setBounds(100,250,50,50);
  f.add(checkbox1);f.add(checkbox2);f.add(checkbox3);f.add(checkbox4);f.add(label);

  checkbox1.addItemListener(new ItemListener(){
  public void itemStateChanged(ItemEvent e){
  label.setText("Qualification BCA:"+(e.getStateChange()==1?"checked":"unchecked"));
  }
});

   checkbox2.addItemListener(new ItemListener(){
  public void itemStateChanged(ItemEvent e){
  label.setText("Qualification BCOM:"+(e.getStateChange()==1?"checked":"unchecked"));
  }
});

  checkbox3.addItemListener(new ItemListener(){
  public void itemStateChanged(ItemEvent e){
  label.setText("Qualification BBA:"+(e.getStateChange()==1?"checked":"unchecked"));
  }
});

  checkbox4.addItemListener(new ItemListener(){
  public void itemStateChanged(ItemEvent e){
  label.setText("Qualification BA:"+(e.getStateChange()==1?"checked":"unchecked"));
  }
});

 f.setSize(400,400);
 f.setLayout(null);
 f.setVisible(true);
}
public static void main(String args[])
{
 new CheckboxEg();
}
}