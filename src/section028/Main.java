package section028;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.text();
	}

	private void text() {
		int[] data = new int[10];

		int n = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.printf("data[%d] : ",n+1);
			data[n] = sc.nextInt();
			n++;
		} while (n < 10);

		int i = 0;
		do {
			int j = 0;
			do {
				if (data[j] > data[j + 1]) {
					int k = data[j];
					data[j] = data[j+1];
					data[j+1] = k;
				}
				j++;
			} while (j < (9 - i));
			i++;
		} while (i < 9);

		for (int result : data) {
			System.out.print(result + " ");
		}
		System.out.println();
	}
}
