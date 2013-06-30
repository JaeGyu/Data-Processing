package section053;

import static org.junit.Assert.*;

import org.junit.Test;

import utils.Utils;

public class Main {
	@Test
	public void testName() throws Exception {
		int[][] expecteds = { {   17,   24,    1,    8,    15 }, 
	                          {   23,    5,    7,   14,    16 },
	                          {    4,    6,   13,   20,    22 }, 
	                          {   10,   12,   19,   21,     3 },
	                          {   11,   18,   25,    2,     9 } };

		assertArrayEquals(expecteds, text());
		Utils.printArr(text());
	}

	private int[][] text() {
		int[][] a = new int[5][5];
		int i = 0;
		int j = 5/2;
		
		for(int k=1;k<=25;k++){
			a[i][j] = k;
			if(k%5 == 0){
				i++;
			}else{
				i--;
				j++;
				if(i<0){
					i=4;
				}
				if(j>4){
					j=0;
				}
			}
		}
		return a;
	}
}
