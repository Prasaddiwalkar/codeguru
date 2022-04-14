package code.codeguru.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmallestNegativeBalance {

	public List<String> smallestNegativeBalance(List<ArrayList<String>> debts) {

		Map<String, Integer> smallestNegativeMap = new HashMap<String, Integer>();

		debts.forEach((debt) -> {
			smallestNegativeMap.put(debt.get(1),
					smallestNegativeMap.getOrDefault(debt.get(1), 0) + Integer.parseInt(debt.get(2)));

			smallestNegativeMap.put(debt.get(0),
					smallestNegativeMap.getOrDefault(debt.get(0), 0) - Integer.parseInt(debt.get(2)));
		});

		// get minimum
		int min = Collections.min(smallestNegativeMap.values());

		List<String> output = new ArrayList<String>();

		if (Collections.frequency(smallestNegativeMap.values(), min) <= 0) {
			output.add("Nobody has a negative balance");
			return output;
		}

		smallestNegativeMap.forEach((key, value) -> {
			if (value == min) {
				output.add(key);
			}
		});

		Collections.sort(output);
		return output;
	}
}
