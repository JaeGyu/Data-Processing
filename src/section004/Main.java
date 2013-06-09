package section004;

public class Main {
	public static void main(String[] args) {
		float i = 0f;
		float j = 0f;

		do {
			i++;
			if(((int)i)/2 == i/2){
				j=j+(i/(i+1));
			}else{
				j=j-(i/(i+1));
			}
		} while (i < 99);
		
		System.out.println(j);
	}
}
