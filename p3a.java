import java.util.Scanner;
class p3a
{
public static void main(String[] args)
{
int a, b,result;
Scanner input = new Scanner(System.in);
System.out.println("Input two integers");
System.out.print("a = ");
a = input.nextInt();
System.out.print("b = ");
b = input.nextInt();
try
{
result = a / b;
System.out.println("Result = " + result);
}
catch (ArithmeticException e)
{
System.out.println("Exception caught: Division by zero.");
}
}
}
