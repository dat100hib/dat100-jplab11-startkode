package no.hvl.dat100.jplab11.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.*;
import no.hvl.dat100.jplab11.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	// DO I NEED TO ADD MORE DEPTH TO THIS WITH TRY AND CATCH OR???
	// LOTS OF UNUSED IMPORTS
	public static Blogg les(String mappe, String filnavn) {
		String path = mappe + filnavn;
		File fil = new File (path);
		Blogg blogg = null;
		
		try {
			Scanner leser = new Scanner(fil);
			int antall = Integer.parseInt(leser.nextLine());
			blogg = new Blogg(antall);
			
			while (leser.hasNextLine()) {
				String innleggtype = leser.nextLine();
				int id = Integer.parseInt(leser.nextLine());
				String bruker = leser.nextLine();
				String dato = leser.nextLine();
				int likes = Integer.parseInt(leser.nextLine());
				String teksttxt = leser.nextLine();
				if (innleggtype.equals(TEKST)) {
					Tekst tekst = new Tekst(id, bruker, dato, likes, teksttxt);
					
					blogg.leggTil(tekst);
				} else if (innleggtype.equals(BILDE)) {
					String url = leser.nextLine();
					Bilde bilde = new Bilde(id, bruker, dato, likes, teksttxt, url);
					
					blogg.leggTil(bilde);
				} else {
					return blogg;
				}
			}
			
			leser.close();
		} catch (FileNotFoundException e) {
			return blogg;
		}
		
		return blogg;
	}
}
