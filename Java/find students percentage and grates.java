Program 04: To find the student’s percentage and grade using command line
arguments.
public class mark
{
 public static void main(String args[])
 {
1. int sno,m1,m2,m3,total;
2. float avg;
3. sno = Integer.parseInt(args[0]);
4. m1 = Integer.parseInt(args[1]);
5. m2 = Integer.parseInt(args[2]);
6. m3 = Integer.parseInt(args[3]);
7. total = m1 + m2 + m3;
8. avg = total/3;
9. System.out.println(“ SNO = “ + sno);
10.System.out.println(“ MARK1 = “+ m1);
11.System.out.println(“ MARK2 = “ + m2);
12.System.out.println(“ MARK3 = “+ m3);
13.System.out.println(“ TOTAL = “ + total);
14.System.out.println(“ AVERAGE = “ + avg);
15.String c = ( m1 >=40 && m2>=40 && m3>=40 )? ”pass” : ”fail” ;
16.if (c==” pass”)
17.{
18. if(avg>=75)
19. System.out.println(“ GRADE A “);
20. else if(avg>=60 && avg<75)
21. System.out.println(“ GRADE B “);
22. else if(avg>=40 && avg<60)
23. System.out.println(“ GRADE C “);
24. System.out.println(“ RESULT = “+c);
25. }
26.else
27.{ System.out.println(“ RESULT = “ + c);
28.}
 }
}