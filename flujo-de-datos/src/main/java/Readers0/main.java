package Readers0;

import java.io.PrintStream;

public class main {

	public static void main(String[] args) {
		Lectura leer = new Lectura();
		leer.entradaDeDatos();
		//String leido = leer.entradaDeDatos();


		PrintStream ps = new PrintStream(System.out);

		String texto = "Este va ser el texto <> que yo quiero, manipular.";


		ps.println("El char 3:"+ texto.charAt(3));

		ps.println("Sin espacio al principio y/o al final:"+ texto.trim());

		ps.println("en que posicion está"+ texto.indexOf("el")); //

		ps.println("el '>' este ne la pocicion:" + texto.indexOf( '>' ) );

		ps.println("ultima aparicion de la letra "+ texto.lastIndexOf('e'));
		
		ps.println("Largo del texto" + texto.length()	);

		ps.println("" + texto.equals("hola")	);

		ps.println("" + texto.compareTo("hola")	);
		
		ps.println("" + texto.compareToIgnoreCase("hola")	);

		ps.println("" + texto.contains("que")	);
		
		ps.println("" + texto.replace("a", "44"));
		
		ps.println("" + texto.replaceAll("a", "_"));
		
		ps.println("" + texto.concat("caca").concat("otra caca"));
		
		ps.println("minuscula" + texto.toLowerCase());
		
		ps.println("mayuscula" + texto.toUpperCase());
		
		ps.println("" + texto.startsWith("este"));
		
		ps.println("" + texto.endsWith("."));
		
		ps.println("agarra a partir de la posicion que indicamos" + texto.substring( 10 ) );
		ps.println("agarra desde la posicion que indicamos la cantidad de caracteres que indicamos en el segundo numero" + texto.substring( 10 , 8 ) );
		ps.println("" + texto.substring(0,texto.indexOf("<>")));
		ps.println("codePoint: " + texto.codePointAt(4));
		
		char [] letraAletra = texto.toCharArray();
		
		String separar = "esto, es un texto, que vamos, a separar.";
		String[] vec = separar.split(",");
		separar.split("\\+");
		texto.split("<>");
	}

		}
