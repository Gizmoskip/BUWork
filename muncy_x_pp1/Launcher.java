/**
	This is the launcher class which starts the program
	@author Wade Muncy
	@version 1.0
	Programming Project One
	CS322 - Compiler Construction
	Fall 2019
**/

import java.util.*;

public class Launcher{

public static void main(String[] args) {
	
	String fileName = args[0];
        int printFlag = Integer.parseInt(args[1]);	
	PatternMatcher match = new PatternMatcher();
	
	Scanner sc = new Scanner(fileName);
	
	while (sc.hasNextLine()){
		match.process(sc.nextLine());
	}
	
	match.printHash(printFlag);
        
        
	
	//instantiate the class that contains the pattern matching and hashmap storage
	
	//iterate through the log file and pass each line from the file to the class that implements pattern matching and hashmap storage for processing
	
	//print summary output after each file has been processed
	
	
	
	
	
	
	
	
}

}