package com.wowchar.time;

public class TimeToWord {
	 static void printWords(int hour, int mins)  throws InvalidTimeException
	    {
	        String words[] = { "zero", "one", "two", "three", "four",
	                            "five", "six", "seven", "eight", "nine",
	                            "ten", "eleven", "twelve", "thirteen",
	                            "fourteen", "fifteen", "sixteen", "seventeen",
	                            "eighteen", "nineteen", "twenty", "twenty one",
	                            "twenty two", "twenty three", "twenty four",
	                            "twenty five", "twenty six", "twenty seven",
	                            "twenty eight", "twenty nine",
	                        };
	        if(hour>=24 || mins>60 || hour<0 || mins<0) {
	           throw new InvalidTimeException("Time should be less than 24h and 60m");    
	        }
	        else {
	        	if (mins == 0) {
	        		if(hour == 12) {
	        			System.out.println("It's Midday");
	        		}
	        		else if(hour == 0) {
	        			System.out.println("It's Midnight");
	        		}
	        		else {
	        			System.out.println("It's " +words[hour] + " o' clock ");
	        		}
		            
		        }
		        else if (mins == 1) {
		            System.out.println("It's one minute past " +
		                                          words[hour]);
		        }
		        else if (mins == 59) {
		            System.out.println("It's one minute to " +
		                            words[hour]);
		        }
		        else if (mins == 15) {
		            System.out.println("It's quarter past " + words[hour]);
		        }
		        else if (mins == 30) {
		            System.out.println("It's half past " + words[hour]);
		        }
		        else if (mins == 45) {
		            System.out.println("It's quarter to " +
		                                words[hour]);
		    }
		        else if (mins <= 30) {
		            System.out.println( "It's " +words[mins] + " minutes past " +
		                                                    words[hour]);
		        }
		        else if (mins > 30) {
		            System.out.println( "It's " +words[60 - mins] + " minutes to " +    
		                                             words[hour]);
		        }
	        }
	       
	     
	        
	    }
}
