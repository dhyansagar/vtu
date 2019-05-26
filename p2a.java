import java.util.Scanner;
class Staff
{
String StaffID, Name, Phone, Salary;
Scanner input = new Scanner(System.in);
void read()
{
System.out.print("Enter Staff-ID:");
StaffID = input.nextLine();
System.out.print("Enter Name:");
Name = input.nextLine();
System.out.print("Enter Phone:");
Phone = input.nextLine();
System.out.print("Enter Salary:");
Salary = input.nextLine();
}
void display()
{
System.out.printf("\n%-15s", "STAFFID: ");
System.out.printf("%-15s \n", StaffID);
System.out.printf("%-15s", "NAME: ");
System.out.printf("%-15s \n", Name);
System.out.printf("%-15s", "PHONE:");
System.out.printf("%-15s \n", Phone);
System.out.printf("%-15s", "SALARY:");
System.out.printf("%-15s \n", Salary);
}
}
class Teaching extends Staff
{
String Domain, Publication;
void read_Teaching()
{
super.read(); // call super class read method
System.out.print("Enter Domain:");
Domain = input.nextLine();
System.out.print("Enter Publication:");
Publication = input.nextLine();
}
void display()
{
super.display(); // call super class display()method
System.out.printf("%-15s", "DOMAIN:");
System.out.printf("%-15s \n", Domain);
System.out.printf("%-15s", "PUBLICATION:");
System.out.printf("%-15s \n", Publication);
}
}
class Technical extends Staff
{
String Skills;
void read_Technical()
{
super.read(); // call super class read method
System.out.print("Enter Skills:");
Skills = input.nextLine();
}
void display()
{
super.display(); // call super class display() method
System.out.printf("%-15s", "SKILLS:");
System.out.printf("%-15s \n", Skills);
}
}
class Contract extends Staff
{
String Period;
void read_Contract()
{
super.read(); // call super class read method
System.out.print("Enter Period:");
Period = input.nextLine();
}
void display()
{
super.display(); // call super class display() method
System.out.printf("%-15s", "PERIOD:");
System.out.printf("%-15s \n", Period);
}
}
class p2a
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.println("Staff Details Entry Implementation");
System.out.println("---------------------------------\n");
System.out.print("Enter the number of staff details to be created:");
int n = input.nextInt();
Teaching steach[] = new Teaching[n];
Technical stech[] = new Technical[n];
Contract scon[] = new Contract[n];
// Read Staff information under 3 categories
for (int i = 0; i < n; i++)
{
System.out.println("\nEnter Teaching staff information");
System.out.println("------------------------------- \n");
steach[i] = new Teaching();
steach[i].read_Teaching();
}
for (int i = 0; i < n; i++)
{
System.out.println("\nEnter Technical staff information");
System.out.println("------------------------------- \n");
stech[i] = new Technical();
stech[i].read_Technical();
}
for (int i = 0; i < n; i++)
{
System.out.println("\nEnter Contract staff information");
System.out.println("------------------------------- \n");
scon[i] = new Contract();
scon[i].read_Contract();
}
// Display Staff Information
System.out.println("\n STAFF DETAILS: \n");
System.out.println("--------------");
System.out.println("-----TEACHING STAFF DETAILS----");
for (int i = 0; i < n; i++)
{
steach[i].display();
}
System.out.println();
System.out.println("-----TECHNICAL STAFF DETAILS----");
for (int i = 0; i < n; i++)
{
stech[i].display();
}
System.out.println();
System.out.println("-----CONTRACT STAFF DETAILS----");
for (int i = 0; i < n; i++)
{
scon[i].display();
}
input.close();
}
}

