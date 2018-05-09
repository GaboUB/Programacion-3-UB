

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		List<String> readAllLines = Files.readAllLines(Paths.get("src/Persona.txt")); /* Investigar Files and Paths */

		for(String s2: readAllLines){
			String[] arr1 = s2.split(",");
			Persona p1 = new Persona(arr1[0].trim(),arr1[1].trim(), Genero.valueOf(arr1[2].trim()),Integer.parseInt(arr1[3].trim()));
			System.out.println(p1);
		}	
	}
}
