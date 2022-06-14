
public class Demo {
	public String hypens = "-";

	public static void main(String[] args) {
		
		Demo demo = new Demo();

		demo.greet(new Printer() {
			@Override
			public void print(String message) {
				System.out.println(message);

			}
		});
		
	
//		this defination is called anonymous inner class.
//		with anonymous inner class we can have differnt definations each time you call

		classicPrinter((String message) -> {
			int number = 3;

			System.out.println(message + number * number);
		},0);
		// this lamda expression which will reduce the boiler plate coding which is
		// there in anonymous inner class
//         if we have only one line in the print method then we can reduce this to single line 
		classicPrinter(message -> System.out.println(message), 0);// 
//		the main use of lamda expression is we dont want tocreate a class and then extend and use it. -> is called lamda operator
//      we use () if we have multiple parameters or if we dont have any parameter.
		
//		We can also define a lamda expression and we can use it where ever required.
		Printer printer = message -> System.out.println("message"+ message);		
		classicPrinter(printer,0);
//		in anonymous class we can have instance fields but in lamda expression we cannot have instance fields
//		in lamda expression this represents the fields of the object where we are invokeing it
		
//		method refernce 
		demo.greet(System.out::println);

		demo.greet( System.out::println);
		classicPrinter(System.out::println,1);
		// this is how we use method refernce
	
	}

	public  void greet(Printer printer) {
//		printer = message-> System.out.println(this.hypens+"hello world"+message);
		printer.print("messsage");
	}

	public static void classicPrinter(Printer printer,int number) {
		System.out.println("classic printer");
		printer.print("Hello world");
	}
}
