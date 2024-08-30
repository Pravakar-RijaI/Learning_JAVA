package LearningJAVA;

public class leetcode2 {

	public static void main(String[] args) {
		//int[][] accounts1 = {{1,2,3},{3,2,1}};
		int[][] accounts2 = {{1,5},{7,3},{3,5}};
		int max = findMax(accounts2);
		System.out.println(max);
	}
	
	public static int findMax(int[][] accounts)
	{
		int max = accounts[0][0];
		int sum = 0;
		for(int i = 0; i < accounts.length; i++)
		{
			if(sum > max)
				max = sum;
			
			sum = 0;
			
			for(int j = 0; j < accounts[i].length; j++)
			{
				sum += accounts[i][j];
				
			}
		}
		
		return max;
	}

}
