
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greet(new Printer() {
			
			@Override
			public void print(String message) {
				System.out.println(message);
				
			}
		} );

	}

	public static void  greet(Printer printer) {
		printer.print("Hello world");
	}
}
