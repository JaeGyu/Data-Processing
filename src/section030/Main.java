package section030;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.text();
	}

	private void text() {
		int[] test1 = {1,2,3,4,7,6,5,8,9,7};
		int[] test2 = {10,9,8,7,6,5,4,3,2,1}; 
		int[] a = test1;		
		
		for(int i=1;i<a.length;i++){
			int key = a[i];
			int x=i;
			for(int k=i-1;k>=0;k--){
				if(a[k]>key){
					a[k+1] = a[k];
					x=k;
				}
				a[x] = key;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
