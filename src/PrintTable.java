
public class PrintTable {
	public static void main(String[] args) {
		System.out.println("a     a*a    a*a*a");
		for(int i = 1; i < 5; i++) {
			System.out.println(i + "     " + i*i + "     " + i*i*i);	
		}
	}
}
