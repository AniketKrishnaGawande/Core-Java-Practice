package generic_class.post_generic;

public class PostGeneric <T>  // <T> is generic, any name can come here
{
	
	private T itr;  // will replace T by our give type while instantiating
	
	public PostGeneric(T itr) {
		this.itr = itr;
	}


	public T getItr()
	{
		return itr;
	}}
