package MetodoConstrutor;

public class ConstrutorAnimal {

	public static void main(String[] args) {
		Animal coelho = new Animal("Coelho: Branco", 34);
		System.out.println("------------------------------------");
		System.out.println(coelho.getCor());
		System.out.println(coelho.getTamanho());
		
		Animal girafa = new Animal ("Girafa: Amarela e marrom");
		System.out.println("------------------------------------");
		System.out.println(girafa.getCor());
	/////////////////////////////////////////////////////////////////////	
		Animal cachorro= new Animal ();
		
		cachorro.setCor("Cachorro: Branco com marrom");
		cachorro.setTamanho(34);
		System.out.println("------------------------------------");
		System.out.println(cachorro.getCor());
		System.out.println(cachorro.getTamanho());
		
		
		

	}

}
