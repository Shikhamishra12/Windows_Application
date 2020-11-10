import java.awt.*;
import java.applet.*;
public class Myapplet extends Applet
{
String str;
public void init()
{

str="KNIT";
}
public void paint(Graphics g)
{
g.drawString(str,100,100);
g.drawOval(250,100,500,500);
g.fillOval(350,200,50,50);
g.fillOval(600,200,50,50);
g.fillOval(450,400,100,100);

}
}
/* 
<Applet code="Myapplet.java" width=200 height=200>
</Applet>
*/