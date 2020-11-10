import java.applet.*;
import java.awt.*;
public class See extends Applet implements Runnable
{
String str;
int x;
int y;
Thread th;

public void init()
{
str="knit";
x=0; 
y=0;
th=new Thread(this);
th.start();
}
public void run()
{
while(true)
{
if(x==5 && y==5)
{x=0;y=0;
}else
{
x=x+5;
y=y+5;
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
g.drawOval(250,100,500,500);
g.fillOval(x+350,200,50+x,50);
g.fillOval(x+600,200,50+x,50);
g.fillOval(450,400,100,100);

}
}
/* 
<Applet code="See.java" width=200 height=200>
</Applet>
*/