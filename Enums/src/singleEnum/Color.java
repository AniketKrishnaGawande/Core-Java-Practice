package singleEnum;

public enum Color   
{
WHITE,RED,BLUE,BLACK;	 // enum fields 
	public String toString() // override toString to get field name
	{
		return name();
	}
}
