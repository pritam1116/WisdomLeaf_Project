package com.wowchar.time;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour  = 10;
        int min   = 40;
       
        try{
        	
        	TimeToWord.printWords(hour, min);
        }
        catch (InvalidTimeException ex)  
        {  
            System.out.println("Time is not valid");  
    
            System.out.println("Exception occured: " + ex);  
        }  
	}

}
