package MetodoConstrutor;

public class Carro {
	
	private String placa;
	private int numChassi;
	
	
	//Método construtor com 2 argumento
	 public  Carro(String placa, int numChassi) {
		this.placa = placa;
		this.numChassi= numChassi;
		 }
	 public  Carro(String placa) {
		this.placa = placa;
		 } 
	 public  Carro( int numChassi) {
		this.numChassi= numChassi;
			 }
	 public Carro() {
			
		}
		 
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getNumChassi () {
		return numChassi;
	}
	public void setNumChassi(int numChassi) {
		this.numChassi= numChassi;
	}

}
