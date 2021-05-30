import java.util.Scanner;
public class Factorial {

    public int factorial(int a)
    {

        int i,num=a,fact = 1;
        for (i = 1; i <=num; i++)
        {
            fact = fact * i;

        }
        return fact;
    }

    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter number");
        int number=myObj.nextInt();
        Factorial obj=new Factorial();
        long output=obj.factorial(number);
        System.out.println("this is output  "+output);
      //  System.out.println("factorial of "+number+" is "+output);
      /*  for (i = 1; i <= num; i++)
        {
            fact = fact * i;
        }*/
    }

}
