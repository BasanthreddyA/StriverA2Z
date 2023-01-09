public class Main
{
	public static void main(String[] args) {
	    int[] ar={10,20,30,40};
	    int small=Integer.MAX_VALUE;
	    int second_small=Integer.MAX_VALUE;
	    for(int i=0;i<ar.length;i++){
	        if(ar[i]<small){
	            second_small=small;
	            small=ar[i];
	        }else if(ar[i]<second_small && ar[i]!=small){
	            second_small=ar[i];
	        }
	            
	        }
	        System.out.println(second_small);
		
	}
}

