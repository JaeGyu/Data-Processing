package section036;

import static org.junit.Assert.*;

import org.junit.Test;

import utils.Utils;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();

		int [][] temp = main.text();
		
		Utils.printArr(temp);
	}

	

	private int[][] text() {
		
		int[][] a = new int[5][5];
		int k=0;
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				k++;
				a[i][j] = k;
			}
		}
		
		return a;
	}

	@Test
	public void test() throws Exception {
		int[][] expecteds = { {  1,  2,  3,  4,  5 }, 
				              {  6,  7,  8,  9, 10 },
				              { 11, 12, 13, 14, 15 }, 
				              { 16, 17, 18, 19, 20 },
				              { 21, 22, 23, 24, 25 } };
		
		assertArrayEquals(expecteds, text());
	}
}
