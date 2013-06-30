package section051;

import static org.junit.Assert.*;

import org.junit.Test;

import utils.Utils;

public class Main {
	@Test
	public void testName() throws Exception {
		int[][] expecteds = { {   1,   2,    4,    7,    11 }, 
				              {   3,   5,    8,   12,    16 },
				              {   6,   9,   13,   17,    20 }, 
				              {  10,  14,   18,   21,    23 },
				              {  15,  19,   22,   24,    25 } };

		assertArrayEquals(expecteds, text());
		Utils.printArr(text());
	}

	private int[][] text() {
		int[][] a = new int[5][5];
		int l=0;
		for(int i=0;i<10;i++){
			for(int j=0;j<5;j++){
				int k = i-j;
				if(k>=0){
					if(k<5){
						l++;
						a[j][k]=l;
					}
				}
			}
		}
		return a;
	}
}
