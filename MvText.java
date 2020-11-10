import java.applet.*;
import java.awt.*;
public class MvText extends Applet implements Runnable
{
String str;
int x;
int y;
Thread th;

public void init()
{
str="KNIT";
x=5;
y=5;
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
g.drawString(str,x,y);
}
}
/*
<applet code="MvText.java" width=400 height=400>
</applet>
*/