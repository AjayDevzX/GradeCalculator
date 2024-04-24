package Grade;

import java.util.*;

public class GradeCalculator {
	double a=0,b=0,c,d;
	int i;
	Scanner s;
						
	void readInput(){
		
		 s = new Scanner(System.in);
		System.out.print("Total Mark for Exam: ");
		d= s.nextDouble();
		
		System.out.print("Total number Subjects: ");
		a= s.nextDouble();				
		
	}
	
	void markTotal(){
		
		if(a > 0) {
			
			for(i =1; i<=a; i++) {
						
				System.out.println("Enter mark of Subject "+i+" : ");
				double mark =s.nextDouble();
				
				b=b+mark;
						
			}
				
			
			System.out.println("Total Mark is: " +b);
		
	}
	}
	
	
	void percentage() {
		
		c = ((b/d)*100);
		System.out.println("Percentage is: " +c+"%");
		
		
	}
	
	 void grade(){
		if(c>=90) {
			System.out.println("Grade A");
		}
		else if((c >=70)&&(c < 90)){
			System.out.println("Grade B");
		}
		else if((c >=50)&&(c < 70)) {
			System.out.println("Grade c");
		}
		else if(c < 50) {
			System.out.println("Grade F");
		}
		
	}
	
	public static void main(String[] args) {		
		
		GradeCalculator calculates = new GradeCalculator();
		
		calculates.readInput();
		calculates.markTotal();
		calculates.percentage();
		calculates.grade();
		
		
	}

}
