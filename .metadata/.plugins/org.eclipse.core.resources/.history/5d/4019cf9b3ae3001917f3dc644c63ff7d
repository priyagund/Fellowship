package com.bridgelabz.controller;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.dtatstructure.Stack;
import com.bridgelabz.model.TransactionModel;
import com.bridgelabz.model.Transactions;
import com.bridgelazs.utility.Utility;

public class StockAccountUsingStack {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();

		String pathOfTransactions = "/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/json files/transactions.json";

		TransactionModel model = new TransactionModel();

		model = (TransactionModel) mapper.readValue(new File(pathOfTransactions), model.getClass());

		Stack<Transactions> stack = new Stack<Transactions>();

		stack.pushAll(model.getTransactions());

		System.out.println("Enter company symbol to see transactions of that company: ");
		int companySymbol = Utility.getInt();
		boolean isPrint = false;

		System.out.println("Validating...");
		//System.out.println(stack.size());
		int size = stack.size();
		for (int i = 0; i < size; i++) {

			if (companySymbol == Integer.parseInt(stack.peek().getTransaction_id().substring(7, 11).toString())) {
				if (!isPrint) {
					if (i == 0) {
						System.out.print("Transaction_ID\t");
						System.out.print("Buyer\t\t");
						System.out.print("Seller\t\t\t");
						System.out.print("Trans_Amt\t");
						System.out.println("DateTime\t");
					}
					isPrint = true;
				}
				System.out.print(stack.peek().getTransaction_id() + "\t");
				System.out.print(stack.peek().getBuyer() + "\t\t");
				System.out.print(stack.peek().getSeller() + "\t\t");
				System.out.print(stack.peek().getTransaction_amount() + "\t");
				System.out.println(stack.peek().getDatetime() + "\t");
			}

			stack.pop();
		}
		if (!isPrint) {
			System.out.println("No transaction for this company");
		}

	}

}
