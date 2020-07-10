package web.hackerrank.ipk.dictionAndHashMap;

import java.util.HashMap;

public class RansomNote {

	public static void main(String[] args) {

		String magazine = "give one me grand today night";
		String note = "give one grand today";

		String[] magazineArr = magazine.split(" ");
		String[] noteArr = note.split(" ");

		checkMagazine(magazineArr, noteArr);

	}

	static void checkMagazine(String[] magazine, String[] note) {
		// 1. noteArr to Hash Map
		HashMap<String, Integer> noteMap = new HashMap<String, Integer>();

		for (String el : note) {
			Integer value = noteMap.get(el);
			if (value == null) {
				noteMap.put(el, 1);
			} else {
				noteMap.put(el, value + 1);
			}
		}

		// 2. magazine for~ & hash check - 1
		for (String el : magazine) {
			Integer value = noteMap.get(el);
			if (value != null) {
				noteMap.put(el, value - 1);
			}
		}

		// 3. note Hash Map count 0
		boolean answer = true;
		for (Integer value : noteMap.values()) {
			if (value > 0) {
				answer = false;
				break;
			}
		}

		if (answer) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
