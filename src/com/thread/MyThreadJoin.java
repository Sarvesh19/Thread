package com.thread;

public class MyThreadJoin implements Runnable {


	public void run()
   	{
       		System.out.println("r1 ");
       		try {
        		Thread.sleep(1000);
    		}catch(InterruptedException ie){ } 
       		System.out.println("r2 ");
  	}
	public static void main(String[] args)
	{
		MyThreadJoin t1=new MyThreadJoin();
		MyThreadJoin t2=new MyThreadJoin();
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		thread2.start(); 
		
		try{
			thread2.join(1);	//Waiting for t2 to finish try 500
		}catch(InterruptedException ie){}

		thread1.start();
	}
}
