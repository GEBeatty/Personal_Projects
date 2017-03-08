/**
 *	This class create collectible objects from Animal Corssing New Leaf
 */

public class ACNL_Collectible extends ACNL_Item{
	String storePrice;

	public ACNL_Collectible(String _name, String _sellPrice, String _String _storePrice){
		super(_name, _sellPrice);
		storePrice = _storePrice;
	}
}