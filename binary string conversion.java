import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	       int n=sc.nextInt();
	    String s="";
	    while(n>0){
	        s=n%2+s;
	        n=n/2;
	    }
		System.out.println(s);
	    }
	}
}

