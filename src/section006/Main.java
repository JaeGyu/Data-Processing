package section006;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.text();
		main.mine();
	}

	private void text() {
		int i=0;
		int j=1;
		int k=1;
		do{
			i++;
			j=j+i;
			k=k+j;
		}while(i<19);
		System.out.println(k);
	}

	private void mine() {
		int result = 0;
		int inc = 1;
		
		for(int i=0;i<20;i++){
			inc=inc+i;
			result = result + inc;
		}
		System.out.println(result);
	}
}
