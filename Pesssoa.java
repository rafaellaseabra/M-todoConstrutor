package MetodoConstrutor;

public class Pesssoa {
 
	private String nome;
	private int idade;
	
	//Construtor padrão é criado mesmo que nao explicitado
	public Pesssoa() {
		
	}
	//Método construtor com 2 argumento
	 public  Pesssoa (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	 //construtor com 1 argumento
	 public Pesssoa(String nome) {
		 this.nome = nome;
	 }
		 
	 public Pesssoa (int idade) {
		this.idade = idade;
	 }
		 
 //----------------------------------------------------//
	 
	public String getNome () {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade () {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
