import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		
		int i=0,j=0;
		int r1=0,c1=0;
		int r2=0,c2=0;
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("How many rows do you want in the matrix 1:");
		r1=sc.nextInt();
		int mat1 [][]=new int [r1][];
		
		for(i=0;i<mat1.length;i++)
		{
			System.out.println("Enter column for "+(i+1)+" row:");
			c1=sc.nextInt();
			mat1[i]=new int [c1];
			
		}
		
		System.out.println("How many rows do you want in the matrix 2:");
		r2=sc.nextInt();
		int mat2 [][]=new int [r2][];
		
		for(i=0;i<mat2.length;i++)
		{
			System.out.println("Enter column for"+(i+1)+" row:");
			c2=sc.nextInt();
			mat2[i]=new int [c2];
			
		}
		
		boolean b=true;
		if(mat1.length==mat2.length)
		{
			for(i=0;i<mat1.length;i++)
			{
				if(mat1[i].length!=mat2[i].length)
				{
					b=false;
					break;
				}
			}
		}
		
		
		
		if(b==true)
		{
			System.out.println("Matrix 1 is equal to matrix 2");
			
			System.out.println("Enter elements in matrix 1");
			for(i=0;i<mat1.length;i++)
			{
				for(j=0;j<mat1[i].length;j++)
				{
					mat1 [i][j]=sc.nextInt();
				}
			}
			
			System.out.println("Matrix 1 is:");
			for(i=0;i<mat1.length;i++)
			{
				for(j=0;j<mat1[i].length;j++)
				{
					System.out.print(mat1 [i][j]+"\t");
				}
				System.out.println();
			}
			
			System.out.println("Enter elements in matrix 2");
			for(i=0;i<mat2.length;i++)
			{
				for(j=0;j<mat2[i].length;j++)
				{
					mat2 [i][j]=sc.nextInt();
				}
			}
			
			System.out.println("Matrix 2 is:");
			for(i=0;i<mat2.length;i++)
			{
				for(j=0;j<mat2[i].length;j++)
				{
					System.out.print(mat2 [i][j]+"\t");
				}
				System.out.println();
			}
	
		}
		else
		{
			System.out.println("Both matrices are unequal.");
		}
		
		
		int mat3[][]=new int [i][];
		
		
		
		

	}

}
