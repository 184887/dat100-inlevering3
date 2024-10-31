package no.hvl.dat100.oppgave2;

import org.apache.maven.surefire.shared.lang3.text.StrBuilder;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Tekst extends Innlegg {

	public String tekst; 
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		super(id, bruker, dato);
		this.tekst = tekst; 
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		super(id, bruker, dato, likes);
		this.tekst = tekst; 
	}

	protected String getGrandparentToString() {
        return super.toString();
    }
	
	public String getTekst() {
		return tekst; 

	}

	public void setTekst(String tekst) {
		if (tekst != null){
			this.tekst = tekst; 
		} else{
			throw new UnsupportedOperationException("Du trenger en teks"); 
		}
	}

	@Override
	public String toString() {
		String str = "TEKST" + "\n"+
					 super.toString() +
					 tekst + "\n";


		return str;

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
