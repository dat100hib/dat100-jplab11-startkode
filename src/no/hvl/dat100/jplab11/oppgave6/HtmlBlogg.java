package no.hvl.dat100.jplab11.oppgave6;

// import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.Innlegg;
import no.hvl.dat100.jplab11.oppgave3.Blogg;

public class HtmlBlogg extends Blogg {

	public HtmlBlogg() {
		super();
	}
	
	private static String HTMLPREFIX = 
			"<html>\n\t<head>\n\t\t<title>DAT100 Blogg</title>\n\t</head>\n\t<body>\n";
	
	private static String HTMLPOSTFIX = 
			"\t</body>\n</html>";
	
	public String toString() {
		Innlegg[] innleggtabell = super.getSamling();
		String txt = HTMLPREFIX;
		
		for(int i = 0; i < super.getAntall(); i++) {
			txt += innleggtabell[i].toHTML() + "\t\t<hr>\n";
		}
		
		txt += HTMLPOSTFIX;
		
		return txt;
	}
}
