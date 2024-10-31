package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
	
	private int id;
	private String bruker;
	private String dato;
	private int likes;

	
	public Innlegg() {

		
	}
	
	public Innlegg(int id, String bruker, String dato) {
		
		this.id = id; 
		this.bruker = bruker;
		this.dato = dato;	
		this.likes = 0;
		
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id = id; 
		this.bruker = bruker; 
		this.dato = dato;
		this.likes = likes; 
	}
	
	public String getBruker() {
		
		return bruker;

	}

	public void setBruker(String bruker) {
		if(bruker != null){
			this.bruker = bruker; 
		} else {
			throw new UnsupportedOperationException("Du måp gi bruker et navn"); 
		}
	}

	public String getDato() {
		return dato; 
		
	}

	public void setDato(String dato) {
		if(bruker != null){
			this.dato = dato; 
		} else {
			throw new UnsupportedOperationException("Datt kan ikke være null"); 
		}
	}

	public int getId() {
		return id;

	}

	public int getLikes() {
		return likes;

	}
	
	public void doLike () {
		likes++; 
	}
	
	public boolean erLik(Innlegg innlegg) {
		if (this.id == innlegg.id ){
			return true; 
		} else {
			return false; }
	}
	
	@Override
	public String toString() {
		 	return   id + "\n" + 
					 bruker + "\n" + 
					 dato + "\n" + 
					 likes + "\n";
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
