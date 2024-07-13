package Guia_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Reader {

	PrintStream ps;
	InputStreamReader Ir;
	BufferedReader br;

	public Reader() {
		Ir = new InputStreamReader(System.in);
		br = new BufferedReader(Ir);
		ps = new PrintStream(System.out);
	}

	public String lector() {
		try {
			return br.readLine();
		} catch (IOException e) {
			Logger.getLogger(Reader.class.getName()).log(Level.WARNING, null, e);
		}

		return null;
	}

}
