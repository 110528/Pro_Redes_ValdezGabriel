package Readers0;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colecciones {

	//vector
		int[] vec = new int[5];
		
		ArrayList<String> frutas = new ArrayList<>();
		ArrayList verduras = new ArrayList<>();
		
		List nombres  = new ArrayList<>();
		List<String> apellido = new ArrayList<>();
		
		LinkedList<String> componentesPc = new LinkedList<>();
		List precios = new LinkedList<>();
		
		LinkedHashMap<String, String> listaEspañolIngles = new LinkedHashMap<>();
		Map<Integer,Integer> valores = new LinkedHashMap<>();
		
		LinkedHashSet<Integer> listaInglesEspañol = new LinkedHashSet<>();
		Set<Integer> valores2 = new LinkedHashSet<>();	
		
		HashMap<String , String> españolRAE = new HashMap<>();
		Map<String,Integer> españolIngles = new HashMap<>();
		
		HashSet<String> claves = new HashSet<>();
		Set<Integer> DNI = new HashSet<>();
		
		public void Array() {
			frutas.add("");
			verduras.add(5);
			verduras.add("s");
			
			frutas.clear(); //Vacia por completo
			frutas.remove(5); //Lo que este en la posicion 5
			frutas.remove("manzana"); //Busca y borra ese dato en particular
			
			verduras.contains("tomate");//existe?
			verduras.containsAll(new ArrayList<>() );
			
			frutas.get(5);
			frutas.indexOf("banana");
			
			verduras.isEmpty();
			verduras.size();
			
			
			
			
		}
		
		
}
