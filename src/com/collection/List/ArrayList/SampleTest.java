package com.collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SampleTest {

	public static void main(String[] args) {
		List<Integer> st = new ArrayList<>();
		System.out.println(st.size());
		st.add(56);
		st.add(45);
		st.add(67);
		st.add(76);
		st.add(95);
		st.add(07);

		System.out.println(st);

		System.out.println(st);
		// For Loop
		for (int i = 0; i < st.size(); i++) {
			System.out.println(st.get(i));
		}

		// For Each loop
		for (Integer num : st) {
			System.out.println("For Each loop " + num);
		}

		// While Loop
		int count = 0;
		while (st.size() > count) {
			System.out.println(st.get(count));
			count++;
			System.out.println("this is while loop");
		}

		// Iterator

		Iterator it = st.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());
		}

	}

}
