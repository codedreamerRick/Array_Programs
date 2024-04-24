package ARRAY2D;

public class Overlaping {

	public static void main(String[] args) {
		int [][] arr = {{1,2},{3,3},{4,9},{11,15},{13,20}};
		overlapArray(arr);
	}
	
	static void overlapArray(int [][] arr)
	{
		int [][] res = new int [arr.length][arr[0].length];
		res[0] = arr[0];
		int index = 0;
		for (int i = 1; i < arr.length; i++)
		{
			int [] first = res[index];
			int [] second = arr[i];
			if(first[1] >= second[0])
			{
				first[1] = second[1];
			}
			else
			{
				res[++index] = arr[i];
			}
		}
		for (int i = 0; i <= index; i++) 
		{
			for (int j = 0; j < res[0].length; j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}
