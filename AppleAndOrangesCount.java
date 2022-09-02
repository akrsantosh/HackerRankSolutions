package HackerRankSolutions;

import java.util.ArrayList;
import java.util.List;

public class AppleAndOrangesCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int s = 7, t = 11, a =5, b = 15, m = 3, n =2 ;
	    List<Integer> apple = new ArrayList<Integer>();
	    List<Integer> orange = new ArrayList<Integer>();
	    apple.add(-2);
	    apple.add(2);
	    apple.add(1);
	   
	    orange.add(5);
	    orange.add(-6);

	    	countApplesAndOranges(s, t, a, b, apple, orange);
	    
	}

	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
		    // Write your code here
		         int appleCount =0;
		          int orangeCount = 0;
		          List<Integer> fruitCount = new ArrayList<Integer>();
		        for(int i=0;i<=apples.size()-1;i++){
		        	int count;
		            count =  a + apples.get(i);
		            fruitCount.add(i, count);
		            if(fruitCount.get(i)>=s && fruitCount.get(i)<=t){
		           appleCount +=1;
		        }
		        }
		        for(int j=0;j<=oranges.size()-1;j++){
		        	int count;
		        	count = b + oranges.get(j);
		        	fruitCount.add(j,count);
		             if(fruitCount.get(j)>=s && fruitCount.get(j)<=t){
		           orangeCount +=1;
		        }
		        }
		        
		        System.out.println(appleCount); 
		        System.out.println(orangeCount);
		    
		    }

}
