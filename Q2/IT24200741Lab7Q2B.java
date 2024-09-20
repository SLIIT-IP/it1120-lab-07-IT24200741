public class IT24200741Lab7Q2B{
	public static void main (String[] args){
		int lineCount = 1;
		
		for(int i = 1; i <= 5; i++){
			System.out.print(lineCount + " - ");
			
			for(int j = 1; j <= i; j++){
				System.out.print("* ");
			}
			
			lineCount++;
			System.out.println();
		}
	}
}