package section027;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
//		main.text();
		main.text2();
	}

	private void text2() {
		int[] data = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<data.length;i++){
			System.out.printf("data[%d] : ",i+1);
			data[i] = sc.nextInt();
		}
		
		for(int i=0;i<data.length-1;i++){
			for(int j=i+1;j<data.length;j++){
				if(data[i]>data[j]){
					int k = data[i];
					data[i] = data[j];
					data[j] = k;
				}
			}
		}
		
		for(int result : data){
			System.out.print(result+" ");
		}
		System.out.println();
	}

	private void text() {
		int[] array = new int[10];
		int m=-1;
		Scanner sc = new Scanner(System.in);
		
		do{
			m++;
			System.out.printf("array[%d] : ",m+1);
			array[m] = sc.nextInt();
		}while(m<9);
		
		int i=-1;
		
		do{
			i++;
			int j=i;
			do{
				j++;
				if(array[i]>array[j]){
					int k = array[i];
					array[i] = array[j];
					array[j] = k;
				}
			}while(j<9);
		}while(i<8);
	
		for(int result : array){
			System.out.print(result+" ");
		}
		System.out.println();
	}
}
