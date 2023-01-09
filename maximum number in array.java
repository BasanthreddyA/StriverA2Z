/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arry={10,50,60,70,80,10,20};
	    ////*by using sorting*///
	    int n=arry.length;
	    Arrays.parallelSort(arry);//we can use sort or parallel sort method(Arrays.sort(arry))
		System.out.println(arry[arry.length-1]);
		
		//**by using max variable**//
		int max=arry[0]; // by 
		for(int i=0;i<arry.length;i++){
		    if(arry[i]>max){
		        max=arry[i];
		    }
		}
		System.out.println(max);
	}
}


