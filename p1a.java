import java.util.Scanner;
class Student
{
String USN, Name, Branch, Phone;
Scanner input = new Scanner(System.in);
void read()
{
System.out.print("Enter USN:");
USN = input.nextLine();
System.out.print("Enter Name:");
Name = input.nextLine();
System.out.print("Enter Branch:");
Branch = input.nextLine();
System.out.print("Enter Phone:");
Phone = input.nextLine();
}
void display()
{
System.out.printf("%-20s %-20s %-20s %-20s", USN,
Name, Branch, Phone);
}
}
class p1a
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.println("Student Details Entry Program");
System.out.println("----------------------------\n");
System.out.print("Enter number of student details tobe created:");
int number = input.nextInt();
Student s[] = new Student[number];
for (int i = 0; i < number; i++)
{
System.out.println("\nEnter Student - " + (i+1)
+ " Details");
System.out.println("---------------------");
s[i] = new Student();
s[i].read();
}
System.out.printf("\n%-20s %-20s %-20s %-20s",
"USN", "NAME", "BRANCH", "PHONE");
for (int i = 0; i < number; i++)
{
System.out.println();
s[i].display();
}
input.close();
}
}

