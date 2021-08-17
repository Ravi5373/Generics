package Day13_Genrics;

public class GenricsUc1 {
	public static void main(String[] args) {

		Integer[] arrI = { 95, 19, 13, 84, 61 };
		Double[] arrD = { 1.4, 2.5, 6.9 };
		Character[] arrC = { 'H', 'E', 'L', 'L', 'O' };
		String[] arrS = { "Hello Ravi" };

		System.out.println("print integer Array");
		toPrint(arrI);
		System.out.println("print double Array");
		toPrint(arrD);
		System.out.println("print charater Array");
		toPrint(arrC);
		System.out.println("print string Array");
		toPrint(arrS);
	}

	private static <E> void toPrint(E[] inputarray) {
		for (int i = 0; i < inputarray.length; i++) {
			System.out.println(inputarray[i]);
		}
		System.out.println();
	}

}
