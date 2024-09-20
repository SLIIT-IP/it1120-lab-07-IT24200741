import java.util.Scanner;

public class IT24200741Lab7Q1B{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int stdCount = 1;
		double marks;
		double average = 0;
		String grade;
		
		while(stdCount < 4){
		    double total = 0;
			System.out.println("Student " + stdCount);
			System.out.print("Enter marks: ");
			
				for(int i = 1; i <= 4; i++){
					marks = sc.nextDouble();
        			total += marks;
        			average = total/4;
					
				}
			
				
			if(average>=75 && average<=100){
				grade = "Distinction";
			}else if(average>=50 && average<=74){
				grade = "Credit";
			}else{
				grade = "Fail";
			}
			
			System.out.println("Average is: " + average);
			System.out.println("Overall Grade is : " + grade);
			System.out.println();
			stdCount++;
		}
	}
}