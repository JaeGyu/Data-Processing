package section043;

import static org.junit.Assert.*;

import org.junit.Test;

import utils.Utils;

public class Main {
	@Test
	public void testName() throws Exception {
		int[][] expecteds = { {  0,   0,    1,    0,    0 }, 
	             	   		 {   0 ,  2,    3,    4,    0 },
	             	   		 {   5,   6,    7,    8,    9 }, 
	                         {   0,  10,   11,   12,    0 },
	                         {   0,   0,   13,    0,    0 } };

		assertArrayEquals(expecteds, text());
		Utils.printArr(text());
	}

	private int[][] text() {
		int[][] a = new int[5][5];
		int k=0;
		int s=2,e=2;
		for(int i=0;i<a.length;i++){
			for(int j=s;j<=e;j++){
				k++;
				a[i][j]=k;
			}
			if(i>=2){
				s++;
				e--;
			}else{
				s--;
				e++;
			}
		}
		return a;
	}
}
