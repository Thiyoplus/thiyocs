Program 08: To retrieve data from a file
import java.io.*;
class s1
{
public static void main( String args[])
 {
DataInputStream dis=null;
DataOutputStream dos=null;
File intFile = new File("rand.dat");
try
 {
dos=new DataOutputStream(new FileOutputStream(intFile));
for ( int i=0;i<20;i++)
dos.writeInt((int)(Math.random()*100));
 }
catch (IOExceptionioe)
 {
System.out.println(ioe.getMessage());
 }
finally
 {
try
 {
dos.close();
 }
 catch(IOExceptionioe) { }
 }
try
 {
dis=new DataInputStream(new FileInputStream(intFile));
for ( int i=0;i<20;i++)
 {
int n = dis.readInt();
System.out.print(n + " ");
 }
 }
catch(IOExceptionioe)
 {
System.out.println(ioe.getMessage());
 }
finally
 {
try
 {
dis.close();
 }
catch (IOExceptionioe) { }
 }
 }
}
