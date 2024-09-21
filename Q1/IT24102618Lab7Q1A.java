import java.util.Scanner;
public class IT24102618Lab7Q1A{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter marks of four subjects:");
System.out.print("Enter Subject Mark 1:");
int M1 = scanner.nextInt();
System.out.print("Enter Subject Mark 2:");
int M2 = scanner.nextInt();
System.out.print("Enter Subject Mark 3:");
int M3 = scanner.nextInt();
System.out.print("Enter Subject Mark 4:");
int M4 = scanner.nextInt();
double avg = (M1+M2+M3+M4)/4.0;
String grade = "";
if((avg>=75)&&(avg<=100)){
grade = "Distinction";
}
else if((avg>=50)&&(avg<=74)){
grade = "Credit";
}
else if((avg>=0)&&(avg<=49)){
grade = "Fail";
}
else{
System.out.println("enter the correct marks");
}
System.out.println("Average is:" +avg);
System.out.println("Overall Grade is:" +grade);

scanner.close();
}
}





