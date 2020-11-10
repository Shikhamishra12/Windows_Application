import java.awt.*;
import java.awt.event.*;
class win extends Frame implements ActionListener
{
Button b1,b2,b3;
Label l1;
TextField t1;
public win()
{
setTitle("Event Handling Window");
setLayout(new FlowLayout());
b1=new Button("Red");
b1=new Button("Blue");
b1=new Button("Green");
l1=new Label("you have pressed ");
t1=new TextField(15);
add(b1);
add(l1);
add(l1);
add(b2);
add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
setSize(400,200);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
setBackground(Color.red);
else if(e.getSource()==b1)
setBackground(Color.red);
else if(e.getSource()==b1)
setBackground(Color.red);
}
}
class test
{
public static void main(String args[])
{
win obj=new win();
}
}