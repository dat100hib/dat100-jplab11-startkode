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

	public static Blogg les(String mappe, String filnavn) {
		String path = mappe + filnavn;
		File fil = new File (path);
		
		try {
			Scanner leser = new Scanner(fil);
			int antall = leser.nextInt();
			Blogg blogg = new Blogg(antall);
			
			// Create objects and add them
			String innleggtype = leser.nextLine();
			
			
			leser.close();
		} catch (FileNotFoundException e) {
			System.out.print("nawdawg");
			return null;
		}
		// Read the first line and create list
		

		// else  {
			// return null;
			// String url = "";
			// Bilde bidle = new Bilde(id, bruker, dato, likes, teksttxt, url)
		// }
		
		// while (leser.hasNextLine()) {
		// 	String linje = leser.nextLine();
		//	System.out.print(linje);
		// }
		
		
		// create objects
		// leggtil blogg
		
		return null;
	}
}
