import java.util.Scanner;
public class IT24102618Lab7Q3{
public static void main(String[] arghs){
Scanner scanner=new Scanner(System.in);
final double DISCOUNT_RATE = 0.05;
for(int i=1;i<=5;i++){
System.out.println("Customer" +i);
System.out.print("Enter total bill amount:");
double amount = scanner.nextDouble();
System.out.print("Enter mode of payment(C for cash, O for other):");
char paymethod = scanner.next().charAt(0);
if(paymethod=='C'||paymethod=='c'){
double discount = amount * DISCOUNT_RATE;
double paid = amount - discount;
System.out.println("Discount is:" +discount);
System.out.println("Amount to be paid:" +paid);
}
else if(paymethod=='O'||paymethod=='o'){
System.out.println("No discount applicable");
System.out.println("Amount to be paid:" +amount);
}
else{
System.out.println("Payment Mode is Not valid");
}
System.out.println("");
}
}
}