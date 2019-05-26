import java.util.Scanner;
public class p10b
{
    static int MAX = 100;
    static final int infinity = 999;
    public static void main(String args[])
    {
        int cost = infinity;            //LeastCost
        int c[][] = new int[MAX][MAX];  // Cost Matrix
           int tour[] = new int[MAX];
        int n;
        System.out.println("Travelling using Dynamic Programming");
        System.out.println(" ");
        System.out.print("Enter number of cities: ");
		Scanner scanner=new Scanner(System.in);
		n = scanner.nextInt();
		System.out.println("Enter Cost matrix:");
		for (int i = 0; i < n; i++)
    	for (int j = 0; j < n; j++)
    	{
        c[i][j] = scanner.nextInt();
        if (c[i][j] == 0)
            c[i][j] = 999;
    }
for (int i = 0; i < n; i++)
tour[i] = i;
cost = tspdp(c, tour, 0, n);
System.out.println("\nMinimum Tour Cost: " + cost);
System.out.print("\nTour:");
for (int i = 0; i < n; i++)
{
    System.out.print(tour[i]+1 + " -> ");
}
System.out.println(tour[1] + "\n");
        scanner.close();
   }
    static int tspdp(int c[][], int tour[], int start, int n)
{
    int i, j, k;
    int temp[] = new int[MAX];
    int mintour[] = new int[MAX];
    int mincost;
int cost;
if(start==n-2)
return c[tour[n - 2]][tour[n - 1]] + c[tour[n - 1]][0];
mincost = infinity;
for (i = start + 1; i < n; i++)
        {
            for (j = 0; j < n; j++)
                temp[j] = tour[j];
                temp[start + 1] = tour[i];
temp[i] = tour[start + 1];
if (c[tour[start]][tour[i]] + (cost = tspdp(c, temp, start + 1, n)) < mincost)
{
    mincost = c[tour[start]][tour[i]] + cost;
for (k = 0; k < n; k++)
    mintour[k] = temp[k];
}
}
for (i = 0; i < n; i++)
 tour[i] = mintour[i];
return mincost;
}}
