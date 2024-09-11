package MetodoConstrutor;

public class ConstrutorCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro ferrari = new Carro("PLACA: xxxxxxx", 98765545);
		
		System.out.println("------------------------------------");
		
		System.out.println(ferrari.getPlaca());
		System.out.println(ferrari.getNumChassi());
		System.out.println("------------------------------------");
		
		Carro lamborghini = new Carro ("PLACA: yyyyyy");
		
		System.out.println (lamborghini.getPlaca());
		System.out.println("------------------------------------");
		
		Carro bmw = new Carro (8765432);
		System.out.println(bmw.getNumChassi());
		
		//
       Pesssoa mercedes = new Pesssoa();
		
		mercedes.setIdade(87654332);
		mercedes.setNome("PLACA: zzzzzz");
		
		System.out.println("------------------------------------");
		
		System.out.println(mercedes.getNome());
		System.out.println(mercedes.getIdade());
		

	}

}
