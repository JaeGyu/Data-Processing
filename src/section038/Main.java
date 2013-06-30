package section038;

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
			for(int j=4-i;j<a[0].length;j++){
				k++;
				a[i][j] = k;
			}
		}
		return a;
	}
	
	@Test
	public void testName() throws Exception {
		int[][] expecteds = { {  0,  0,   0,   0,   1 }, 
				              {  0,  0,   0,   2,   3 },
				              {  0,  0,   4,   5,   6 }, 
				              {  0,  7,   8,  9,   10 },
				              { 11, 12,  13,  14,  15 } };

		assertArrayEquals(expecteds, text());
	}
}
