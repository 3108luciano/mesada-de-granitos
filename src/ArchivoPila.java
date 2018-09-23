import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ArchivoPila {

	public static Pila leer(String path) throws FileNotFoundException {

		int cantMesa=0;
		
		Scanner sc = new Scanner(new File(path));
		ArrayList<Mesada> mesada= new ArrayList<Mesada>();
		cantMesa = sc.nextInt();

		for (int i = 0; i <cantMesa; i++) {
			mesada.add(new Mesada(sc.nextInt(), sc.nextInt()));
			System.out.println(mesada.get(i).getLargo() + " " + mesada.get(i).getAncho());
		}

		sc.close();
		return new Pila(mesada);

	}

	public static void escribir(int cantpilamin, String path) throws FileNotFoundException {

		PrintWriter salida = new PrintWriter(new File(path));

		salida.println(cantpilamin);
		salida.close();
	}

}
