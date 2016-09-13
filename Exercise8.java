import java.util.*;

class E8
{
    public static void main (String[] args)
    {
      Scanner myScanner = new Scanner(System.in);   
      int num1,num3; 
      double num4;
      String num2;

      System.out.println ("Enter the money you are investing : ");
      num1 = myScanner.nextInt(); 
      
      System.out.println ("Enter the interest rate in % : ");
      
      //num4 = myScanner.findInLine("(\\w+)%");
      num2 = myScanner.next();
      num4 = 0;
      boolean hasdot = false;
      double num_after_dot = 0;
      for (int i =0; i < (int)num2.length(); i++)
      {
        if (num2.charAt(i) == '%') break;
        if (hasdot) num_after_dot++;
        if (num2.charAt(i) == '.') 
        {
          hasdot = true;
          continue;
        }
        num4 = num4*10 + (num2.charAt(i)-'0');
      }
      System.out.printf("%f\n", num4);
      System.out.printf("%f\n", num_after_dot);
      num4/=(100 * Math.pow(10,num_after_dot));
      System.out.printf("%f\n", num4);
      System.out.println ("Enter the number of years you are investing your money : ");
      num3 = myScanner.nextInt();
      
      System.out.println ("The total amount of money you will get back : " + (num1*num4*num3+num1));
    }
}
