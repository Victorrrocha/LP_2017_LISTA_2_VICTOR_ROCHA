import java.util.*;

public class exec_b {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int RESTO = N - (2*(N/2));
		if(RESTO == 0)
		{
			System.out.printf("O valor %d é PAR\n", N);
		}
		else
		System.out.printf("O valor %d é IMPAR\n", N);
	}
}
