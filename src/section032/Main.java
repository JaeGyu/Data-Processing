package section032;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.text();
	}

	private void text() {
		int[][] test1 = { { 0, 56, 78, 90, 0 }, { 0, 80, 90, 80, 0 } };
		int[] kuk = test1[0];
		int[] mat = test1[1];
		int[] hap = new int[kuk.length];

		for (int i = 0; i < kuk.length; i++) {
			hap[i] = kuk[i] + mat[i];
		}

		for (int i = 0; i < kuk.length; i++) {
			if (hap[i] != 0) {
				int r = 1;
				for (int j = 0; j < kuk.length; j++) {
					if (hap[i] > hap[j]) {
						r++;
					}
				}
				System.out.printf("i : %d kuk(%d), mat(%d), hap(%d), %d", i,
						kuk[i], mat[i], hap[i], r);
				System.out.println();
			} else {
				continue;
			}
		}

	}
}
