import java.util.*;
public class p8
{
    final static int MAX = 20;
    static Scanner scan = new Scanner(System.in);
    public static void union_ij(int i, int j, int s[])
    {
        if(i < j)
            s[j] = i;
else
s[i] = j;
}
    public static int find(int v, int s[])
    {
        while(s[v] != v)
        {
v = s[v]; }
return v; }
    public static void kruskal(int n, int c[][])
    {
        int count, i, min, j, u = 0, v = 0, k, sum;
        int s[] = new int[10];
        int t[][] = new int[10][2];
        for(i = 0; i < n; i++)
{
        s[i]=i;
        }
        count = 0;
        sum = 0;
        k = 0;
        while(count < n - 1)
        {
            min = 999;
            for(i = 0; i < n; i++)
            {
                for(j = 0; j < n; j++)
                {
                    if(c[i][j] != 0 && c[i][j] < min)
                    {
                        min = c[i][j];
                        u = i;
                        v = j;
                    }
                }
                }
    if(min == 999)
    {
break; }
    i = find(u, s);
    j = find(v, s);
    if(i != j)
    {
        t[k][0] = u;
        t[k][1] = v;
        k++;
        count++;
sum += min;
        union_ij(i, j, s);
    }
    c[u][v] = (c[v][u] = 999);
}
if(count == n - 1)
{
System.out.println("\nCost of spanning tree=" + sum);
System.out.println("\nSpanning Tree:");
    System.out.println("--------------");
    for(k = 0; k < n - 1; k++)
    {
        System.out.println(t[k][0] + "," + t[k][1]);
    }
}
else {
    System.out.println("\n spanning tree doesnot exist\n");
}
    }
    public static void main(String[] args)
{
    int n;
    int c[][] = new int[MAX][MAX];
    System.out.println("Kruskal Algorithm Implementation");
System.out.println("--------------------------------");

        System.out.print("Enter the number of nodes:");
        n = scan.nextInt();
System.out.println("\nEnter the cost matrix:\n");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                c[i][j] = scan.nextInt();
            }
        }

        kruskal(n, c);
    }
}
