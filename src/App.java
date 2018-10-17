	import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class App  {

	

	public static void main(String[] args) throws FileNotFoundException {

	
		
		Pila pila = ArchivoPila.leer("src/mesadas.in");
		int contpila = pila.resolver();
		ArchivoPila.escribir(contpila, "src/mesadas.out");

	}

}
