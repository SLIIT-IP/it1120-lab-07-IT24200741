import java.util.Scanner;

public class IT24200741Lab7Q1A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double subs = 0;
        double total = 0;
        String grade;
        int subCount = 1;
		double average = 0;
		
		System.out.println("Enter marks for four subjects:");
		
		while(subCount < 5){
			System.out.print("Enter Subject Mark " + subCount + ": ");
			subs = sc.nextDouble();
			total += subs;
			average = total/4;
			subCount++;
		}
		
		if(average>=75 && average<=100){
			grade = "Distinction";
		}else if(average>=50 && average<=74){
			grade = "Credit";
		}else{
			grade = "Fail";
		}
		
		System.out.println();
		System.out.println("Average is: " + average);
		System.out.println("Overall Grade is: " + grade);
    }
}