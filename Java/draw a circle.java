Program 5. To draw a circle using applet
import java.awt.*;
import java.applet.*;
/* <applet
 code = “circleapplet.class”
 width = 510
 height = 500>
 </applet>
*/
public class circleapplet extends Applet
{
 public void paint( Graphics g)
 {
 g.setColor(Color.green);
 g.drawOval( 20,20,200,120)
 g.fillOval(70,30,100,100);
 }
}