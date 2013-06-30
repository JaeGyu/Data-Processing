package section050;

import static org.junit.Assert.*;

import org.junit.Test;

import utils.Utils;

public class Main {
	@Test
	public void testName() throws Exception {
		int[][] expecteds = { {  1,  2,  3,  4, 5 }, 
				              { 16, 17, 18, 19, 6 },
				              { 15, 24, 25, 20, 7 }, 
				              { 14, 23, 22, 21, 8 }, 
				              { 13, 12, 11, 10, 9 } };

		assertArrayEquals(expecteds, text());
		Utils.printArr(text());
	}

	private int[][] text() {
		return null;
	}
}
