package bytebank_herdado;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Igor");
		funcionario.setCpf("12345678901");
		funcionario.setSalario(2600.00);
		
		System.out.println(funcionario.getNome());
		
	}
}
