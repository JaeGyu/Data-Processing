package section039;

import static org.junit.Assert.*;

import org.junit.Test;

import utils.Utils;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		int[][] temp = main.text();
		
		Utils.printArr(temp);
	}

	private int[][] text() {
		int[][] a = new int[5][5];
		int k=0;
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				k++;
				a[j][i] = k;
			}
		}
		
		return a;		
		
	}
	
	@Test
	public void testName() throws Exception {
		int[][] expecteds = { {  1,  6,  11,  16,  21 }, 
	                          {  2,  7,  12,  17,  22 },
	                          {  3,  8,  13,  18,  23 }, 
	                          {  4,  9,  14,  19,  24 },
	                          {  5, 10,  15,  20,  25 } };

assertArrayEquals(expecteds, text());
		
	}
}
