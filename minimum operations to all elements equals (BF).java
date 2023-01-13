//Minum opertions to make all elements equal:
//BF:TAKE AN ARRAY WE ARE TAKING TWO ARRAYS OUTER LOOP POINTS TO TARGT POINT,INNER LOOP POINTS TO ALL ELEMENTS
//TC=O(N2)
public class Main
{
	public static void main(String[] args) {
	    int[] a={1,2,9,10,15,17,17,17};
	    int curnyf=0;
	    int maxf=0;
	    for(int i=0;i<a.length;i++){
	        curnyf=1;
	        for(int j=0;j<a.length;j++){
	            if(i==j){
	            continue;
	            }
	            if(a[j]==a[i]){
	                curnyf++;
	            }
	            
	        }
	        if(curnyf>maxf){
	            maxf=curnyf;
	        }
	    }
		System.out.println(a.length-maxf);
	}
}

