package question1;

public class Question1 {

	public static void main(String[] args) {
		int n = 7;
		// Printing INEURON using pattern programming logic
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == ((n - 1) / 2) || i == (n - 1))// Conditions for printing I
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");// Providing space between I and N
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j || j == (n - 1)) //Conditions for printing N
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");// Providing space between N and E
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == ((n - 1) / 2) || i == (n - 1) || j == 0) //Conditions for printing E
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");// Providing space between E and U
			for (int j = 0; j < n; j++) {
				if (j == 0 && i != (n - 1) || i == (n - 1) && j != 0 && j != (n - 1) || j == (n - 1) && i != (n - 1))//Conditions for printing U 
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");// Providing space between U and R
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == 0 && j != ((n - 1)) || j == ((n - 1)) && i < ((n - 1) / 2) && i != 0 && i != (n - 1)
						|| i == (n - 1) / 2 && j != ((n - 1)) || i == j && i > ((n - 1) / 2)) //Conditions for printing R
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");// Providing space between R and O
			for (int j = 0; j < n; j++) {
				if (i == 0 && j != 0 && j != (n - 1) || j == 0 && i != 0 && i != (n - 1)
						|| i == (n - 1) && j != 0 && j != (n - 1) || j == (n - 1) && i != 0 && i != (n - 1)) //Conditions for printing O
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");// Providing space between I and N
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j || j == (n - 1)) //Conditions for printing N
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();// Moving the cursor to he next row
		}

	}

}
