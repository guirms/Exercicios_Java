package Aplicacao;

import java.util.Map;
import java.util.TreeMap;

public class Programa {

	public static void main(String[] args) {
		
		Map <String, String> cookies = new TreeMap<>(); //map<chave, valor>
		
		cookies.put("usuario", "joao123");
		cookies.put("email", "maria@gmail.com");
		
		System.out.println(cookies.get("usuario"));
		
		cookies.remove("email");
		
		System.out.println(cookies.containsValue("joao123"));
		System.out.println(cookies.containsKey("usuario"));

		
		for (String chave : cookies.keySet()) {
			System.out.println(chave + ": " + cookies.get(chave));
		}

	}

}
