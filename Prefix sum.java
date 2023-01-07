#prefix sum(bruteforec)
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int start=sc.nextInt();
    int end = sc.nextInt ();
   
    int[] a1 = { 10, 20, 30, 40, 59, 63, 65, 8 };
        for(int i=0;i<1;i++){
             int sum=0;
            for(int j=start;j<=end;j++){
                sum+=a1[j];
                //System.out.println("input array"+a1[j]);
            }
             System.out.println("sum of prefix is "+sum);
        }
       
  }
}



//time complexity of BruteForce apporch is >>O(m*n)
//it needs to excute code number of times.

