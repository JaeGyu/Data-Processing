package section031;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.text();
	}

	private void text() {
		int[] test1 = { 70, 80, 60, 90, 70 };
		int[] jumsu = test1;
		int[] rank = new int[5];
		int n = 5;
		int i = 0;

		while (i < n) {
			rank[i] = 1;
			i++;
		}
		
		i=0;
		
		while(i<n){
			int j=0;
			
			while(j<n){
				if(jumsu[i]<jumsu[j]){
					rank[i]++;
				}
				j++;
			}
			i++;
		}
		System.out.println(Arrays.toString(jumsu));
		System.out.println(Arrays.toString(rank));
	}
}
