package nikki.com;
import java.util.Scanner; 


public class Fibo1 {
	public static void main(String args[])
	{  
	 int n1=0,n2=1,n3,i,count;  
	 System.out.print(n1+" "+n2);//printing 0 and 1  
	  System.out.print( "Enter number");
	  Scanner myObj = new Scanner(System.in);
	  count = myObj.nextInt();
	  for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed  
	 {  
	  n3=n1+n2;  
	  System.out.print(" "+n3);  
	  n1=n2;  
	  n2=n3;  
	 }  
	}
}



