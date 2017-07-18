import java.util.*;

public class exec_a {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double N1 = scan.nextDouble();
		double N2 = scan.nextDouble();
		double N3 = scan.nextDouble();
		double N4 = scan.nextDouble();
		double MD = (N1+N2+N3+N4)/4;
		if(MD >= 7)
		{
			System.out.printf("Aluno Aprovado: %.1f\n", MD);
		}
		else
		{
			double EX = scan.nextDouble();
			double NOVA_MD = (MD + EX)/2;
			if(NOVA_MD >= 5)
			{
				System.out.printf("Aluno Aprovado em Exame: %.1f\n", NOVA_MD);
			}
			else
				System.out.printf("Aluno Reprovado: %.1f\n", NOVA_MD);
		}
	}
}

