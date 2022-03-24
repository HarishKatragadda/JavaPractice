package core.java;

import org.junit.Test;

public class Declarations {

	@Test
	public void declaration() {
		// primitives
		int i = 10;
		float f = 1.23f;
		double d = 2.34;
		char c = 'a';
		long l = 20;

		// wrapper classes
		Integer i1 = 10;
		Float f1 = 3.45f;
		Double d1 = 2.45;
		Character c1 = 'b';
		Long l1 = 30L;

		// Other declarations
		String s = "ABC";
		String s1 = new String("DEF");
		String[] s3 = new String[5]; // string array declaration
		s3[0] = "XYZ"; // string intializing 0 index

		// Primitive int Array
		int[] i2 = new int[6];
		i2[0] = 1;
		i2[1] = 2;
		i2[2] = 3;
		i2[5] = 6;
		System.out.println("K");
	}

}
