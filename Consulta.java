package MetodoConstrutor;

public class Consulta {

	public String data;
	public String nomePact;
	public String nomeDent;

    public  Consulta(String nomePact, String nomeDent, String data) {
	 this.nomePact =nomePact ;	
	 this.nomeDent = nomeDent;
	 this.data = data;
  }
    public  Consulta(String nomePact) {
   	 this.nomePact =nomePact ;	
   }
    public  Consulta() {
    	
    }
    //////
    
    public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
    
    public String getNomePact() {
		return nomePact;
	}
	public void setNomePact(String nomePact) {
		this.nomePact = nomePact;
	}
	public String getNomeDent () {
		return nomeDent;
	}
	public void setNomeDent(String nomeDent) {
		this.nomeDent= nomeDent;
	}
}
