package tester;

import static utils.UtilityClass.populatedmap;
import static utils.IoUtils.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import libraryManagement.core.com.Library;

public class LibraryTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Map<String, Library> map = new HashMap<>(populatedmap());
			TreeMap<String, Library> sortedMap = new TreeMap<>(new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					return o1.compareTo(o2);
				}

			}); // giving compare method to TreeMap by anonymous class
			sortedMap.putAll(map); // populate treemap

			try {


				System.out.println("Enter file name :: ");
				String file = sc.nextLine();

				/* WriteInFile(file, map); */
				map = ReadFile(file);
				for (Library list : map.values()) {
					System.out.println(list);
				}
				WriteInFile(file, map);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
