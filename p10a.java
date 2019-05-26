import java.util.Scanner;
public class p10a
{
    static final int MAX = 20;   // max. size of cost matrix
    static int a[][];    // cost matrix
    static int n;   // actual matrix size
    public static void main(String args[])
   {
    a = new int[MAX][MAX];
    System.out.println("Floyd's   Algorithm Implementation");
                                         
System.out.println("--------------------------------\n");

ReadMatrix();
Floyds();   // find all pairs shortest path
PrintMatrix();
}
    static void ReadMatrix()
    {
System.out.print("Enter the Number of Vertices:"); 
Scanner scanner = new Scanner(System.in);
n = scanner.nextInt();
System.out.println("\nEnter the Cost Matrix (999 for infinity)");
        System.out.println("----------------------------------------");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                a[i][j] = scanner.nextInt();
            }
}
        scanner.close();
    }
    static void Floyds()
    {
        for (int k = 0; k < n; k++)
        {
for (int i = 0; i < n; i++)
    for (int j = 0; j < n; j++)
        if ( a[i][j] > (a[i][k] + a[k][j]) )
            a[i][j] = a[i][k] + a[k][j];
        }
    }
static void PrintMatrix()
{
    System.out.println("\nThe All Pair Shortest Path Matrix");
            System.out.println("---------------------------------");
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<n; j++)
            System.out.print(a[i][j] + "\t");
        System.out.println();
    }
}
        }
