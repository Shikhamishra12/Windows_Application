import java.applet.Applet;

import java.awt.*;


public class Javafont extends Applet
 {
	
Font bigFont   = new Font("Serif", Font.BOLD, 56);
   
 Font smallFont = new Font("Helvetica", 3, 20);
      
 
    //Make a dark red for O'Reilly School of Technology
  
  private static final Color leafRed = new Color(115, 0, 0);

  
  String line1 = "MY CAR";
    
String line2 = "thanks";

   
 public void paint(Graphics g)
  
  {
   


g.drawRect(110,100,90,50);
g.drawRect(110,150,90,50);
g.fillRect(175,100,28,50);
g.drawRect(200,150,75,50);
g.fillOval(255,130,20,20);
g.fillOval(120,198,50,50);
g.fillOval(235,198,50,50);   
  // draw the text
       
 g.setColor(leafRed);
    
    g.setFont(bigFont);
    
    g.drawString(line1, 300, 50);
     
   g.setFont(smallFont);
    
    g.drawString(line2, 300, 500);	
 
   }	

}
/*
<Applet code="Javafont.java" width=300 height=300>
</Applet>
*/