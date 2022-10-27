package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		boolean skrevet = false;
		//THIS SHIOT IS THROWING SOMTHING AND I DONT UNDERSTADN WTFFFFFFF
		String txt = samling.toString();
		String path = mappe + filnavn;
		
		// this works but is it even right
		try {
			PrintWriter skriver = new PrintWriter(path);
			
			skriver.print(txt);
			
			skriver.close();
			return !skrevet;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		return skrevet;
	}
}
