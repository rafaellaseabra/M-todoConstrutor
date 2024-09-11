package MetodoConstrutor;

public class Animal {
	
	private double tamanho;
	private String cor;
	
	 public  Animal(String cor, double tamanho) {
		 this.cor = cor;	
		 this.tamanho = tamanho;
   }
	 public Animal() {
   }
	 public  Animal(String cor) {
		 this.cor = cor;	
   }
	 
	 //
	 public String getCor () {
			return cor;		
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public double getTamanho () {
			return tamanho;
		}
		public void setTamanho(double tamanho) {
			this.tamanho = tamanho;
		}
}
