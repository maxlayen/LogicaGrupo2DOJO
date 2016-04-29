/**
Maxwell - 1610393
Ísis - 1610388
Vinícius - 1610392
Lucas Oliveira - 1610390
Nicolas - 1610383
Francisco Olímpio 
*/
// Questao 1
public class ListaDeExercicios {

	// TODO Auto-generated method stub

	public String nome;
	public int matricula;
	public char respostas;
	public String dataDeAplicacao;
	public int NumeroAcertos;

}

	// Questão 2
	public static void ImprimirMenu() {
		System.out.println("------------------------------");
		System.out.println("Lógica de programação - Opções");
		System.out.println("------------------------------");
		System.out.println("Digite 1 para inserir as respostas");
		System.out.println("Digite 2 para informar a notas de cada atividade");
		System.out.println("Digite 3 para mostrar as notas de cada atividade");
		System.out.println("Digite 4 para imprimir o resumo das atividades");
		System.out.println("Digite 5 para imprimir os dados dos alunos que obtiveram a maior média geral");
		System.out.println("Digite 0 para sair do programa");
		int opcao = scann.nextInt();
	}

	// Questão 3.A
	static char[] receberQuestoes() {
		char[] gabarito = new char[10];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < gabarito.length; i++) {
			System.out.printf("Qual a resposta correta da questão %d? \n", i + 1);
			gabarito[i] = scanner.next().toUpperCase().charAt(0);
		}
		return gabarito;
	}

	// Questão 3.B
	static double atribuirNota(char[] gabarito, ListaDeExercicios lista) {
		double nota = 0;
		for (int i = 0; i < gabarito.length; i++) {
			if (lista.resposta[i] == gabarito[i]) {
				nota = nota + 1;
			}
		}
		lista.acertos = nota;
		return nota;
	}

	// QUESTÃO 4 QUATRO FOUR CUATRO COATRO COENTRO YON
	public static void Lista(ListaDeExercicio[] lista) {

	}

	// QUESTÃO 5
	static void imprimirAlunosNotasAcimaDe8(ListaDeExercicio[] lista) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[0].nota1 > 8 || lista[1].nota2 > 8 || lista[2].nota3 > 8 || lista[3].nota4 > 8) {
				System.out.printf("Aluno:%s\tNota da lista acima da média: %1f\n\tMédia Geral: %.1f\n", lista[i].aluno,
						lista[i].nota, lista[i].media);
			}
		}

	}

}

	// QUESTAO 6
	public static void main(String[] args) {
		String Nome[] = { "Tony ", "Rhodes", "Natasha", "Nick " };
		int[] Matricula = { 1012667, 1012668, 1012670, 1013601 };
		Double[] Lista01 = { 8.0, 6.0, 8.0, 7.0 };
		Double[] Lista02 = { 10.0, 7.0, 8.0, 9.0 };
		Double[] Lista03 = { 8.0, 8.0, 9.0, 7.0 };
		Double[] Lista04 = { 10.0, 8.0, 9.0, 6.0 };

		imprimir(Nome, Matricula, Lista01, Lista02, Lista03, Lista04);

	}

	static void imprimir(String[] Nome, int[] Matricula, Double[] lista01, Double[] lista02, Double[] lista03,
			Double[] lista04) {
		double media[] = new double[4];

		for (int i = 0; i < lista04.length; i++) {

			media[i] = (lista01[i] + lista02[i] + lista03[i] + lista04[i]) / 4;

		}

		System.out.println("Nome\t\t Matricula\t Lista 01\t Lista 02\t Lista 03\t Lista 04\t Media\t");

		for (int i = 0; i < media.length; i++) {
			System.out.printf("%s\t\t%d\t\t %1.1f\t\t %1.1f\t\t %1.1f\t\t %1.1f\t\t %1.1f \n", Nome[i], Matricula[i],
					lista01[i], lista02[i], lista03[i], lista04[i], media[i]);
		}

	}
}
