import java.util.*;
class factorial
{
 public static void main(String[] args)
 { int fact=1,num;
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter any number");
	 num=sc.nextInt();
	 for(int i=num;i>1;i--)
	 { 
	   fact=fact*i;
	 }
	 System.out.println("factorial of number ="+fact);
 }
 }