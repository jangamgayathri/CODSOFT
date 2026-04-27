import java.util.*;
public class GRADECALCULATOR {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of subjs: ");
int n1=sc.nextInt();
int total=0;
for(int i=1;i<=n1;i++){
System.out.print("Enter marks: ");
int m1=sc.nextInt();
total+=m1;
}
double average=(double)total/n1;
char grade;
if(average>=90) grade='A';
else if(average>=75) grade='B';
else if(average>=60) grade='C';
else if(average>=50) grade='D';
else grade='F';
System.out.println("Total:"+total);
System.out.println("Avg:"+average);
System.out.println("Grade:"+grade);
sc.close();
}
}