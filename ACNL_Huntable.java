/**
 *	This class create Huntable objects from Animal Crossing New Leaf
 */

public class ACNL_Huntable extends ACNL_Item{
	String location;
	String available;

	public ACNL_Huntable(String _name, String _sellPrice, String _location,
							String _available){
		super(_name, _sellPrice);
		location = _location;
		available = _available;
	}

	public String getLocation(){
		return location;
	}

	public String getAvailable(){
		return available;
	}
}