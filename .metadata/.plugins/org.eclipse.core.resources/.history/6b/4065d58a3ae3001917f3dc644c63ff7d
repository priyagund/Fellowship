

package com.bridgelabz.controller;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.dtatstructure.LinkedList;
import com.bridgelabz.model.Companyshares;
import com.bridgelabz.model.CompanysharesModel;
import com.bridgelazs.utility.Utility;

public class StockAccountUsingLinkedList {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();

		CompanysharesModel compModel = new CompanysharesModel();

		// paths of files
		String pathOfCompanyShares = "/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/json files/company_shares.json";

		// code for fetching json data and put it into models
		File file = new File(pathOfCompanyShares);
		// code for fetching the company shares
		if (file.length() != 0) {
			compModel = (CompanysharesModel) mapper.readValue(new File(pathOfCompanyShares), compModel.getClass());
		}

		LinkedList<Companyshares> compList = new LinkedList<Companyshares>();

		compList.addAll(compModel.getCompanyshares());
		boolean isExit = false;

		while (!isExit) {
			System.out.println("Enter company symbol: ");
			int companySymbol = Utility.getInt();
			int indexOfCompany = 0;
			boolean isCompanyFound = false;
			for (int i = 0; i < compList.size(); i++) {
				if (companySymbol == compList.get(i).getCompany_symbol()) {
					isCompanyFound = true;
					indexOfCompany = i;
					break;
				}
			}
			if (isCompanyFound) {

				System.out.println("The company you selected is: " + compList.get(indexOfCompany).getCompany_name());
				System.out.println("Company shares: " + compList.get(indexOfCompany).getCompany_shares());
				System.out.println("Company share price: " + compList.get(indexOfCompany).getCompany_share_price());
				System.out.println("Company Total value: " + compList.get(indexOfCompany).getCompany_total_value());
				System.out.println("Welcome please select task: ");
				System.out.println("1. for adding shares\n2. for removing shares\n3. for exit");
				int sharesAmount;
				switch (Utility.getInt()) {
				case 1:
					// for adding shares
					System.out.println("Enter number of shares");
					sharesAmount = Utility.getInt();
					compList.get(indexOfCompany)
							.setCompany_shares(compList.get(indexOfCompany).getCompany_shares() + sharesAmount);
					compList.get(indexOfCompany).setCompany_total_value(compList.get(indexOfCompany).getCompany_shares()
							* compList.get(indexOfCompany).getCompany_share_price());
					System.out.println("Data saved!!!");
					System.out.println("Company: " + compList.get(indexOfCompany).getCompany_name());
					System.out.println("Company shares: " + compList.get(indexOfCompany).getCompany_shares());
					System.out.println("Company share price: " + compList.get(indexOfCompany).getCompany_share_price());
					System.out.println("Company Total value: " + compList.get(indexOfCompany).getCompany_total_value());
					
					mapper.writeValue(new File(pathOfCompanyShares), compModel);
					break;
				case 2:
					// for removing shares
					System.out.println("Enter number of shares to remove");
					sharesAmount = Utility.getInt();
					// check whether company have greater shares than sharesto remove
					if (compList.get(indexOfCompany).getCompany_shares() > sharesAmount) {
						compList.get(indexOfCompany)
								.setCompany_shares(compList.get(indexOfCompany).getCompany_shares() - sharesAmount);
						compList.get(indexOfCompany)
								.setCompany_total_value(compList.get(indexOfCompany).getCompany_shares()
										* compList.get(indexOfCompany).getCompany_share_price());

						System.out.println("Data saved!!!");
						System.out.println("Company: " + compList.get(indexOfCompany).getCompany_name());
						System.out.println("Company shares: " + compList.get(indexOfCompany).getCompany_shares());
						System.out.println(
								"Company share price: " + compList.get(indexOfCompany).getCompany_share_price());
						System.out.println(
								"Company Total value: " + compList.get(indexOfCompany).getCompany_total_value());
						mapper.writeValue(new File(pathOfCompanyShares), compModel);
					} else
						System.out.println("Company don't have that much shares to remove");
					
					
					break;
				case 3:
					isExit = true;
					System.out.println("Thank you for your time");
					break;
				default:
					System.out.println("Invalid Option");
					break;

				}
			} else
				System.out.println("Company not found");
		}

	}

}