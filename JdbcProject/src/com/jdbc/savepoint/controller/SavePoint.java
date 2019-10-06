package com.jdbc.savepoint.controller;

import com.jdbc.savepoint.service.SavePointTranscation;

public class SavePoint 
{
  public static void main(String[] args) 
{
	  SavePointTranscation savepoint=new SavePointTranscation();
	  savepoint.transcation();
}
}
