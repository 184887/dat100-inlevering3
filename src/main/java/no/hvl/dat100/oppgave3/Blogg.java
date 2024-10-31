package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.oppgave2.Bilde;
import no.hvl.dat100.oppgave2.Tekst;

public class Blogg {

	private Innlegg[] innleggtabell; 
	private int nesteledige; 


	public Blogg() {
		this.innleggtabell = new Innlegg[20]; 
		this.nesteledige = 0;    
	}

	public Blogg(int lengde) {
		this.innleggtabell = new Innlegg[lengde];
		this.nesteledige = 0;  
	}
	public int getAntall() {
	return nesteledige; 
}
	
	public Innlegg[] getSamling() {
		return innleggtabell; 

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < nesteledige; i++) {  
			if (innleggtabell[i] != null && innleggtabell[i].getId() == innlegg.getId()) {
				return i;  
			}
		}
		return -1;
		 
	}

	public boolean finnes(Innlegg innlegg) {
		return finnInnlegg(innlegg) >= 0;
	}

	public boolean ledigPlass() {
		for( int i = 0; i < innleggtabell.length ; i++){
			if(innleggtabell[i] == null){
				return true;
			}
		}
		return false;

	}
	
	public boolean leggTil(Innlegg innlegg) {

		if (ledigPlass() && !finnes(innlegg)) {
			innleggtabell[nesteledige] = innlegg; 
			nesteledige++;  
			return true;  
		}
		return false; 
	}
	
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();

		 for (int i = 0;i <innleggtabell.length; i++ ){	
			if (innleggtabell[i] != null) { 
				stringBuilder.append(innleggtabell[i].toString()); 
			}
		 }
		 return  nesteledige + "\n" + stringBuilder;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		if(ledigPlass() == false){
			Innlegg[] nyInnleggs = new Innlegg[innleggtabell.length * 2]; 
			for(int i = 0; i < innleggtabell.length; i++){
				nyInnleggs[i] = innleggtabell[i]; 
			}

			innleggtabell = nyInnleggs;
				
			};
		}
	
	
	//public boolean leggTilUtvid(Innlegg innlegg) {

		// Tror ikke denne her trengs grunnet at innlegstabbel nåt har 40 plasser 
		
	//}
	
	public boolean slett(Innlegg innlegg) {
		
		for(int x = 0; x <nesteledige; x++){
			if (innleggtabell[x].getId() == innlegg.getId()) {
				
				for (int i = x; i < nesteledige - 1; i++) {
					innleggtabell[i] = innleggtabell[i + 1];
				}
				innleggtabell[nesteledige - 1] = null; 
				nesteledige--;  
				return true; 
			}
		}
		return false; 

	}
	
	public int[] search(String keyword) {
		
		int ordIdTemp[] = new int[innleggtabell.length]; 
		int i = 0; 
		for(Innlegg x : innleggtabell){
			if(x.toString() != null &&  x.toString().contains(keyword)){
				ordIdTemp[i] = x.getId(); 
				i++;
			}
		}
		int ord[] = new int[i]; 
		return ord; 

	}
}