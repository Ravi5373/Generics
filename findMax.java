package Day13_Genrics;

public class findMax {

	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x; // assume x is intially maximum

		if (y.compareTo(x) > 0)

			max = y; // // y is the largest
		if (z.compareTo(max) > 0)

			max = z; // // z is the largest

		return max; // returns the largest object

	} // end method maximum

	public static void main(String[] args) {

		System.out.println(maximum(23, 24, 34));
		System.out.println(maximum(2.2f, 2.4f, 3.4f));
		System.out.println(maximum("Apple", "Banana", "Mango"));
	}

}
