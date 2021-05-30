import java.util.Arrays;

public class Largest {

  /*  public static int largest(int[] a, int total)
    {
        int max=0;
       for (int i=0;i<total;i++)
       {
           if(a[i]>max)
           {
               max=a[i];
           }
       }
        return max;
    }
*/
  public static int getSecondLargest(int[] a, int total){
      int temp;
      for (int i = 0; i < total; i++)
      {
          for (int j = i + 1; j < total; j++)
          {
              if (a[i] > a[j])
              {
                  temp = a[i];
                  a[i] = a[j];
                  a[j] = temp;
              }
          }
      }
      return a[total-2];
  }



    public static void main(String args[])
    {
        int a[]={85,4,5,6,6,99};
        System.out.println("lagest "+getSecondLargest(a,6));
    }

}
