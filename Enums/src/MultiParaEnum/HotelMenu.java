package MultiParaEnum;

public enum HotelMenu{
	
	PIZZA(459),BURGER(229),NOODELS(250),FRIED_RICE(230),PANEER(200); // extra data ie price of dishes
private double price; // extra data type
	HotelMenu(double price) // only private by default // ctor need to define
{
	this.price=price;
}
	public double getPrice() // to get price outside
	{
		return price;
	}
	
	/*
	 * public String toString() // override toString to get name and price as well {
	 * return name()+" "+price; }
	 */

}