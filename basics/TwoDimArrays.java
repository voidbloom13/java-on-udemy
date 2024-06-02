
import java.util.Arrays;

public class TwoDimArrays {
	public static void main(String[] args) {
		int[][] grades = {
			{72, 74, 78, 71},
			{65, 62, 66, 60},
			{98, 97, 94, 100},
		};

		System.out.println(Arrays.toString(grades[0]));
		System.out.println(Arrays.toString(grades[1]));
		System.out.println(Arrays.toString(grades[2]));

		grades[1][2] = 69;

		System.out.println(Arrays.toString(grades[0]));
		System.out.println(Arrays.toString(grades[1]));
		System.out.println(Arrays.toString(grades[2]));
		
			for (int[] person : grades) {
				for (int grade : person) {
					System.out.print(grade + " ");
				}
				System.out.print("\n");
			}
	}
}
