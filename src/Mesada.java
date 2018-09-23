import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mesada  {

	private int largo;
	private int ancho;
	

	public Mesada(int largo, int ancho) {
		this.largo = largo;
		this.ancho = ancho;

	}


	

	public boolean apila(Mesada otro) {
		return ((this.largo >= otro.largo && this.ancho >= otro.ancho)
				|| (this.ancho >= otro.largo && this.largo >= otro.ancho));
	}

	

	public int getLargo() {
		return largo;
	}

	public int getAncho() {
		return ancho;
	}
}
