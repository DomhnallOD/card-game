/*
 * This class is responsible for generating the name of monster cards
 * It has 5 inner classes of MonsterNameStrategy1...5, which build names to different formats
 * The static function "generate" then randomly selects which strategy to invoke when generating the name
 * 
 * This could be made more succinct - no need for multiple inner classes:
 * Instead use an array of function pointers instead?
 * 		https://stackoverflow.com/questions/2752192/array-of-function-pointers-in-java
 */

package cardNameGenerator;

import java.util.Random;


public class MonsterNameGenerator {
	private static int nameStrategy;
	private static Random rand = new Random();
	private static String name;
	
	public class MonsterNameStrategy1{
		

		public static String generateName() {

			StringBuilder name = new StringBuilder();
			
	        //Build the card's name with StringBuilder
	        name.append(WordSelector.RandomWordGenerator(WordType.CONCRETE_NOUN))
	        .append(" of ")
	        .append(WordSelector.RandomWordGenerator(WordType.ABSTRACT_NOUN));
			
			return name.toString();
		}

	}

	public class MonsterNameStrategy2{

		public static String generateName() {

			StringBuilder name = new StringBuilder();
			
	        //Build the card's name with StringBuilder
	        name.append(WordSelector.RandomWordGenerator(WordType.ADJECTIVE))
	        .append(" ")
	        .append(WordSelector.RandomWordGenerator(WordType.CONCRETE_NOUN));
			
			return name.toString();

		}

	}

	public class MonsterNameStrategy3 {

		public static String generateName() {

			StringBuilder name = new StringBuilder();
			
	        //Build the card's name with StringBuilder
	        name.append(WordSelector.RandomWordGenerator(WordType.ADJECTIVE))
	        .append(" ")
	        .append(WordSelector.RandomWordGenerator(WordType.LASTNAME))
	        .append(" of ")
	        .append(WordSelector.RandomWordGenerator(WordType.PLACENAME));
			
			return name.toString();
		}


	}

	public class MonsterNameStrategy4 {
		public static String generateName() {

			StringBuilder name = new StringBuilder();
			
	        //Build the card's name with StringBuilder
	        name.append(WordSelector.RandomWordGenerator(WordType.ADJECTIVE))
	        .append(" ")
	        .append(WordSelector.RandomWordGenerator(WordType.FIRSTNAME))
	        .append(" ")
	        .append(WordSelector.RandomWordGenerator(WordType.LASTNAME));
			
			return name.toString();
		}


	}

	public class MonsterNameStrategy5{

		public static String generateName() {

			StringBuilder name = new StringBuilder();
			
	        //Build the card's name with StringBuilder
	        name.append(WordSelector.RandomWordGenerator(WordType.FIRSTNAME))
	        .append("'s ")
	        .append(WordSelector.RandomWordGenerator(WordType.CONCRETE_NOUN));
			
			return name.toString();
		}


	}

	public static String generate() {
		nameStrategy = rand.nextInt(5) + 1;
		
		switch(nameStrategy){  
	    //Case statements - to identify which strategy is being called in testing, append a number to the name variable in each case
	    case 1:
	    	name = MonsterNameStrategy1.generateName();	    	
	    break;  
	    case 2: 
	    	name = MonsterNameStrategy2.generateName();	    	
	    break;  
	    case 3:
	    	name = MonsterNameStrategy3.generateName();	    	
	    break;  
	    case 4:
	    	name = MonsterNameStrategy4.generateName();
	    break;  
	    case 5:
	    	name = MonsterNameStrategy5.generateName();	    	
	    break;  	    
	    //Default case statement  
	    default: System.out.println("ERROR:\t MonsterNameGenerator - invalid int nameStrategy for switch-case!");  
	    }  
		
		return name;
		
	}


}
