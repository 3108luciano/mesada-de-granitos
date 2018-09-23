	import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class App  {

	

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<Mesada> mesada = new ArrayList<Mesada>();
		PrintWriter salida = new PrintWriter(new File("salidaordenada.out"));
		
		Pila pila = ArchivoPila.leer("src/mesadas.in");
		
		
		
		int contpila = pila.resolver();
		ArchivoPila.escribir(contpila, "src/mesadas.out");

	}

}
