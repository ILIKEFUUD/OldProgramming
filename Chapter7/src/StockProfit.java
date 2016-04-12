import java.util.Scanner;

/*Rahul Shah
 * PD2
 * 3/31/14
 * StockProfit.java 
 * The profit from the sale of a stock can be calculated as follows:

 ((number of shares * sale price) – sales commission) – ((number shares * purchase price) 
 + purchase commission) 

If the calculation yields a positive value, then the sale of the stock resulted 
I a profit. If the calculation yields a negative number, then the sale resulted in a loss.

Write a method that accepts as arguments the number of shares, purchase price, purchase 
commission, sale price and the sales commission. The method should return the profit or 
loss value from the stock sale. 

 */
public class StockProfit {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int numShares = 0;
		double salePrice, saleComm, purPrice, purComm;
		
		//prompt and read
		System.out.print("Enter the number of shares: ");
		numShares = scan.nextInt();
		System.out.print("Enter the purchase price per share: ");
		purPrice = scan.nextDouble();
		System.out.print("Enter the purchase commision: ");
		purComm = scan.nextDouble();
		System.out.print("Enter the sale price per share: ");
		salePrice = scan.nextDouble();
		System.out.print("Enter the sale commision: ");
		saleComm = scan.nextDouble();
		
		

	}//end of main
	
	//precondition: all values sent are 0 or higher
	//post conditions: calculates a profit or loss from stock sales
	//and returns that value
	
	public static double stockProfit (double ns, double pp, double pc, double sp, double sc){
		
		double profit = ((ns * sp) - sc) - ((ns * pp) + pc);
		return profit;
	}//end of stockProfit
	
	
	

}//end of StockProfit
