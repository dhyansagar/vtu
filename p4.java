import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class p4
{
static final int MAX = 10000;
static int a[] = new int[MAX];
public static void main(String[] args)
{
System.out.println("Quicksort Algorithm Implementation");
System.out.println("---------------------------------");
Scanner input = new Scanner(System.in);
System.out.print("Enter Max array size: ");
int n = input.nextInt();
Random random = new Random();
for (int i = 0; i < n; i++)
a[i] = 5000 + random.nextInt(10000);
System.out.println("Input Array:");
for (int i = 0; i < n; i++)
System.out.print(a[i] + " ");
long startTime = System.nanoTime();
QuickSortAlgorithm(a,0, n - 1);
long stopTime = System.nanoTime();
long elapsedTime = stopTime - startTime;
System.out.println("\nSorted Array:");
for (int i = 0; i < n; i++)
System.out.print(a[i] + " ");
System.out.println();
System.out.println("Time Complexity in ms for n=" +
n + " is: " + (double) elapsedTime / 1000000);
}
public static void QuickSortAlgorithm(int a[],int
low,int high)
{
int mid;
if(low<=high)
{
mid=partition(a,low,high);
QuickSortAlgorithm(a,low,mid-1);
QuickSortAlgorithm(a,mid+1,high);
}
}
public static int partition(int a[],int low,int high)
{
int i=low,j=high+1,key=a[low],temp;
while(i<=j)
{
do i++;
while( i<=high && key>=a[i]);
do j--;
while(key<a[j]);
if(i<j)
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
temp=a[low];
a[low]=a[j];
a[j]=temp;
return j;
}
}
