import java.util.Random;
import java.util.Scanner;
public class p5
{
static final int MAX = 10000;
static int a[] = new int[MAX];
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.println("Mergesort Algorithm Implementation");
System.out.println("---------------------------------");
System.out.print("Enter The Number of Elements: ");
int n = input.nextInt();
Random random = new Random();
for (int i = 0; i < n; i++)
a[i] = 5000 + random.nextInt(10);
System.out.println("Array Elements are:");
for (int i = 0; i < n; i++)
System.out.print(a[i] + " ");
System.out.print("\n");
long startTime = System.nanoTime();
MergeSortAlgorithm(a,0,n-1);
long stopTime = System.nanoTime();
long elapsedTime = stopTime - startTime;
System.out.println("Sorted Array (Merge Sort):");
for (int i = 0; i < n; i++)
System.out.print(a[i] + " ");
input.close();
System.out.print("\n");
System.out.println("Time Complexity (ms) for n = " +
n + " is : " + (double) elapsedTime / 1000000);
}
public static void Merge(int a[],int low,int mid,int
high)
{
int i,j,k;
int b[] = new int[MAX];
i=low;
j=mid+1;
k=low;
while((i<=mid) && (j<=high))
{
if(a[i]<a[j])
{
b[k]=a[i];
k=k+1;
i=i+1;
}
else
{
b[k]=a[j];
k=k+1;
j=j+1;
}
}
while(i<=mid)
{
b[k]=a[i];
k=k+1;
i=i+1;
}
while(j<=high)
{
b[k]=a[j];
k=k+1;
j=j+1;
}
for(i=low; i<=high; i++)
a[i]=b[i];
}
public static void MergeSortAlgorithm(int a[],int low,
int high)
{
int mid;
if(low<high)
{
mid=(low+high)/2;
MergeSortAlgorithm(a,low,mid);
MergeSortAlgorithm(a,mid+1,high);
Merge(a,low,mid,high);
}
}
}
