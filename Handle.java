public class Handle
{
  public static void main(String args[])
   {
     int a=10,b=0;
     int c;
     int d=a+b;
     System.out.println("Addition is "+d);
     try
	{
           c=a/b;
           System.out.println("division is "+c);
	}
     catch(Exception e1)
         {
  	   System.out.println("Cannot divide any number by the zero "+ e1);
         }
     int e=a-b;
     System.out.println("Substraction is"+e);
    }
}
