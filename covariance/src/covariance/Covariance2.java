package covariance;

class Grain {

	public String toString() {
		return "Grain";
	}
}

class Wheat extends Grain {

	public String toString() {
		return "Wheat";
	}
}

class Mill {

	Grain process() { // normal process
		return new Grain();
	}
}

class WheatMill extends Mill {
	Wheat process() {  // override with covariance as wheat is grain
		return new Wheat();
	}
}

public class Covariance2 {

	public static void main(String[] args) {
		Mill m = new Mill();
		Grain g = m.process();  //Grain g = new Grain();
		System.out.println(g); // grain
		m = new WheatMill();  // upcasting wheatMill to Mill 
		g = m.process();  // Grain g = new Wheat();
		System.out.println(g); // wheat
	}

}
