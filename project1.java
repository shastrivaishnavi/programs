import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.applet.*;

public class project1 extends Frame implements ActionListener
{
 Button b1,b2;
 Label l1,l2;
 TextField t1,t2;
 public project1(String s)
 {
 super();
 l1 = new Label("Name");
 t1= new TextField(50);
 add(l1);
 add(t1);
 l2 = new Label("Roll no");
 t2= new TextField(50);
 add(l2);
 add(t2);
 b1 = new Button("Add");
 b2 = new Button("Cancle");
 b1.addActionListener(this);
  add(b1);
 b2.addActionListener(this);
  add(b2);
 setLayout(new FlowLayout());
 }
 public void actionPerformed(ActionEvent e)
 {
  Data d = new Data();
  if(e.getSource() == b1)
  {
   try
   {
    d.name = t1.getText();
    d.rollno = t2.getText();
    FileOutputStream fos=new FileOutputStream("projectdata");
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(d);
    oos.close();
   }
   catch(IOException ev)
   {
    System.out.println("Exception during serialization"+ev);
    System.exit(0);
   }
  }
   
   if(e.getSource() == b2)
    repaint();
 }
 public void paint(Graphics g)
 {
 }
 public boolean handleEvent(Event e)
 {
  if(e.id == Event.WINDOW_DESTROY)
   System.exit(0);
  return super.handleEvent(e);
 }
 public static void main(String args[])
 {
  project1 obj = new project1("My event handler");
  obj.setSize(400,400);
  obj.setVisible(true);
 }
}
 class Data implements Serializable
{
 public String name, rollno;
}

