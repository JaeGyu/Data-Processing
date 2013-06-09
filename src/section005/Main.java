package section005;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();

		main.text();
		main.mine();
	}

	private void text() {
		int i = -1;
		int j = 0;

		do {
			i=i+2;
			j=j+i;
		} while (i < 99);
		System.out.println(j);
	}

	private void mine() {
		int result = 0;

		for (int i = 1; i <= 99; i = i + 2) {
			result = result + i;
		}

		System.out.println(result);
	}
}
