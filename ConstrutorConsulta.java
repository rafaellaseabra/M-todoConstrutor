package MetodoConstrutor;

public class ConstrutorConsulta {

	public static void main(String[] args) {
		Consulta paciente1 = new Consulta("Paciente: Cecilia","Dentista: Aline", "Data: 14/07");
		System.out.println(paciente1.getNomePact());
		System.out.println(paciente1.getNomeDent());
		System.out.println(paciente1.getData());
	
		System.out.println("----------------------");
		Consulta paciente2 = new Consulta ("Paciente: João");
		System.out.println(paciente2.getNomePact());
		////
		
		Consulta paciente3 = new Consulta(); 
		
		paciente3.setNomeDent("Dentista: Aline");
		paciente3.setNomePact("Paciente: Helena");
		paciente3.setData("Data: 13/07");
		
		System.out.println("----------------------");
		System.out.println(paciente3.getNomeDent());
		System.out.println(paciente3.getNomePact());
		System.out.println(paciente3.getData());
		
		

	}

}
