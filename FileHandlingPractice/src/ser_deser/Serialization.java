package ser_deser;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Scanner;

public class Serialization {

	public static void main(String[] args) {

		Map<Integer,CoreBanking> map = BankingUtils.populateBank(); // used just to populate map by method written in our utils
		System.out.println("Enter file name ::");
		// javac -- oos -- file.txt
		try (Scanner sc = new Scanner(System.in);
				ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(sc.next()));) {
//OOS  having small buffered memory
			obj.writeObject(map); // write whole map into file in binary form
			// all members which are going to serialized must implement serialisable i/f ie
			// here integer as key and corebanking as value

			System.out.println("data inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
