package HackerRankSolutions;

public class TimeConversion {

	public static void main(String[] args) {
		
		String time = new String();
		time ="04:25:00PM";
		System.out.println(timeConversion(time));

	}

	
	  public static String timeConversion(String s) {
		    // Write your code here
		      if(s.endsWith("PM")) { 
		          int n=Integer.parseInt(s.substring(0,2));
		           if(n<12){
		        return Integer.toString(n+12)+s.substring(2,s.length()-2);

		           }
		       }
		     if(s.endsWith("AM"))
		        {
		            int n=Integer.parseInt(s.substring(0,2));
		            if(n==12){
		                return "00"+s.substring(2,s.length()-2);
		            }
		        }
		 return s.substring(0,s.length()-2);
		}

}
