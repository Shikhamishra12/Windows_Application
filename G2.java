import java.applet.*;
import java.awt.*;
public class G2 extends Applet implements Runnable
{
int x;
int y;
Thread th;

public void init()
{
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
if(x==350)
{x=0;
y=0;
}
try
{
th.sleep(100);
}
catch(Exception ex)
{
}
repaint();
}
}
public void paint(Graphics g)
{
g.fillOval(x+50,50+y,50,50);
g.drawRect(50+x,400,70,50);
}
}
/* 
<Applet code="G2.java" width=200 height=200>
</Applet>
*/