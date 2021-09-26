package cardNameGenerator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONAssetLoader {
	static JSONParser parser = new JSONParser();


	public static ArrayList<String> loadJSONFromAsset(String fileName) throws IOException {

		try {
			JSONArray array = (JSONArray) parser.parse(new FileReader(fileName));
			ArrayList<String> words = array;
			return words;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static String capitalise(String word) {
		return word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
	}
}
