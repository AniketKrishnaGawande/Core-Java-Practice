package generic_class.post_generic.downCasting;

//Create a Holder class , that can hold ANY data type (primitive/ref type)
public class Post_gen_Holder<T> {
	private T ref;

	public Post_gen_Holder(T ref) {
		super();
		this.ref = ref;
	}

	public T getRef() {
		return ref;
	}
	
}
