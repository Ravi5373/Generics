package Day13_Genrics;

public class Genrics {
	
	
	public static void toPrint(Integer[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			
			System.out.println(inputArray[i]);
		}
		
	}

	public static void toPrint(Double[] inputDouble) {
		for (double i = 0; i < inputDouble.length; i++) {
			System.out.println(inputDouble[(int) i]);

		}
	}
	
	public static void toPrint(Character[] inputCharacter) {
		for(char i=0; i<inputCharacter.length;i++) {
			System.out.println(inputCharacter[(int) i]);

		}
	}

	public static void main(String[] args) {
		

		Integer[] Intarray = { 1, 2, 3, 4, 5 };
		 
		Double[] DoubleArray = { 1.2, 3.5, 6.6, 4.4 };
		Character[] CharaterArray = {'A','B','C'};
		
		 System.out.println("print integer Array");
		Genrics.toPrint(Intarray);
		System.out.println("print Double Array");
		Genrics.toPrint(DoubleArray);
		System.out.println("print Char Array");
		Genrics.toPrint(CharaterArray);
		

	}

}
