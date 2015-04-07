package progetto1;
import rubrica.*;

public class Progetto1 {

	public static void main(String[] args) {
		
			Rubrica miaRubrica = new Rubrica();
			Menu mioMenu = new Menu();
			int scelta = mioMenu.scelta();
			//mioMenu.mostraMenu();
			
			while(scelta!=4){
				
				switch(scelta){
				
				case 0: 
					System.out.println("Inserire un numero");
					break;
					
				case 1:
					Voce v = new Voce();
					v.setNome("Casa");
					v.setNumeroTelefonico("075000000");
					miaRubrica.aggiungiVoce(v);
					break;
					
				case 2:
					int posizione = mioMenu.leggiIndice();
					miaRubrica.eliminaVoce(posizione);
					break;
					
				case 3:
					miaRubrica.visualizzaRubrica();
					break;
					
				default:
					break;

				}
				
				scelta = mioMenu.scelta();

			}
			System.out.println("Programma terminato");
			
	}
	
}
