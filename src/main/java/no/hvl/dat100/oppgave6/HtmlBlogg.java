package no.hvl.dat100.oppgave6;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.Innlegg;
import no.hvl.dat100.oppgave2.Bilde;
import no.hvl.dat100.oppgave2.Tekst;
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
	    StringBuilder sb = new StringBuilder();

	    String p = "<p>";
	    String h2 = "<h2>";
	    String hr = "<hr>";
	    String iframe = "<iframe src=\""; 
	    String iframeEnd = "\"></iframe>";
	    Innlegg[] samling = getSamling();

	    for (Innlegg innlegg : samling) {
	        if (innlegg != null) {
	            sb.append(h2).append(innlegg.getBruker()).append(" ").append(innlegg.getDato()).append(" [").append(innlegg.getLikes()).append("]</h2>\n");

	            if (innlegg instanceof Tekst) {
	                Tekst tekstInnlegg = (Tekst) innlegg;
	                sb.append(p).append(tekstInnlegg.getTekst()).append("</p>\n");
	            }

	            if (innlegg instanceof Bilde) {
	                Bilde bilde = (Bilde) innlegg;
	                sb.append(p).append(bilde.getTekst()).append("</p>\n");
	                sb.append(iframe).append(bilde.getUrl()).append(iframeEnd).append("\n");
	            }

	            sb.append(hr).append("\n");
	        }
	    }

	    return sb.toString();
	}
}
