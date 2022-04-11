package com.gl.javafsd.paymoney.transaction;
import java.util.Scanner;
// class classname
public class PayMoneyTransactionsUI {
	private int[] transactions;
	private Scanner input;
	
	//constructor
	
	public PayMoneyTransactionsUI() {
		
		input = new Scanner(System.in);
	}
	
	//method init
	
	
	public void init() {
		
		gatherInputsAndProcess();
	}
	//method gatherInputsAndProcess
	
	private void gatherInputsAndProcess() {
		
		System.out.println("Enter the size of the transaction array :");	
		int transactionArraySize = input.nextInt();	
		transactions = new int[transactionArraySize];
		

		System.out.println("Enter the transaction array element(s):");	
		for (int index = 0; index < transactionArraySize; index ++) {
			transactions[index] = input.nextInt();
			input.nextLine();
		}			
		
		System.out.print("Enter the number of transaction (instances) to be achieved:");
		int transactionsInstanceSize = input.nextInt();
		
		input.nextLine();
					
		for (int index = 1; index <= transactionsInstanceSize; index ++) {

			System.out.println();
			System.out.print("Enter the transaction / target value :");
			int dailyTarget = input.nextInt();

			input.nextLine();
		
			System.out.println("Processing transaction with value -> " + dailyTarget);
		
		
		// object 
			TargetsAchievementCalculator calculator 
			= new TargetsAchievementCalculator(
				transactions, dailyTarget);
			
			calculator.calculate();
			
			calculator.printOutcome();
					
		}
	
		}
		
	}




