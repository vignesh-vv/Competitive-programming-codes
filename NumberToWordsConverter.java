package pkg;


public class NumberToWordsConverter {

	public static final String[] units = { "", "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };

	public static final String[] tens = { 
			"", 		// 0
			"",		// 1
			"Twenty", 	// 2
			"Thirty", 	// 3
			"Forty", 	// 4
			"Fifty", 	// 5
			"Sixty", 	// 6
			"Seventy",	// 7
			"Eighty", 	// 8
			"Ninety" 	// 9
	};

	public static String convert(final int n) {
		if (n == 0) {
			return "Zero";
		}

		if (n < 20) {
			return units[n];
		}

		if (n < 100) {
			return tens[n / 10] + " " + units[n % 10];
		}

		if (n < 1000) {
			return units[n / 100] + " Hundred" + " " +convert(n % 100);
		}

		if (n < 100000) {
			return convert(n / 1000) + " Thousand" + " " + convert(n % 1000);
		}

		return convert(n / 10000000) + " Crore" + convert(n % 10000000);
		
	}

	public static void main(final String[] args) {

		int n;

		n = 20;
		System.out.println(convert(n));

		n = 16;
		System.out.println(convert(n));

		n = 50;
		System.out.println(convert(n));
		
		n = 78;
		System.out.println(convert(n));
		
		n = 456;
		System.out.println(convert(n));
		
		n = 1000;
		System.out.println(convert(n));
		
		n = 99999;
		System.out.println(convert(n));
		
		n = 199099;
		System.out.println(convert(n));
		
	}
}