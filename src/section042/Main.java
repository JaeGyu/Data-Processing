package section042;

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
		int k =0;
		int l=0;
		int m = 4;
		int n=1;
		for(int i=0;i<a.length;i++){
			if(n>0){
				for(int j=l;j<=m;j++){
					k++;
					a[i][j] = k;
				}
			}else{
				for(int j=l;j>=0;j--){
					k++;
					a[i][j] = k;
				}
			}
			int p = l;
			l = m;
			m = p;
			n=n*(-1);
		}
			
		return a;
	}
	
	@Test
	public void testName() throws Exception {
		int[][] expecteds = { {  1,   2,    3,    4,    5 }, 
				             {  10,   9,    8,    7,    6 },
				             {  11,  12,   13,   14,   15 }, 
				             {  20,  19,   18,   17,   16 },
				             {  21,  22,   23,   24,   25 } };

		assertArrayEquals(expecteds, text());
		
	}
}
