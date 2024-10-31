package no.hvl.dat100.oppgave6;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.Innlegg;
import no.hvl.dat100.oppgave3.Blogg;

public class HtmlBlogg extends Blogg {

	public HtmlBlogg() {
		super();
	}
	
	private static String HTMLPREFIX = 
			"<html>\n\t<head>\n\t\t<title>DAT100 Blogg</title>\n\t</head>\n\t<body>\n";
	
	private static String HTMLPOSTFIX = 
			"\t</body>\n</html>";
	
	@Override
	public String toString() {
	try {	StringBuilder sb = new StringBuilder(); 

			String p = "<p>";
			String h2 = "<h2>";
			String hr = "<hr>";
			String iframe = "<iframe"; 

			String html = HTMLPREFIX +
							sb.append(h2).toString() + HTMLPOSTFIX;
							
							return html; 
	} catch (Exception e) {
		System.err.println("NHa");
	}
	

		
		
		 //TODDO Her er det noe galt
	}
}
