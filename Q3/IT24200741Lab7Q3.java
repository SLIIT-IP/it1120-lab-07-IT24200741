import java.util.Scanner;

public class IT24200741Lab7Q3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int customerNum = 1;
		final double precentage = 0.05;
		double total = 0;
		double discount = 0;
		double payment = 0;
		char paymentMethod;
		
		while(customerNum<6){
			System.out.println("Customer " + customerNum);
			
			System.out.print("Enter total bill amount: ");
			total = sc.nextDouble();
			
			System.out.print("Enter mode of payment: ");
			paymentMethod = sc.next().charAt(0);
			
			if(paymentMethod == 'C' || paymentMethod == 'c'){
				discount = total * precentage;
				System.out.println("Discount is : " + discount);
				payment = total - discount;
			}else if(paymentMethod == 'O' || paymentMethod == 'o'){
				System.out.println("No discount applicable");
				payment = total;
			}else{
				System.out.println("Payment Mode is Not Valid");
				System.out.println();
				customerNum++;
				continue;
			}
			
		    System.out.println("Amount to be paid: " + payment);
		    System.out.println();
		    customerNum++;
		}
	}
}