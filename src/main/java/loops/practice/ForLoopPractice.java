package loops.practice;

import java.util.ArrayList;
import java.util.List;


public class ForLoopPractice {

	public void loopArray() {
		String[] strArray = new String[] { "A", "B", "C" };

		// solution 1
		for (String str : strArray) {
			System.out.println(str);
		}

		// solution 2
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	}


	public void loopList() {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");

		// solution 1
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// solution 2
		for (String str : list) {
			System.out.println(str);
		}

		// solution 3 jdk 8 :: Method Reference
		System.out.println("---------- solution 3 ----------------------");
		list.stream().forEach(System.out::println);

		// solution 4 jdk 8 Lambda expression
		System.out.println("----solution 4 ------");
		list.stream().forEach(str -> {
			System.out.println(str);
		});

	}

}