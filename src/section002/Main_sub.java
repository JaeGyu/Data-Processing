package section002;

public class Main_sub {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;

		while (true) {
			i++;
			j = j + i;
			if (i < 99) {
				i++;
				j = j - i;
			} else {
				System.out.println(j);
				return;
			}
		}
	}
}
