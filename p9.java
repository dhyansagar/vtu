import java.util.*;
public class p9
{
    public static void prims(int n, int a[][])
    {
        int i, j, u, v, min, k;
int sum; 
int t[][] = new int[10][2];
int p[] = new int[10];
int d[] = new int[10]; 
int s[] = new int[10]; 
        int source;
        min = 999;
        source = 0;
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
				if(a[i][j]!=0 &&a[i][j]<min)
				{			
    				min=a[i][j];
					source=i; 
				}
   			} 
		}
        for(i=0; i<n; i++)
        {
            d[i]=a[source][i];
            s[i]=0;
            p[i]=source;
        }
        s[source]=1;
        sum=0;
        k=0;
        for(i=1; i<n; i++)
        {
            min=999;
            u=-1;
            for(j=0; j<n; j++)
            {
                if(s[j]==0)
    {
        if(d[j]<=min)
        {
min=d[j];
u=j; }
        }
    }
    t[k][0]=u;
t[k][1]=p[u];
k++;
sum+=a[u][p[u]];
s[u]=1;
for(v=0; v<n; v++)
{
    if(s[v]==0 && a[u][v]<d[v])
    {
    d[v]=a[u][v];
p[v]=u; }
    }
}
if(sum>=999)
System.out.println("spanning tree doesnot exist\n");
else{
    System.out.println("spanning tree exists");
    for(i=0; i<n-1; i++)
    {
        System.out.println(t[i][0]+","+t[i][1]);
    }
System.out.println("cost of spanning tree = "+sum);
}}
public static void main(String[] args)
    {
        int n;
        int a[][] = new int[10][10];
        Scanner input = new Scanner(System.in);
        System.out.println("Prim's algorithm Implementation");
        System.out.print("Enter the number of nodes:");
        n = input.nextInt();
        System.out.println("Enter cost adjacency matrix");
    for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < n; j++)
        {
            a[i][j] = input.nextInt();
        }
}
    prims(n,a);
}
}
