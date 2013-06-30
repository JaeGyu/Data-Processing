package section033;

import static org.junit.Assert.*;

import org.junit.Test;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		System.out.println(main.text(1));
		
	}

	private String text(int j) {
		int[] test = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int l = 0;
		int h = test.length - 1;

		while (l <= h) {
			int m = (l + h) / 2;
			if (j == test[m]) {
				return String.format("%d %d", j, m+1);
			} else {
				if (j < test[m]) {
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
		
		assertEquals("1 1", main.text(1));
	}
	
	@Test
	public void 이분검색테스트_맨오른쪽_원소일경우() throws Exception {
		Main main = new Main();
		assertEquals("10 10", main.text(10));
	}
	
	@Test
	public void 이분검색테스트_원소가_없는경우() throws Exception {
		Main main = new Main();
		assertEquals("16 NOT FOUND", main.text(16));
	}
	
}
