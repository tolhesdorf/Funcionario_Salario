package funcionario.salario.projeto;

public class Main {

	public static void main(String[] args) {
		Funcionário Pablo = new Funcionário("Pablo Tolhesdorf", "Tecnologia e Informação", 3500, "01/03/2021", "12345987");
		
		System.out.println(Pablo);
		Pablo.CalcularGanhoAnual(0);
		Pablo.ReceberAumento(20);
		System.out.println(Pablo);
		Pablo.CalcularGanhoAnual(0);
	}

}
