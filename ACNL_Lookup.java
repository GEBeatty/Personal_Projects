import java.io.*;
import java.util.*;

/**
 *	This program is used as a reference to the various items in Animal Crossing New Leaf,
 *	giving the user their prices, locations, etc.
 */

public class ACNL_Lookup{
	public static void main(String[] args){
		// Create ArrayLists
		ArrayList<ACNL_Huntable> bugs = listCreationHuntable("bugs.txt");
		ArrayList<ACNL_Huntable> fish = listCreationHuntable("fish.txt");
		ArrayList<ACNL_Huntable> undersea = listCreationHuntable("undersea.txt");

		System.out.println("Welcome to the Animal Crossing New Leaf Lookup System(ACNLLS)")
		boolean mainLoop = true;
		Scanner userInput = new Scanner(System.in);
		do{
			// Take User input for database selection
			System.out.print("~~| MAIN DATABASE HUB |~~"+
							"\nSelect a database: " +
							"\n1) Bugs"+
							"\n2) Fish"+
							"\n3) Sea Creatures"+
							"\n0) Quit"+
							"\n\n > ");
			String input = userInput.nextLine();
			int numInput = -1;
			try{
				numInput = Interger.parseInt(input);
			} catch (NumberFormatException e){
				System.out.println("Please input a numerical value.");
				numInput = -1
			}

			if(numInput == 1){	// Bug
				System.out.println("Transferring to Bug Database . . .");
				ACNL_BugDatabase.hub();
			} else if (numInput == 2){	// Fish
				System.out.println("Transferring to Fish Database . . .");
			} else if (numInput == 3){	// Sea Creatures
				System.out.println("Transferring to Sea Creature Database . . .");
			} else if (numInput == 0){	// Quit
				mainLoop = false;	// Only statement that shuts down the program
				System.out.println("Shutting down . . .\nThank you for using the ACNLLS");
			} else {
				System.out.println("Please input a valid numerical value.");
			}
		} while(mainLoop);




		ACNL_Huntable foundItem = null;
		for(int i = 0; i < bugs.size(); i++){
			ACNL_Huntable currentItem = bugs.get(i);
			if(currentItem.itemCompare(input)){
				foundItem = currentItem;
			}
		}
	}

	public static void displayInfo(ACNL_Huntable item){
		System.out.println("Information about: " + item.getName()+
							"\n\tBells: " + foundItem.getSellPrice() +
							"\n\tLocation: " + foundItem.getLocation() +
							"\n\tAvailability: " + foundItem.getAvailable())
	}

	/**
	 *	Creates and returns and ArrayList for Huntable objects in 
	 *	Animal Crossing New Leaf
	 *	@param	fileName	Name of the file to get the objects
	 *	@return newList 	The new list of objects
	 */
	public static ArrayList<ACNL_Huntable> listCreationHuntable(String fileName){
		// Create list to send back
		ArrayList<ACNL_Huntable> newList = new ArrayList<>();

		File file;
		Scanner fileScan;
		// Use try-catch block in case the file doesn't exist
		try{
			file = new File(fileName);		// File name
			fileScan = new Scanner(file);	// Scanner for file
			// Copy each line from file into data and add to list
			while(fileScan.hasNext()){
				String line = fileScan.nextLine();
				String[] parts = line.split("[|]");
				ACNL_Huntable newItem = new ACNL_Huntable(parts[0], parts[1], parts[2], parts[3]);
				newList.add(newItem);
			}
		} catch (FileNotFoundException e){
			System.out.println("Error: File not found / " + e);
		}

		
		// Return the list
		return newList;
	}
}