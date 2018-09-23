import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Pila {

	private ArrayList<Mesada> mesada;

	public Pila(ArrayList<Mesada> mesada) {

		this.mesada = new ArrayList<Mesada>(mesada);
	}

	public ArrayList<Mesada> getMesada() {
		return mesada;
	}

	public void setMesada(ArrayList<Mesada> mesada) {
		this.mesada = mesada;
	}

	public int resolver() {

		int contpila = 0;
		int i = 0;
		int j = 0;
		int cantidad = 1, posicion = 0, mayor = 0;
		while (i < mesada.size()) {

			while (j < mesada.size()) {

				if (mesada.get(i).apila(mesada.get(j)) && i != j) {

					cantidad++;
					if (cantidad > mayor) {
						mayor = cantidad;
						posicion = i;
					}
				}
				j++;
			}
			cantidad = 1;
			j = 0;
			i++;

		}

		System.out.println("el mayor es " + mayor + " " + "posicion " + posicion);
		
	

		while (!mesada.isEmpty()&& mesada.size()>1) {

			while (j < mesada.size()) {

				if (mesada.get(posicion).apila(mesada.get(j))&& posicion != j ) {

					mesada.remove(j);
					j--;
					
				}

				j++;

				
			}
			mesada.remove(posicion);
			contpila++;
			j = 0;
			
		}

		System.out.println("cantidad minima de pilas: "+ ++contpila);
		
		return contpila;

	}

}
