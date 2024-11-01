package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;

public class Bilde extends Tekst {

	private String url; 
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		super(id, bruker, dato, tekst); 
		this.url = url;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		super(id, bruker, dato, likes, tekst); 
		this.url = url;
	}
	
	public String getUrl() {
		return url; 

	}

	public void setUrl(String url) {
		if (url != null) {
			this.url = url; 
		} else {
			throw new UnsupportedOperationException ("Du må gi et bilde");
		}
	}

	@Override
	public String toString() {
		String Str = "BILDE" + "\n"+
					 getId()+ "\n" + 
					 getBruker() + "\n" + 
					 getDato() + "\n" + 
					 getLikes() + "\n" + 
					 tekst + "\n" + 
					 url + "\n";
		
				 return Str; 

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
