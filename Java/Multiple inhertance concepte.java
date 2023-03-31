PROGRAM 6: MULTIPLE INHERITANCE CONCEPTS IN JAVA USING INTERFACE
import java .io.*;
class number
{
 protected int x;
 protected int y;
}
Interface arithmetic
{
 int add(int a, int b);
 int sub(int a,int b);
}
class useinterface extends number implements arithmetic
{
 public int add( int a, int b)
 {
 x=a;
 y=b;
 return(x+y);
 }
 public int sub( int a, int b)
 {
 x=a;
 y=b;
 return(x-y);
 }
 public static void main (String args[])
 {
 useinterface ui=new useinterface();
 System.out.println(“Addition:” +ui.add(10,6));
 System.out.println(“Addition:” +ui.sub(10,6));
 }
}
