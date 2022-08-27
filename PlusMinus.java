package HackerRankSolutions;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

	public static void main(String[] args) {
		
		List<Integer> arry = new ArrayList<Integer>();
		arry.add(1);
		arry.add(-1);
		arry.add(0);
		arry.add(2);
		arry.add(-2);
		plusMinus(arry);
	}

	static void plusMinus(List<Integer> arr) {
	int i = 0;
	int zeroCount = 0;
	int postive = 0;
	int negative = 0;
	double z,p,n = 0;
	double j = (double) arr.size();
	while(i<= j-1) {
		
		if(arr.get(i) == 0) { 
			zeroCount++;
		}
		if(arr.get(i) > 0) {
			postive++;
		}
		if(arr.get(i) < 0) {
			negative++;
		}
		i++;
	}
	
		
		System.out.format("%.6f",postive/j);
		System.out.println();
		System.out.format("%.6f",negative/j);
		System.out.println();
		System.out.format("%.6f",zeroCount/j);
	}
}
