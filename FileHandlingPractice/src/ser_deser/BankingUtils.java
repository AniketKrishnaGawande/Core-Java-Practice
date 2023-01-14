package ser_deser;

import java.util.HashMap;
import java.util.Map;

public class BankingUtils {

	public static Map<Integer, CoreBanking> populateBank() {
		Map<Integer, CoreBanking> map = new HashMap<>();

		map.put(101, new CoreBanking(101, "Aniket", 10000));

		map.put(102, new CoreBanking(102, "Swanand", 15000));

		map.put(103, new CoreBanking(103, "Prajwal", 25000));

		map.put(104, new CoreBanking(104, "Saurav", 3000));

		return map;

	}

}
