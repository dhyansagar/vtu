import java.util.Scanner;
public class p6a
{
public static int p[] = new int[10];
public static int w[] = new int[10];
public static int v[][] = new int[10][10];
public static int max(int a, int b)
{
return a > b ? a : b;
}
public static void knapsack(int n, int[] w, int m,
int[][] v, int[] p)
{
for(int i = 0; i <= n; i++)
{
for(int j = 0; j <= m; j++)
{
if(i == 0 || j == 0)
{
v[i][j] = 0;
}
else if(j < w[i])
{
v[i][j] = v[i - 1][j];
}
else
{
v[i][j] = max(v[i-1][j],v[i-1][j-w[i]] + p[i]);
}
}
}
}
public static void printOptimalSolution(int n, int m,
int w[], int v[][])
{
int i, j;
int x[] = new int[10];
System.out.println("\nThe optimal solution is " +
v[n][m] + "\n");
for(i = 1; i <= n; i++)
{
x[i] = 0;
}
i = n;
j = m;
while(i != 0 && j != 0)
{
if(v[i][j] != v[i - 1][j])
{
x[i] = 1;
j = j - w[i];
}
i = i - 1;
}
for(i = 1; i <= n; i++)
{
System.out.println("X[" + i + "] = " + x[i] +
"\n");
}
}
public static void main(String args[])
{
Scanner scanner = new Scanner(System.in);
p = new int[10];
w = new int[10];
v = new int [10][10];
System.out.println("Knapsack Problem Dynamic Programming Technique Implementation");
System.out.println("--------------------------------------------------------------");
System.out.print("Enter the Number of Objects(N):");
int n = scanner.nextInt();
System.out.print("\nEnter the Weights of N Objects W(N):");
for(int i = 1; i <= n; i++)
{
w[i] = scanner.nextInt();
}
System.out.print("\nEnter the Profits of N Objects P(N):");
for(int i = 1; i <= n; i++)
{
p[i] = scanner.nextInt();
}
System.out.print("\nEnter the Capacity of Knapsack (M):");
int m = scanner.nextInt();
knapsack(n, w, m, v, p);
System.out.println("\nSolution");
System.out.println("--------\n");
for(int i = 0; i <= n; i++)
{
for(int j = 0; j <= m; j++)
{
System.out.printf("%2d ", v[i][j]);
}
System.out.println("\n");
}
printOptimalSolution(n, m, w, v);
}
}
