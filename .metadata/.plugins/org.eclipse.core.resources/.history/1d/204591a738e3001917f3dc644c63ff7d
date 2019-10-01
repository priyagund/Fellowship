package com.bridgelabz.controller;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.InventoryModel;

public class InventoryManagement
{
   public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException 
   {
	  
	ObjectMapper object=new ObjectMapper();
	InventoryModel inventrymodel=new InventoryModel();
	inventrymodel=object.readValue(new File("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/inventry1.json"),InventoryModel.class);
//	/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/json files/inventry.json
	//System.out.println(inventrymodel);
	for(int i=0;i<3 ;i++) {
	System.out.println("rice name is"+inventrymodel.getRice().get(i).getName());
	System.out.println("rice weight"+inventrymodel.getRice().get(i).getWeight());
	System.out.println("rice price"+inventrymodel.getRice().get(i).getPrice());
	System.out.println();
	System.out.println("rice total"+inventrymodel.getRice().get(i).getPrice()*inventrymodel.getRice().get(i).getWeight()+"");
	
	}
	System.out.println();
	
	for(int i=0;i<3;i++) {
	System.out.println("wheat name is"+inventrymodel.getWheat().get(i).getName());
	System.out.println("wheat weight is"+inventrymodel.getWheat().get(i).getWeight());
	System.out.println("wheat price is"+inventrymodel.getWheat().get(i).getPrice());
	System.out.println();
	System.out.println("wheat total is"+inventrymodel.getWheat().get(i).getPrice()*+inventrymodel.getWheat().get(i).getWeight());
	}
	
	System.out.println();
	
	for(int i=0;i<3;i++) {
	System.out.println("pulse name is"+inventrymodel.getPulses().get(i).getName());
	System.out.println("pulses weight is"+inventrymodel.getPulses().get(i).getWeight());
	System.out.println("pulses price is"+inventrymodel.getPulses().get(i).getPrice());
	System.out.println();
	System.out.println("wheat total is"+inventrymodel.getPulses().get(i).getPrice()*inventrymodel.getPulses().get(i).getWeight());
	}
	object.writeValue(new File("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/json files/inventryOut.json"),inventrymodel);

  }
}
