package MetodoConstrutor;

public class ConstrutorPessoa {

	public static void main(String[] args) {
		
		Pesssoa jogador1 = new Pesssoa();
		
		jogador1.setIdade(18);
		jogador1.setNome("Ana julia");
		
		
		System.out.println(jogador1.getNome());
		System.out.println(jogador1.getIdade());
		System.out.println("------------------------------------");
		
		//----//
		
		Pesssoa jogador2 = new Pesssoa("Messi",36);
		
		System.out.println(jogador2.getNome());
		System.out.println(jogador2.getIdade());
        
		//Construtor 1 argumento//
		
		System.out.println("------------------------------------");
		Pesssoa jogador3 = new Pesssoa("Ceci");
		System.out.println (jogador3.getNome());
		
		Pesssoa jogador4 = new Pesssoa(4);
		System.out.println (jogador4.getIdade());
	}

}
