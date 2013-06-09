package section001;

public class Main {
	public static void main(String[] args) {
		int i=0;
		int j=0;
		
		do{
			i++;
			j=j+i;
		}while(i<100);
		
		System.out.println("i: "+i+" j: "+j);
	}
}
