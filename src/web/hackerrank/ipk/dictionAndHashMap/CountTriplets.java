package web.hackerrank.ipk.dictionAndHashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CountTriplets {

	public static void main(String[] args) {

		List<Long> arr = Arrays.asList(1L, 3L, 9L, 9L, 27L, 81L);
		long r = 3L;

		long ans = countTriplets(arr, r);
		System.out.println(String.valueOf(ans));

	}

	// Complete the countTriplets function below.
	static long countTriplets(List<Long> arr, long r) {
		HashMap<Long, Long> secondMap = new HashMap<Long, Long>();
		HashMap<Long, Long> thirdMap = new HashMap<Long, Long>();

		Long cnt = 0L;
		for (Long el : arr) {

			if (thirdMap.containsKey(el)) {
				cnt += thirdMap.get(el);
			}

			// ���� element�� � ������Ʈ�� 3��° ���� �� �ִ�.
			if (secondMap.containsKey(el)) {
				thirdMap.put(el * r, thirdMap.getOrDefault(el * r, 0L) + secondMap.get(el));
			}

			// ���� element�� ���� element�� ���ų� �߰� ���̴�.
			secondMap.put(el * r, secondMap.getOrDefault(el * r, 0L) + 1L);
		}

		return cnt;
	}

}
