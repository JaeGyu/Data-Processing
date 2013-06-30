package utils;

public class Utils {
	public static void printArr(int[][] temp) {
		for(int[] k:temp){
			for(int t:k){
				System.out.printf("\t%4d", t);
			}
			System.out.println();
		}
	}
}
