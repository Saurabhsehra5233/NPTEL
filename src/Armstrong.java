
    import java.util.Scanner;
    public class Armstrong {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Any Number  ");
            int n=sc.nextInt();

            int c=0,a,temp;
            temp=n;
//Use while loop to check the number is Armstrong or not.
  while (n>0){
      a=n%10;
      n=n/10;
      c=c+(a*a*a);
  }
            if(temp==c){
                System.out.println("number is armstrong");
            }
            else {
                System.out.println("number is not armstrong");
            }


        }
    }
