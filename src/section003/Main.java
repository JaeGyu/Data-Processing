package section003;

import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		
		long i = 0;
		BigDecimal j = new BigDecimal(1);

		do {
			i++;
			if (i % 2 == 0) {
				j=j.multiply(new BigDecimal(i));
			} else {
				j = j.multiply(new BigDecimal(-1 * i));
			}
		} while (i < 100);
		
		System.out.println(j);
	}
}
