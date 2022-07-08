package HackerRankSolutions;

import java.util.ArrayList;
import java.util.List;

public class BirthdayCandles {

	public static void main(String[] args) {
		List<Integer> candles = new ArrayList<Integer>();
	//	44 53 31 27 77 60 66 77 26 36
		candles.add(44);
		candles.add(53);
		candles.add(31);
		candles.add(27);
		candles.add(77);
		candles.add(60);
		candles.add(66);
		candles.add(77);
		candles.add(26);
		candles.add(36);
		
		int units = birthdayCakeCandles(candles);
		System.out.println(units);

	}
	public static int birthdayCakeCandles(List<Integer> candles) {
	    
	    int max = 0;
	    int count = 0;
	    for (int i= 0;i<candles.size();i++){
	    	
	    	 
	    	if((candles.get(i) == max) || (candles.get(i)>max) ) {
	    		if(candles.get(i)>max) max = candles.get(i);
	    		
	    	}
	      
	    }
	    for(int nums:candles) {
	    	if(nums == max) {
	    		count++;
	    	}
	    }
	    
	   return count;
	    }

}
