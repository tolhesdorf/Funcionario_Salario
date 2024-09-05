package funcionario.salario.projeto;

public class Funcionário {
	String Nome;
	String Departamento;
	double Salário;
	String Admissão;
	String RG;
	
	public Funcionário(String Nome, String Departamento, double Salário, String Admissão, String RG) {
		this.Nome = Nome;
		this.Departamento = Departamento;
		this.Salário = Salário;
		this.Admissão = Admissão;
		this.RG = RG;
	}
	
	public void ReceberAumento(double Percentual) {
		double Aumento = this.Salário*(Percentual/100);
		this.Salário = Salário + Aumento;
	}
	
	public void CalcularGanhoAnual(double Anual) {
		double Décimo = this.Salário;
		double Férias = this.Salário+(this.Salário/3);
		Anual = (Salário*12)+Décimo+Férias;
		System.out.println("Ganho Anual: "+Anual+" R$");
	}

	@Override
 	public String toString() {
	return "\nINFORMAÇÕES DO FUNCIONÁRIO\n-----------------------------"
			+ "\nNome: "+this.Nome+"\nSalário: "+this.Salário+" R$";
	}
}
