import java.util.Scanner;
/*public class Question3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number  ");
        int n= sc.nextInt();
        int sum=0;
        int result=1;
            for(int i=0; i<=n*2; i++){

                if(i%2==0){

                    System.out.println(i);
                }
                       }
                         }
                         Even num and sum of divisival by 3
}*/

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int result=1;
        int i=0;
        while(result<=n)
        {
            if(i%2==0)
            {
                if(i%3==0)
                {
                    sum=sum+i;

                }
                result=result+1;
            }
            i=i+1;
        }
        System.out.println(sum);
    }
}
