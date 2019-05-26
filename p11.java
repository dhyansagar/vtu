import java.util.Scanner;
public class p11
{
    public static int count, d;
    public static int w[] = new int[10];
    public static int x[] = new int[10];
    public static void subset(int cs, int k, int rem)
    {
        x[k] = 1;
if(cs + w[k] == d)
{
    System.out.println("\nSubset Solution:" );
    System.out.println("-----------------");
for(int i = 0; i <= k; i++)
    if(x[i] == 1)
        System.out.println(w[i]);
    }
    else if(cs + w[k] + w[k + 1] <= d)
        {
            subset(cs + w[k], k + 1, rem - w[k]);
        }
        if((cs + rem - w[k] >= d) && (cs + w[k + 1] <= d))
        {
x[k] = 0;
            subset(cs, k + 1, rem - w[k]);
        }
}
public static void main(String args[])
    {
        int sum = 0, n;
Scanner scanner = new Scanner(System.in); 
System.out.println("\t\t\tSubset Program"); 
System.out.println("\t\t\t--------------"); 
System.out.print("Enter the number of elements:");
n = scanner.nextInt();
System.out.print("Enter the elements in ascending order:");
for(int i = 0; i < n; i++)
        {
            w[i] = scanner.nextInt();
        }
        System.out.print("Enter the required sum:");
d = scanner.nextInt();
for(int i = 0; i < n; i++)
{
sum += w[i];
}
if(sum < d) {
    System.out.println("no solution exist");
}
else{
    System.out.println("\nSolution:");
System.out.println("---------");
count = 0;
subset(0, 0, sum);
}}}
