package puzzles;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author hegdevishwa This class provides utility to sort Maps
 *
 */
public class MapSorter {

	/**
	 * This method sorts map based on value
	 * 
	 * @param unsortMap
	 * @return sortedMap
	 * 
	 */
	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> unsortMap) {

		List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(unsortMap.entrySet());

		Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));// Lambda
																					// expression

		Map<K, V> sortedMap = new LinkedHashMap<K, V>();
		for (Map.Entry<K, V> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}

}
