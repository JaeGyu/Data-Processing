package section002;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	private void solve() {
		int i=0;
		int j=0;
		int sw = 0;
		
		do{
			i++;
			if(sw == 0){
				j=j+i;
				sw=1;
			}else{
				j=j-i;
				sw=0;
			}
		}while(i<100);
		System.out.println(j);
	}
}
