/**
 *	This class is used to create the objects necessary to create a
 *	directory of Animal Crossing New Leaf items.
 */

public class ACNL_Item{
	String name;
	String sellPrice;

	public ACNL_Item(String itemName, String itemSell){
		name = itemName;
		sellPrice = itemBells;
	}

	public String getName(){
		return name;
	}

	public String getSellPrice(){
		return sellPrice;
	}

	public boolean itemCompare(String input){
		if(input.equalsIgnoreCase(name)){
			return true;
		}

		return false;
	}
}