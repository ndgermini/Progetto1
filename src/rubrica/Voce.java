package rubrica;


public class Voce {
	
	private String nome = new String();
	private String numeroTelefonico = new String();
	
	public Voce(){
		
	}
	
	public void setNome(String nome){
		this.nome=nome;
	}
	
	public void setNumeroTelefonico(String numero){
		this.numeroTelefonico=numero;
	}

	public void stampaVoce(){
		this.toString();
	}

	@Override
	public String toString() {
		return "Contatto = " + nome + ", Telefono = " + numeroTelefonico;
	}
	
}
