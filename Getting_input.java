import java.util.Scanner;
 class Getting_input {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter name,age and salary:");
String name=sc.nextLine();
 int age=sc.nextInt();
double salary=sc.nextDouble();
System.out.println("Name of the user:"+name);
System.out.println("Age of the user:"+age);
System.out.println("Salary of the user:"+salary);
}
}