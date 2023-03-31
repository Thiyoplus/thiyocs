import java.lang.*;
class fiveable extends Thread
{
 public void run()
 {
 for (int i=1;i<=5;i++)
 System.out.println(i +”fives are:”+(i*5));
 }
}
class sevenable extends Thread
{
 public void run()
 {
 for (int i=1;i<=5;i++)
 System.out.println(i +”sevens are:”+(i*7));
 }
}
class thirteenable extends Thread
{
 public void run()
 {
 for (int i=1;i<=5;i++)
 System.out.println(i +”thirteen are:”+(i*13));
 }
}
public class prioritythread
{
 public static void main (String args[])
 {
 fiveable five=new fiveable();
 sevenable seven=new sevenable();
 thirteenable thirteen=new thirteenable();
 five.setPriority(1+6);
 seven.setPriority(1+7);
 thirteen.setPriority(9);
 five.start();
 seven.start();
 thirteen.start();
 }
}