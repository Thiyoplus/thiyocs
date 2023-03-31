Program1: sorting the number using arrays
1. import java.util.Scanner;
2. public class Sort
3. {
4. public static void main(String[] args)
5. {
6. int n, temp;
7. Scanner s = new Scanner(System.in);
8. System.out.print("Enter no. of elements you want in array:");
9. n = s.nextInt();
10. int a[] = new int[n];
11. System.out.println("Enter all the elements:");
12. for (int i = 0; i < n; i++)
13. {
14. a[i] = s.nextInt();
15. }
16. for (int i = 0; i < n; i++)
17. {
18. for (int j = i + 1; j < n; j++)
19. {
20. if (a[i] > a[j])
21. {
22. temp = a[i];
23. a[i] = a[j];
24. a[j] = temp;
25. }
26. }
27. }
28. System.out.print("Sorting Order:");
29. for (int i = 0; i < n ; i++)
30. {
31. System.out.print(a[i] + ",");
32. }
33. }
34. }