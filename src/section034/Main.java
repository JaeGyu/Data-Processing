package section034;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		System.out.println(main.text(9));
	}

	private String text(int j) {
		int[][] a = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
				{ 75, 68, 15, 27, 45, 78, 87, 95, 87, 55 } };

		int l = 0;
		int h = a[0].length - 1;

		while (l <= h) {
			int m = (l + h) / 2;
			if (j == a[0][m]) {
				return String.format("%d %d", j, a[1][m]);
			} else {
				if (j < a[0][m]) {
					h = m - 1;
				} else {
					l = m + 1;
				}
			}
		}
		return String.format("%d NOT FOUND", j);
	}
	
	@Test
	public void 이분검색테스트_맨왼쪽_원소일경우() throws Exception {
		Main main = new Main();
		
		assertEquals("1 75", main.text(1));
	}
	
	@Test
	public void 이분검색테스트_맨오른쪽_원소일경우() throws Exception {
		Main main = new Main();
		assertEquals("10 55", main.text(10));
	}
	
	@Test
	public void 이분검색테스트_원소가_없는경우() throws Exception {
		Main main = new Main();
		assertEquals("16 NOT FOUND", main.text(16));
	}
	
	@Test
	public void 이분검색테스트_원소가_중간에_있는경우() throws Exception {
		Main main = new Main();
		assertEquals("9 87", main.text(9));
	}
	
}
