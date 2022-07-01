package HackerRankSolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagonalDifference {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> Arr = new ArrayList();
		
		System.out.println("Please enter the size of Matrix : ");
		int size = in.nextInt();
		
		
		//Initilasition of an ArrayList
				for( int i=0; i<size;i++) {
					Arr.add(new ArrayList<>());
					
				}
				
				
				//Adding Elements
				for( int i=0; i<size;i++) {
					
					for(int j=0;j<size;j++) {
						Arr.get(i).add(in.nextInt());
					}
					
				}
					System.out.println(Arr);
					
					int res = DiagonalDifference.diagonalDifference(Arr);
					System.out.println(res);
				
	}
	
	
	
	 public static int diagonalDifference(ArrayList<ArrayList<Integer>> arr) {
		   int leftdiagonal = 0, rightdiagonal = 0;
		for(int i = 0, j = arr.get(0).size()-1; i < arr.get(0).size(); i++, j--){
		        leftdiagonal = leftdiagonal + arr.get(i).get(i);
		        rightdiagonal = rightdiagonal + arr.get(i).get(j);
		    }
		    return Math.abs(leftdiagonal - rightdiagonal);
		    }
    
}
