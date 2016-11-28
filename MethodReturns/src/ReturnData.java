public class ReturnData {

	private static int incrementNumber (int n)
	{
		n++;
		return n;
	}
	
	private static String addedStrings (String s1, String s2)
	{
		String retString = s1 + " " + s2;
		return retString;
	}
	
	public static void main(String[] args) {
				int num = 1;
				System.out.println("Initialise number num to: " + num);
				
				num = incrementNumber(num);
				
				System.out.println("Incremented number num: " + num);
				
				String str1, str2;
				str1 = "Hello";
				str2 = "World";
				System.out.println(addedStrings(str1, str2));
	}
}

