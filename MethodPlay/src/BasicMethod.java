
public class BasicMethod {

	public static void main(String[] args) {
		String single, multi1, multi2;
		single = multi1 = multi2 = "";
		
		StringPrinter printer = new StringPrinter();
		single = "Hello World";
		
		multi1 = single+"! ";
		multi2 = "Thanks for all the fish";
	
		printer.printSingle(single);
		printer.printMultiple(multi1, multi2);
	}
}
