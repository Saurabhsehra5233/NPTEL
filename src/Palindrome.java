import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number  ");
        int n=sc.nextInt();
        int a,sum=0,temp;
        temp=n;
        while (n>0){
            a=n%10;
            sum=(sum*10)+a;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("number is palindrome");
        }
        else {
            System.out.println("Number is not palindrome");
        }
    }
}
