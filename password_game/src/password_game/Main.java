package password_game;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
class Main{
public static void main(String[] Args) {
  System.out.println("Welcome to the password game");
  Scanner scan = new Scanner(System.in);
  System.out.println("Please choose a password");
 
	  		
	  		while(true) {
	  			 String input=scan.next();
	  			 //Rule 1: Your password should include at least 10 characters
	  			if(input.length()<10) {
	    	 System.out.println("Rule 1: Your password should include at least 10 characters");
	    	 continue;
	    	}
	            //Rule 2: Your password must include a number
	  			boolean isdigit=false;
	  			for(int i=0;i<input.length();i++) {
	  				char index=input.charAt(i);
	  				 isdigit = Character.isDigit(index);
	    		 if(isdigit) {
	    			 break;
	    		 }
	    		
	    	}
	  			if(isdigit==false) {
	    			System.out.println("Rule 2: Your password must include a number");
	    			continue;
	    		}
	  		//Rule 3: Your password must include a letter
	  			boolean isletter=false;
	  			for(int i=0;i<input.length();i++) {
	  				char index=input.charAt(i);
	  				 isletter = Character.isLetter(index);
	    		 if(isletter) {
	    			 break;
	    		 }
	    		
	    	}
	  			if(isletter==false) {
	    			System.out.println("Rule 3: Your password must include a letter");
	    			continue;
	    		}
	  			//Rule 4: Your password must include a special character
	  			boolean isSpecialCharacter=false;
	  			for(int i=0;i<input.length();i++) {
	  				char index=input.charAt(i);
	    		 if(!Character.isDigit(index)&&!Character.isLetter(index)&&!Character.isWhitespace(index)) {
	    			 isSpecialCharacter=true;
	    			 break;
	    		 }
	    		
	    	}
	  			if(isSpecialCharacter==false) {
	    			System.out.println("Rule 4: Your password must include a special character");
	    			continue;
	    		}
	  			//Rule 5: Your password should have digits that add up to 20
	  			 int counter=0;
	  			 for(int i = 0; i < input.length(); i++) {
	  				 if(Character.isDigit(input.charAt(i))){
	  					counter+=Character.getNumericValue(input.charAt(i));
	  				 }
	  			 }
	  			 if(counter!=20) {
	  				System.out.println("Rule 5: Your Password should have digits that add up to 20");
	  				continue;
	  			 }
	  			 //Rule 6: Your password should have digits that answer this math question for x: 8x-10=1990
	  			 boolean is250=false;
	  			 for(int i=0; i<input.length()-2;i++) {
	  				 if(input.charAt(i)=='2'&&input.charAt(i+1)=='5'&&input.charAt(i+2)=='0') {
	  					 is250=true;
	  					 break;
	  				 }
	  			 }
	  			 if(is250==false) {
  					 System.out.println("Rule 6: Your password should have digits that answer this math question for x: 8x-10=1990");
  					 continue;
  				 }
	  			//Rule 7: Your password should include a Roman Numeral
		           boolean romanNumeral=false;
		           for(int i=0;i<input.length();i++){
		        	   if(input.charAt(i)=='I'||input.charAt(i)=='V'||input.charAt(i)=='X'||input.charAt(i)=='L'||input.charAt(i)=='C'||input.charAt(i)=='D'||input.charAt(i)=='M') {
		        		   romanNumeral=true;
		        		   break;
		        	   }
		           }
		           if(romanNumeral==false) {
		        	   System.out.println("Rule 7: Your password should include a Roman Numeral");
		        	   continue;
		           }
		           //Rule 8: Your password should have these certain characters as capital letters: 1, 4, 5, 8
			          boolean capitalLetters=false;
			          if(Character.isUpperCase(input.charAt(0))&&Character.isUpperCase(input.charAt(3))&&Character.isUpperCase(input.charAt(4))&&Character.isUpperCase(input.charAt(7))) {
			        	  
			          }else {
			        	  System.out.println("Rule 8: Your password should have these certain characters as capital letters: 1, 4, 5,8");
			        	   continue; 
			          }
			        //Rule 9: Five people were eating apples, A finished before B, but behind C. D finished before E, but behind B. What was the finishing order?
		           //Answer: CABDE
			          boolean orderCorrect=false;
			           for(int i=0;i<input.length()-4;i++){
			        	   if(input.charAt(i)=='C'&&input.charAt(i+1)=='A'&&input.charAt(i+2)=='B'&&input.charAt(i+3)=='D'&&input.charAt(i+4)=='E') {
			        		   orderCorrect=true;
			        		   break;
			        	   }
			           }
			           if(orderCorrect==false) {
			        	   System.out.println("Rule 9:Five people were eating apples, A finished before B, but behind C. D finished before E, but behind B. What was the finishing order? Your password should include the people in capital letters.");
			        	   continue;
			           }
		           //Rule 10: Your password should have exactly 10 vowels
			           int vowelCounter=0;
			           for(int i = 0; i<input.length();i++) {
			        	   if(Character.toLowerCase(input.charAt(i))=='a'||Character.toLowerCase(input.charAt(i))=='e'||Character.toLowerCase(input.charAt(i))=='i'||Character.toLowerCase(input.charAt(i))=='o'||Character.toLowerCase(input.charAt(i))=='u') {
			        		   vowelCounter++;
			        	   }
			           }
			        	   if(vowelCounter!=10) {
			        		   System.out.println("Rule 10: Your password should have exactly 10 vowels");
			        		   continue;
			        	   }
			        	   
			        	 //Rule 11: Your password should include exactly 7 consonants
				           int consonantCounter=0;
				           for(int i=0;i<input.length();i++) {
				        	   if((Character.isLetter(input.charAt(i)))&&(Character.toLowerCase(input.charAt(i))!='a'&&Character.toLowerCase(input.charAt(i))!='e'&&Character.toLowerCase(input.charAt(i))!='i'&&Character.toLowerCase(input.charAt(i))!='o'&&Character.toLowerCase(input.charAt(i))!='u')) {
				        		   consonantCounter++;
				        	   }
				           }
				           if(consonantCounter!=7) {
				        	   System.out.println("Rule 11: Your password should include exactly 7 consonants");
				        	   continue;
				  		}
				          //Rule 12: Your password should include a element from the periodic table
				           boolean isElement=false;
				           try {
			        		   BufferedReader br = new BufferedReader(new FileReader("elements.txt"));
			        		   String reader;
			        		   while((reader=br.readLine())!=null) {
			        			   for(int i=0; i<input.length();i++) {
			        				   if(input.contains(reader)) {
			        					   isElement=true;
			        					   break;
			        				   }
			        			   }
			        		   }
			        	   }catch(Exception ex) {
			        	   }
				           if(isElement=false) {
				        	   System.out.println("Rule 12: Your password should include a element from the periodic table");
				        	   continue;
				           }
				           System.out.println("Congrats, you have succesfully made a secure password. Your safe and secure password is " + input);
}
}

}