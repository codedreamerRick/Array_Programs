package ARRAY2D;

public class Opposite_Diagonal_Sum {

public static void main(String[] args) {
		
		int [][] arr = {{1,2,3},{4,15,6},{7,8,9}};
		int sum = 0;
		int j = arr.length-1;
		for (int i = 0; i < arr.length; i++) 
		{
			sum += arr[i][j--];
		}
		System.out.println(sum);
	}
}
