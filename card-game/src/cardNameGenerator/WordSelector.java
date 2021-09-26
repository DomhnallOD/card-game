/*
 * This is a singleton class
 * It's responsible for selecting a random word of whichever type is specified by the caller (as an enum) 
 * It holds a number of arrays of words of various types
 * These arrays are populated using the JSONAssetLoader utility class 
 * This class has a RandomWordGenerator function which returns a random word from an array corresponding to its WordType enum param
 * This functionality being contained to this class means that the *NameStrategy* classes are much smaller, as the word generation logic is reused from here
 */

package cardNameGenerator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class WordSelector {
	private static ArrayList<String> abstractNouns, adjectives, concreteNouns, firstnames, lastnames, placenames, prepositions, verbs;
	private static String word;
	private static WordSelector wordSelector; //Singleton instance of WordSelector

	/*
	 * Constructor populates out word arrays by parsing the JSON files
	 */
	public WordSelector() {
		//Use JSONAssetLoader to read JSON data from the assets/nameWords directory 
		try {
			abstractNouns = JSONAssetLoader.loadJSONFromAsset("C:/Users/odubh/eclipse-workspace/card-game/src/assets/nameWords/abstractNouns.json");
			adjectives = JSONAssetLoader.loadJSONFromAsset("C:/Users/odubh/eclipse-workspace/card-game/src/assets/nameWords/adjectives.json");
			concreteNouns = JSONAssetLoader.loadJSONFromAsset("C:/Users/odubh/eclipse-workspace/card-game/src/assets/nameWords/concreteNouns.json");
			firstnames = JSONAssetLoader.loadJSONFromAsset("C:/Users/odubh/eclipse-workspace/card-game/src/assets/nameWords/firstnames.json");
			lastnames = JSONAssetLoader.loadJSONFromAsset("C:/Users/odubh/eclipse-workspace/card-game/src/assets/nameWords/lastnames.json");
			placenames = JSONAssetLoader.loadJSONFromAsset("C:/Users/odubh/eclipse-workspace/card-game/src/assets/nameWords/placenames.json");
			prepositions = JSONAssetLoader.loadJSONFromAsset("C:/Users/odubh/eclipse-workspace/card-game/src/assets/nameWords/prepositions.json");
			verbs = JSONAssetLoader.loadJSONFromAsset("C:/Users/odubh/eclipse-workspace/card-game/src/assets/nameWords/verbs.json");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	/*
	 * Function which takes an enum value for the type of word to randomly generate
	 * It then executes the switch-case logic which returns the random word of the specified type
	 */
	public static String RandomWordGenerator(WordType wordType) {
		wordSelector = new WordSelector(); //Instantiate WordSelector when function is called - triggers ctor to populate arrays
		Random rand = new Random();
		
		switch(wordType){  
	    //Case statements  
	    case ABSTRACT_NOUN:
	        word = abstractNouns.get(rand.nextInt(abstractNouns.size()));
	        word = JSONAssetLoader.capitalise(word);
	    	
	    break;  
	    case ADJECTIVE: 
	        word = adjectives.get(rand.nextInt(adjectives.size()));
	        word = JSONAssetLoader.capitalise(word);
	    	
	    break;  
	    case CONCRETE_NOUN:
	        word = concreteNouns.get(rand.nextInt(concreteNouns.size()));
	        word = JSONAssetLoader.capitalise(word);
	    	
	    break;  
	    case FIRSTNAME:
	        word = firstnames.get(rand.nextInt(firstnames.size()));
	        word = JSONAssetLoader.capitalise(word);
	    	
	    break;  
	    case LASTNAME:
	        word = lastnames.get(rand.nextInt(lastnames.size()));
	        word = JSONAssetLoader.capitalise(word);
	    	
	    break;  
	    case PLACENAME:
	        word = placenames.get(rand.nextInt(placenames.size()));
	        word = JSONAssetLoader.capitalise(word);
	    	
	    break;  
	    case PREPOSITION:
	        word = prepositions.get(rand.nextInt(prepositions.size()));
	        word = word.toLowerCase();
	    	
	    break;  
	    case VERB:
	        word = verbs.get(rand.nextInt(verbs.size()));
	        word = JSONAssetLoader.capitalise(word);
	    	
	    break;  
	    
	    
	    //Default case statement  
	    default: System.out.println("ERROR:\t RandomWordGenerator received an invalid word type!");  
	    }  
		
		return word;
	}


}
