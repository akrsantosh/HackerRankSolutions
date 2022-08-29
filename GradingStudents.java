package HackerRankSolutions;

import java.util.ArrayList;
import java.util.List;


/*
 * step 1: need to check the difference btw the grade & the next multiple of 5
 * 			and if the diff is less than 3, round up to the next multiple of 5. 
 * step 2: If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
 *
 */
public class GradingStudents {

	public static void main(String[] args) {
		
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(33);
		marks.add(73);
		marks.add(67);
		marks.add(38);
		gradingStudents(marks);

	}
	public static List<Integer> gradingStudents(List<Integer> grades) {
        int i =0;
        int grade;
     while(i<grades.size()){
        
        if(grades.get(i)>= 38)
        {
        	int gr = grades.get(i)/5;
        	gr++;
        	gr = gr*5;
        	
        	if(gr-grades.get(i) <3) {
        		grades.set(i, gr);
        		
        	}
        }
         i++;
     }
	return grades;

    }

}
