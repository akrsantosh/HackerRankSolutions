package HackerRankSolutions;

public class Staircase {

	public static void main(String[] args) {
		staircase(6);
	}
	
	public static void staircase(int n) { 
		int s = n-1;
		
	    for(int i =1;i<=n;i++){
	    	
	    	 for(int h=1;h<=s;h++){
	                System.out.print(" ");
	            }
	        for(int j=1;j<=i;j++){  
	        	
	            System.out.print("#");
	                       
	        }
	        System.out.println();
	        s--;
	    }

	    }


}
