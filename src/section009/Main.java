package section009;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.text();
		main.mine();
	}

	private void text() {
		int i=0,j=0,k=0;
		do{
			i++;
			j=j+i;
			k=k+j;
		}while(i<20);
		System.out.println(k);
	}

	private void mine() {
		int j = 0;
		int k=0;
		for(int i=1;i<=20;i++){
			j=j+i;
			k=k+j;
		}
		System.out.println(k);
	}
}
