import java.util.*;
class BANKACCOUNT {
double bal=0;
void deposit(double amt){
bal+=amt;
System.out.println("Deposited:"+amt);
}
void withdraw(double amt){
if(amt<=bal){
bal-=amt;
System.out.println("Withdrawn:"+amt);
}
else{
System.out.println("Insufficient balance");
}
}
void checkBalance(){
System.out.println("Balance:"+bal);
}
}
public class ATM{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
BANKACCOUNT acc=new BANKACCOUNT();
int ch;
while(true){
System.out.println("\n1.Deposit 2.Withdraw 3.Check Balance 4.Exit");
System.out.print("Enter choice:");
ch=sc.nextInt();
if(ch==1){
System.out.print("Enter amount:");
double amt=sc.nextDouble();
if(amt>0) acc.deposit(amt);
else System.out.println("Invalid amount");
}
else if(ch==2){
System.out.print("Enter amount:");
double amt=sc.nextDouble();
if(amt>0) acc.withdraw(amt);
else System.out.println("Invalid amount");
}
else if(ch==3){
acc.checkBalance();
}
else if(ch==4){
System.out.println("Thank you");
break;
}
else{
System.out.println("Invalid choice");
}
}
sc.close();
}
}