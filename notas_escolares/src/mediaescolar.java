import java.util.Locale;
import java.util.Scanner;

import util.subjects;
import util.Calc;

public class mediaescolar {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calc grade = new Calc();
		int resp;
		char resp1;
		
		System.out.println("         SISTEMA DE MÉDIA ESCOLAR          ");
		System.out.println("Digite suas notas, de acordo com os bimestres!");
		
		do {

			System.out.println("Qual matéria você quer calcular a nota?");
			System.out.println("[1] Português");
			System.out.println("[2] Matemática");
			System.out.println("[3] Química");
			System.out.println("[4] Física");
			System.out.println("[5] Biologia");
			System.out.println("[6] Geografia");
			System.out.println("[7] História");
			System.out.println("[8] Filosofia");
			System.out.println("[9] Sociologia");
			System.out.println("[10] Inglês");
			
			resp = sc.nextInt();
			System.out.println("Certo!");
			
			System.out.println("Digite suas notas:");
			grade.n1 = sc.nextDouble();
			grade.n2 = sc.nextDouble();
			grade.n3 = sc.nextDouble();
			grade.n4 = sc.nextDouble();
			System.out.println();	
			System.out.printf("Sua média em %s é: %.2f%n", subjects.getSubject(resp) , Calc.Media(grade.n1, grade.n2, grade.n3, grade.n4));
		
			if (Calc.Media(grade.n1, grade.n2, grade.n3, grade.n4) <= 6) {
				System.out.printf("Falta exatamente %.2f pontos para você passar!%n", Calc.qf(grade.n1, grade.n2, grade.n3, grade.n4));
			}
		
			System.out.println("Quer continuar? [y/n]");
			resp1 = sc.next().charAt(0);
			 
		} while ( resp1 == 'y');
		
		System.out.println("Sessão Encerrada! (Atenção! Suas notas somem após sair então anote!)");
		
		sc.close();
	}
}
