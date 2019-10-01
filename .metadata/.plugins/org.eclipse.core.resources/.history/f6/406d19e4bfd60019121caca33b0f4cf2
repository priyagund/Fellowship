
/******************************************************************************
*  Purpose: Queue class to enque and deque the operation 
*
*  @author  Priyanka gund
*  @version 1.0
*  @since   12-09-2019
*
******************************************************************************/
package com.bridgelabz.dtatstructure;
public class Queue
{
	int Queue[]=new int[8];
	int size;
	int front;
	int rear;
	int count=0;
	public boolean isEmpty()
	{
		if(rear==front)
			 return true;
		     return false;
	}
	
	public void enQueue(int val)
	{
		Queue[rear]=val;
		rear++;
		count++;
	}
	
   public int deQueue()
   {   count--;
	 return Queue[front++];
   }
   
   public void show() 
   {
	   front=front+1;
	   for(int i=front;i<rear;i++) {
		   System.out.println(Queue[i]+ "element");
	   }
   }
}
