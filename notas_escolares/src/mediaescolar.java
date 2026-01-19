import java.util.Locale;
import java.util.Scanner;

import util.Calc;

public class mediaescolar {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calc grade = new Calc();

		System.out.println("         SISTEMA DE MÉDIA ESCOLAR          ");
		System.out.println("Digite suas notas, de acordo com os bimestres!");
		grade.n1 = sc.nextDouble();
		grade.n2 = sc.nextDouble();
		grade.n3 = sc.nextDouble();
		grade.n4 = sc.nextDouble();
		System.out.println();
		
		System.out.printf("Sua média escolar é: %.2f%n", Calc.Media(grade.n1, grade.n2, grade.n3, grade.n4));
		if (Calc.Media(grade.n1, grade.n2, grade.n3, grade.n4) <= 6) {
		System.out.printf("Falta exatamente %.2f pontos para você passar!", Calc.qf(grade.n1, grade.n2, grade.n3, grade.n4));
		
		}
		
		sc.close();
	}
}
