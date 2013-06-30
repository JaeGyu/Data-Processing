package section040;

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
			for(int j=i;j>=0;j--){
				k++;
				a[i][j] = k;
			}
		}
		return a;
	}
	
	@Test
	public void testName() throws Exception {
		int[][] expecteds = { {  1,  0,   0,   0,   0 }, 
							  {  3,  2,   0,   0,   0 },
							  {  6,  5,   4,   0,   0 }, 
							  { 10,  9,   8,   7,   0 },
							  { 15, 14,  13,  12,  11 } };

		assertArrayEquals(expecteds, text());
	}
}
