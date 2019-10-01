package com.bridgelabz.controller;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.StockDetails;


public class StockPortf {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper object = new ObjectMapper();
		StockDetails smodel = new StockDetails();
		smodel = object.readValue(new File("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/json files/stock.json"),
				StockDetails.class);
		//int total=smodel.getStock().get(0).getNoofshares()*smodel.getStock().get(0).getShareprice();
		
			
	 System.out.println("company name is"+smodel.getStock().get(0).getCompanyname());
	 System.out.println("company no of shares  is"+smodel.getStock().get(0).getNoofshares());
     System.out.println("company shares prise is"+smodel.getStock().get(0).getShareprice());
     int total=smodel.getStock().get(0).getNoofshares()*smodel.getStock().get(0).getShareprice();
	 smodel.getStock().get(0).setTotal(total);
	
	 System.out.println("total is"+smodel.getStock().get(0).getTotal());
	 System.out.println();
		
	 System.out.println("company name is"+smodel.getStock().get(1).getCompanyname());
	 System.out.println("company no of shares  is"+smodel.getStock().get(1).getNoofshares());
	 System.out.println("company shares prise is"+smodel.getStock().get(1).getShareprice());
	 total=smodel.getStock().get(1).getNoofshares()*smodel.getStock().get(1).getShareprice();
	 smodel.getStock().get(1).setTotal(total); total=smodel.getStock().get(1).getNoofshares()*smodel.getStock().get(1).getShareprice();
	 System.out.println("total is"+smodel.getStock().get(1).getTotal());
	 System.out.println();
		
	System.out.println("company name is"+smodel.getStock().get(2).getCompanyname());
	System.out.println("company no of shares  is"+smodel.getStock().get(2).getNoofshares());
	System.out.println("company shares prise is"+smodel.getStock().get(2).getShareprice());
	total=smodel.getStock().get(2).getNoofshares()*smodel.getStock().get(2).getShareprice();
	smodel.getStock().get(2).setTotal(total);
  
    System.out.println("total"+smodel.getStock().get(2).getTotal());
    System.out.println();	
		 
		 object.writeValue(new File("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/json files/stockout.json"),smodel);
	}
}
