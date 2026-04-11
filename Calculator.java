import java.util.Scanner;
class Calculator{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
char op;
double num1, num2, num3;
System.out.print("Enter the number 1:");
num1=input.nextDouble();
System.out.print("Enter the number 2:");
num2=input.nextDouble();
System.out.print("Enter the operator:");
op = input.next().charAt(0);
switch (op){
case '+':
num3 = num1 + num2;
break;
case '-':
num3 = num1 - num2;
break;
case '*':
num3 = num1*num2;
break;
case '/':
num3 = num1/num2;
break;
default:
num3 = 0;}
System.out.println("Output = "+num3);
}}