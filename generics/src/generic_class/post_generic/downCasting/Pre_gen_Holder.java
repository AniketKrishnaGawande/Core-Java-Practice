package generic_class.post_generic.downCasting;

public class Pre_gen_Holder {
	// Create a Holder class , that can hold ANY data type (primitive/ref type)
	private Object ref;

	public Pre_gen_Holder(Object ref) {
		this.ref = ref;
	}

	public Object getRef() {
		return ref;
	}

}
