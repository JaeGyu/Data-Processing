package section008;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.text();
		main.mine();
	}

	private void text() {
		int a = 1, b = 1;
		int hap = 2, cnt = 2;
		int c;

		while (true) {
			c = a + b;
			hap = hap + c;
			cnt = cnt + 1;

			if (cnt < 20) {
				a = b;
				b = c;
			} else {
				System.out.println(hap);
				return;
			}
		}
	}

	private void mine() {
		int c;
		int a = 1;
		int b = 1;
		int hap = 2;
		
		for (int i = 3; i <= 20; i++) {
			c = a + b;
			a = b;
			b = c;
			hap = hap + c;
		}
		System.out.println(hap);
	}
}
