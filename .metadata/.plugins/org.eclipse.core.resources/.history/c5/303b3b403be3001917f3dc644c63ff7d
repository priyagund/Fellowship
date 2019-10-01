package com.bridgelabz.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.InventoryModel;
import com.bridgelabz.model.Pulse;
import com.bridgelabz.model.Rice;
import com.bridgelabz.model.Wheat;
import com.bridgelazs.utility.Utility;

public class InventryManagementAdd
{
  public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException 
  {
	ObjectMapper object=new ObjectMapper();
	InventoryModel model=new InventoryModel();
	model=object.readValue(new File("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/json files/inventry1.json"),InventoryModel.class);
	
	ArrayList<Rice> ricelist=new ArrayList();
	ricelist.addAll(model.getRice());
	
	ArrayList<Wheat>wheatlist=new ArrayList();
	wheatlist.addAll(model.getWheat());
	

	ArrayList<Pulse>pulselist=new ArrayList();
	pulselist.addAll(model.getPulses());
	
	System.out.println("enter how many inventory you want to add");
	int inventory=Utility.getInt();
	
	while(inventory>0) {
	System.out.println("enter 1.for rice \n 2.n for wheat \n 3. for pulses");
	int choice=Utility.getInt();
	
	switch(choice)
	{
	case 1:Rice rice=new Rice();
		
		 System.out.println("enter rice name");
		 String ricename=Utility.getStr();
		 rice.setName(ricename);
		 
		 System.out.println("enter rice weight");
		 int riceweight=Utility.getInt();
		 rice.setWeight(riceweight);
		 
		 System.out.println("enter rice price");
		 int riceprice=Utility.getInt();
		 rice.setWeight(riceprice);
		 
		 int ricetotal=riceweight*riceprice;
		 rice.setTotal(ricetotal);
		 ricelist.add(rice);
		 break;
		 
	case 2: Wheat wheat=new Wheat();
	        
	        System.out.println("enter wheat name is");
	        String wheatname=Utility.getStr();
	        wheat.setName(wheatname);
	        
	        System.out.println("enter wheat weight is");
	        int wheatweight=Utility.getInt();
	        wheat.setWeight(wheatweight);
	        
	        System.out.println("enter wheat price is");
	        int wheatprice=Utility.getInt();
	        wheat.setPrice(wheatprice);
	      
	        int wheattotal=wheatweight*wheatprice;
		    wheat.setTotal(wheattotal);
		    wheatlist.add(wheat);
		    break;
		    
	case 3:	Pulse pulse=new Pulse();
			    
		    System.out.println("enter pulse name is");
			String pulsename=Utility.getStr();
	        pulse.setName(pulsename);
			    
			System.out.println("enter wheat weight is");
			int pulseweight=Utility.getInt();
			pulse.setWeight(pulseweight);
			    
			System.out.println("enter wheat price is");
			int pulseprice=Utility.getInt();
			pulse.setPrice(pulseprice);
			    
			int pulsetotal=pulseweight*pulseprice;
		    pulse.setTotal(pulsetotal);
            pulselist.add(pulse);
            break;
            
     default:
    	    System.out.println("you enter wrong choice");
	        break;
	}
	
	  inventory--;
	
	}
	
	     model.setRice(ricelist);
	     model.setWheat(wheatlist);
	     model.setPulses(pulselist);
	     object.writeValue(new File("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/json files/inventryOut.json"),model);
}
}
