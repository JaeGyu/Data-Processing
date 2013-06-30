package section044;

import static org.junit.Assert.*;

import org.junit.Test;

import utils.Utils;

public class Main {
	@Test
	public void testName() throws Exception {
		int[][] expecteds = { {   1,   2,    3,    4,    5 }, 
							  {   0,   6,    7,    8,    0 },
							  {   0,   0,    9,    0,    0 }, 
							  {   0,  10,   11,   12,    0 },
							  {  13,  14,   15,   16,   17 } };

		assertArrayEquals(expecteds, text());
		Utils.printArr(text());
	}

	private int[][] text() {
		int[][] a = new int[5][5];
		int k=0;
		int l= a.length+1;
		int m = (a.length/2)+1;
		for(int i=0;i<m;i++){
			l--;
			for(int j=i;j<l;j++){
				k++;
				a[i][j] = k;
			}
		}
		for(int i=m;i<a.length;i++){
			l--;
			for(int j=l-1;j<=i;j++){
				k++;
				a[i][j] = k;
			}
		}
		
		return a;
	}
}
