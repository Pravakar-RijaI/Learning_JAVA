package LearningJAVA;
import java.util.Arrays;
import java.util.Scanner;
public class Multidim {

	public static void main(String[] args) {
		int[][] matrix = new int[3][2];
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < matrix.length; i++)
		{
			for(int y = 0; y < matrix[i].length; y++)
			{
				matrix[i][y]=input.nextInt();
			}
		}
		input.close();
		for(int i = 0; i < matrix.length;i++)
		{
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

}
