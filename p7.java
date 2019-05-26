import java.util.*;
public class p7
{
    final static int MAX = 20;
    final static int infinity = 999;
    static int n; // No. of vertices of G
    static int a[][]; // Cost matrix
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Dijkstra's Implementation");
        System.out.println("-----------------------------------  ");
                ReadMatrix();
                int source = 0;  // starting vertex
                System.out.print("\nEnter starting vertex: ");
                source = scan.nextInt();
                Dijkstras(source);    // find shortest path
            }
            static void ReadMatrix()
            {
        a = new int[MAX][MAX];
        System.out.print("Enter the Number of Vertices:"); 
        n = scan.nextInt();
        System.out.println("\nEnter the Cost Matrix\n");
                for (int i = 1; i <= n; i++)
                    for (int j = 1; j <= n; j++)
                        a[i][j] = scan.nextInt();
            }
            static void Dijkstras(int source)
            {
                int visited[] = new int[MAX];
                int d[] = new int[MAX];
                int u, v;
                int i;
                for (i = 1; i <= n; i++)
                {
                    visited[i] = 0;
                    d[i] = a[source][i];
                }
                visited[source] = 1;
                d[source] = 1;
                i = 2;
                while (i <= n)
                {
                    u = Extract_Min(visited, d);
                    visited[u] = 1;
                    i++;
                    for (v = 1; v <= n; v++)
                    {
                        if (((d[u] + a[u][v]) < d[v]) && (visited[v]== 0))
                        d[v] = d[u] + a[u][v];
                    }
                }
                System.out.println("\nShortest path from Source:"+source+"\n");
                System.out.println("Src --> Dest | Cost");
                System.out.println("-------------------");
                for (i = 1; i <= n; i++)
        if (i != source)
        System.out.println(" " + (source) + " --> " + (i) + " | " + (d[i]));
            }
            static int Extract_Min(int visited[], int d[])
    {
        int i, j = 1, min;
        min = infinity;
        for (i = 1; i <= n; i++)
        {
            if ((d[i] < min) && (visited[i] == 0))
            {
min = d[i];
j = i; }
}
return (j); }
}
