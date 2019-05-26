import java.util.*;
class arrayStack
{
int arr[];
int top, max;
arrayStack(int n)
{
max = n;
arr = new int[max];
top = -1;
}
void push(int i)
{
if (top == max - 1)
System.out.println("Stack Overflow . . . ");
else
arr[++top] = i;
}
void pop()
{
if (top == -1)
{
System.out.println("Stack Underflow . . . ");
}
else
{
int element = arr[top--];
System.out.println("Popped Element: " +
element);
}
}
void display()
{
System.out.print("\nElements in Stack : ");
if (top == -1)
{
System.out.print("Empty\n");
return;
}
for (int i = top; i >= 0; i--)
System.out.print(arr[i] + "\t");
System.out.println();
}
}
class p1b
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
System.out.println("Stack Implementation");
System.out.println("--------------------\n");
System.out.print("Enter Size of Integer Stack:");
int n = scan.nextInt();
boolean done = false;
arrayStack stk = new arrayStack(n);
char ch;
do
{
System.out.println("\nStack Operations");
System.out.println("----------------\n");
System.out.println("1.Push\t2.Pop\t3.Display\t4.Exit\n");
System.out.print("Enter your Choice:");
int choice = scan.nextInt();
System.out.println();
switch (choice)
{
case 1:
System.out.print("Enter integer element topush:");
stk.push(scan.nextInt());
break;
case 2:
stk.pop();
break;
case 3:
stk.display();
break;
case 4:
done = true;
break;
default:
System.out.println("Wrong Entry . . .");
break;
}
}
while (!done);
}
}
