package LEETCODE;

public class Search_Insert_Position {

	public static void main(String[] args) 
	{
		int nums [] = {3,6,7,8,10};
		int target  = 5;
		for (int i = 0; i < nums.length; i++) 
		{
			if(nums[i] == target)
			{
				System.out.println(i);
				break;
			}
			else if(nums[i] > target)
			{
					System.out.println(i);
					break;
			}
			else if(nums[i] == target - 1)
			{
				System.out.println(i + 1);
				break;
			}
		}
	}
}
