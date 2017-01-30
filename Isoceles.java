import java.util.Scanner;

class Isoceles
{
	public static void main(String[] args)
	{
		Scanner u_inp = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = u_inp.nextInt();

		for (int i = n-1; i >= 0; i--)
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print("\t");
			}
			for (int k = 0; k < 2*(n-i)-1; k++)
			{
				System.out.print("*\t");
			}
			System.out.println("");
		}
	}
}
