package com.bridgelabz.controller;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.Companyshares;
import com.bridgelabz.model.CompanysharesModel;
import com.bridgelabz.model.Customerinfo;
import com.bridgelabz.model.CustomerinfoModel;
import com.bridgelabz.model.TransactionModel;
import com.bridgelabz.model.Transactions;
import com.bridgelazs.utility.Utility;

public class StockAccount {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		boolean isExit = false;
		int choice;
		int indexOfCustomer = 0;
		int indexOfCompany = 0;

		int customerId;
		int companySymbol;
		int buyshare;

		ObjectMapper mapper = new ObjectMapper();

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("HHmmss");

		CompanysharesModel compModel = new CompanysharesModel();
		CustomerinfoModel custModel = new CustomerinfoModel();
		TransactionModel transModel = new TransactionModel();

		// paths of files

		// for reading files
		String pathOfCompanyShares = "/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/json files/company_shares.json";
		String pathOfCustomerInfo = "/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/json files/customer_info.json";

		// for writing files
		String pathOfCompanyShares2 = "/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/json files/company_shares2.json";
		String pathOfCustomerInfo2 = "/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/json files/customer_info2.json";

		String pathOfTransaction = "/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/json files/transactions.json";
		// code for fetching json data and put it into models

		// code for fetching the company shares
		compModel = mapper.readValue(new File(pathOfCompanyShares), compModel.getClass());

		// code for fetching the customer info
		custModel = (CustomerinfoModel) mapper.readValue(new File(pathOfCustomerInfo), custModel.getClass());

		ArrayList<Customerinfo> custList = new ArrayList<Customerinfo>();
		ArrayList<Companyshares> compList = new ArrayList<Companyshares>();
		ArrayList<Transactions> transList = new ArrayList<Transactions>();

		File file = new File(pathOfTransaction);
		if (file.length() != 0) {
			transModel = (TransactionModel) mapper.readValue(new File(pathOfTransaction), transModel.getClass());
			transList.addAll(transModel.getTransactions());
		}

		custList.addAll(custModel.getCustomerinfo());
		compList.addAll(compModel.getCompanyshares());

		System.out.println("Welcome!!");
		System.out.println("Please enter customer id");
		customerId = Utility.getInt();
		boolean isCustomerFound = false;
		for (int i = 0; i < custList.size(); i++) {
			if (customerId == custList.get(i).getCustomer_symbol()) {
				isCustomerFound = true;
				indexOfCustomer = i;
				break;
			}
		}
		if (isCustomerFound) {
			while (!isExit) {
				System.out.println("Hello: " + custList.get(indexOfCustomer).getCustomer_name());
				System.out.println("Please select options\n" + "1. buy shares\n" + "2. sell shares\n"
						+ "3. print report\n" + "4. exit");
				choice = Utility.getInt();
				switch (choice) {
				case 1:
					// buy

					System.out.println("Please enter company symbol: ");
					companySymbol = Utility.getInt();

					System.out.println("Validating...");
					boolean isCompanyFound = false;
					for (int i = 0; i < compList.size(); i++) {
						if (companySymbol == compList.get(i).getCompany_symbol()) {
							isCompanyFound = true;
							indexOfCompany = i;
							break;
						}
					}

					if (isCompanyFound) {
						System.out.println(
								"The company you selected is: " + compList.get(indexOfCompany).getCompany_name());
						System.out.println("Company shares: " + compList.get(indexOfCompany).getCompany_shares());
						System.out.println(
								"Company share price: " + compList.get(indexOfCompany).getCompany_share_price());
						int customerBalance = custList.get(indexOfCustomer).getCustomer_balance();
						System.out.println("You have Balance: " + customerBalance);
						System.out.println();
						System.out.println("Please enter how much shares to buy: ");
						buyshare = Utility.getInt();

						// checking whether amount to buy whether user has that much amount or not
						if (buyshare < compList.get(indexOfCompany).getCompany_shares()) {
							// checking user has that much amount or not
							int companyShare = compList.get(indexOfCompany).getCompany_share_price();
							if (customerBalance > (buyshare * companyShare)) {
								int newCustomerBalance = customerBalance - buyshare * companyShare;

								// deducting customer balance
								custList.get(indexOfCustomer).setCustomer_balance(newCustomerBalance);
								// adding customer shares
								custList.get(indexOfCustomer).setCustomer_shares(
										custList.get(indexOfCustomer).getCustomer_shares() + buyshare);
								// deducting the company share
								compList.get(indexOfCompany)
										.setCompany_shares(compList.get(indexOfCompany).getCompany_shares() - buyshare);
								// calculating new total value of company
								compList.get(indexOfCompany)
										.setCompany_total_value(compList.get(indexOfCompany).getCompany_share_price()
												* compList.get(indexOfCompany).getCompany_shares());

								// code reflecting transaction
								Transactions trans = new Transactions();
								LocalDateTime now = LocalDateTime.now();

								String transId = dateTimeFormatter2.format(now)
										+ custList.get(indexOfCustomer).getCustomer_symbol()
										+ compList.get(indexOfCompany).getCompany_symbol();
								trans.setTransaction_id(transId);
								trans.setBuyer(custList.get(indexOfCustomer).getCustomer_name());
								trans.setSeller(compList.get(indexOfCompany).getCompany_name());
								trans.setTransaction_amount(
										buyshare * compList.get(indexOfCompany).getCompany_share_price());
								trans.setDatetime(dateTimeFormatter.format(now));

								transList.add(trans);

								int saveOrNot;
								System.out.println("Press\n" + "1. for save \n2. for not save");
								saveOrNot = Utility.getInt();
								if (saveOrNot == 1) {
									mapper.writeValue(new File(pathOfCompanyShares2), compModel.getCompanyshares());
									mapper.writeValue(new File(pathOfCustomerInfo2), custModel.getCustomerinfo());
									transModel.setTransactions(transList);
									transModel.setTransaction("Transactions");
									mapper.writeValue(new File(pathOfTransaction), transModel);
									System.out.println("Transaction has saved");
								} else if (saveOrNot == 2) {
									System.out.println("Transaction not saved");
								} else
									System.out.println("Transaction get void");

							} else
								System.out.println("You dont have enough balance");
						} else {
							System.out.println("Company don't have that much shares");
						}

					} else {
						System.out.println("Company not identified please try again...");
					}

					break;
				case 2:
					// sell

					System.out.println("Enter number of share you want to sell");

					int share = Utility.getInt();

					System.out.println("Please enter company symbol to who you want to sell: ");
					companySymbol = Utility.getInt();

					System.out.println("Validating...");
					boolean isCompanyFound2 = false;
					for (int i = 0; i < compList.size(); i++) {
						if (companySymbol == compList.get(i).getCompany_symbol()) {
							isCompanyFound2 = true;
							indexOfCompany = i;
							break;
						}
					}

					// if company is valid
					if (isCompanyFound2) {
						System.out.println(
								"The company you selected is: " + compList.get(indexOfCompany).getCompany_name());
						System.out.println("Company shares: " + compList.get(indexOfCompany).getCompany_shares());
						System.out.println(
								"Company share price: " + compList.get(indexOfCompany).getCompany_share_price());
						int amountToGet = share * compList.get(indexOfCompany).getCompany_share_price();
						System.out.println("Amount you will get: " + amountToGet);
						// company share increase
						if (share <= custList.get(indexOfCustomer).getCustomer_shares()) {
							compList.get(indexOfCompany)
									.setCompany_shares(compList.get(indexOfCompany).getCompany_shares() + share);
							// company value increase
							compList.get(indexOfCompany)
									.setCompany_total_value(compList.get(indexOfCompany).getCompany_share_price()
											* compList.get(indexOfCompany).getCompany_shares());

							// customer share decrease
							custList.get(indexOfCustomer)
									.setCustomer_shares(custList.get(indexOfCustomer).getCustomer_shares() + share);

							// customer balance increase

							custList.get(indexOfCustomer).setCustomer_balance(
									custList.get(indexOfCustomer).getCustomer_balance() + amountToGet);

							// code reflecting transaction
							Transactions trans = new Transactions();
							LocalDateTime now = LocalDateTime.now();

							String transId = dateTimeFormatter2.format(now)
									+ custList.get(indexOfCustomer).getCustomer_symbol()
									+ compList.get(indexOfCompany).getCompany_symbol();
							trans.setTransaction_id(transId);
							trans.setBuyer(compList.get(indexOfCompany).getCompany_name());
							trans.setSeller(custList.get(indexOfCustomer).getCustomer_name());
							trans.setTransaction_amount(share * compList.get(indexOfCompany).getCompany_share_price());
							trans.setDatetime(dateTimeFormatter.format(now));

							transList.add(trans);

							int saveOrNot;
							System.out.println("Press\n" + "1. for save \n2. for not save");
							saveOrNot = Utility.getInt();
							if (saveOrNot == 1) {
								mapper.writeValue(new File(pathOfCompanyShares2), compModel.getCompanyshares());
								mapper.writeValue(new File(pathOfCustomerInfo2), custModel.getCustomerinfo());
								transModel.setTransactions(transList);
								transModel.setTransaction("Transactions");
								mapper.writeValue(new File(pathOfTransaction), transModel);
								System.out.println("Transaction has saved");
							} else if (saveOrNot == 2) {
								System.out.println("Transaction not saved");
							} else
								System.out.println("Transaction get void");

						} else {
							System.out.println("You dont have that much shares to sell");
						}

					} else
						System.out.println("Company not found please try again");

					break;

				case 3:
					// print report

					System.out.println();
					System.out.println();
					boolean hasValue = false;
					for (int i = 0; i < transList.size(); i++) {
						if (Character.getNumericValue(transList.get(i).getTransaction_id().charAt(6)) == customerId) {
							hasValue = true;
							break;
						}
					}
					if (hasValue) {
						for (int i = 0; i < transList.size(); i++) {
							if (i == 0) {
								System.out.print("Transaction_ID\t");
								System.out.print("Buyer\t\t");
								System.out.print("Seller\t\t\t");
								System.out.print("Trans_Amt\t");
								System.out.println("DateTime\t");
							}
							if (Character
									.getNumericValue(transList.get(i).getTransaction_id().charAt(6)) == customerId) {
								System.out.print(transList.get(i).getTransaction_id() + "\t");
								System.out.print(transList.get(i).getBuyer() + "\t\t");
								System.out.print(transList.get(i).getSeller() + "\t\t");
								System.out.print(transList.get(i).getTransaction_amount() + "\t");
								System.out.println(transList.get(i).getDatetime() + "\t");

							}

						}
					} else
						System.out.println("You dont have any transactions!!!");

					System.out.println();
					System.out.println();

					break;
				case 4:
					isExit = true;
					System.out.println("Thank you for using service");
					break;
				default:
					System.out.println("Please select valid option");
				}// end of switch loop

			} // end of while loop

		} else {
			System.out.println("Invalid customer id");
		}
	}

}
                       