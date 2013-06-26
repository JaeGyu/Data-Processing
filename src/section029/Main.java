package section029;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.text();
	}
	
	public void text(){
		int[] data = new int[10];

		int n = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.printf("data[%d] : ",n+1);
			data[n] = sc.nextInt();
			n++;
		} while (n < 10);
		
		int cnt = 0;
		
		for(int i=0;i<data.length-1;i++){
			int sw = 0;
			for(int j=0;j<data.length-i-1;j++){
				if(data[j]>data[j+1]){
					int k= data[j];
					data[j] = data[j+1];
					data[j+1] = k;
					cnt++;
					sw = 1;
				}
			}
			if(sw == 0){
				System.out.print("cnt : "+ cnt);
				for(int result : data){
					System.out.print(result + " ");
				}
				System.out.println();
				return ;
			}
		}
	}
}
