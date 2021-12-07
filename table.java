import java.util.*;
class table
{
    public static void main(String args[])
    { int num,i;
	  Scanner af=new Scanner(System.in);
	  System.out.println("Enter a number ");
	  num=af.nextInt();
	  	System.out.println("table "+num);
      for(i=1;i<=10;i++)
	  {  
	    System.out.println(num*i);
	  }
	 }
}