import java.applet.*;
import java.awt.*;
public class MvCar extends Applet implements Runnable
{
String str;
int x;
int y;
Thread th;

public void init()
{
str="MY CAR";
x=0;
y=0;
th=new Thread(this);
th.start();
}
public void run()
{
while(x!=400)
{
x=x+5;
y=y+5;
if(x==400)
{x=0;y=0;
}
try
{
th.sleep(1000);
}
catch(Exception ex)
{
}
repaint();
}
}
public void paint(Graphics g)
{
g.drawString(str,x,20);
g.drawRect(110+x,100,90,50);
g.drawRect(110+x,150,90,50);
g.fillRect(175+x,100,28,50);
g.drawRect(200+x,150,75,50);
g.fillOval(255+x,130,20,20);
g.fillOval(120+x,198,50,50);
g.fillOval(235+x,198,50,50);
}
}
/*
<applet code="MvCar.java" width=400 height=400>
</applet>
*/