package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {
	// IS THIS HOW EXTEDNS WORKS???
	protected String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = 0;
		this.tekst = tekst;
		this.url = url;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		this.tekst = tekst;
		this.url = url;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		String txt = "BILDE\n";
		
		txt += id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n" + tekst + "\n" + url + "\n";
		
		return txt;
	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
