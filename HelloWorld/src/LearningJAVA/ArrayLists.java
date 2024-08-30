package LearningJAVA;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println(list.size());
		list.add(34);
		list.add(45);
		list.add(12);
		
		for(int item : list)
		{
			System.out.println(item);
			
		}
		System.out.println(list.size());
		ArrayList<ArrayList<Integer>> Arraylists = new ArrayList<ArrayList<Integer>>();
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++)
		{
			Arraylists.add(new ArrayList<Integer>());
		}
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3;i++)
			{
				Arraylists.get(i).add(input.nextInt());				
			}
		}
		input.close();
		System.out.println(Arraylists);
	}

}
