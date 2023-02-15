package bytebank_herdado;

public class TesteGerente {
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		
		gerente.setNome("Igor");
		gerente.setCpf("12345678901");
		gerente.setSalario(5000);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
	}
}
