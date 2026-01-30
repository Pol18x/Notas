package Ejercicios;

/**
 * Programa que define un conjunto concreto de notas académicas, cuyas funciones
 * son buscar la nota máxima, confirmar si esa nota se repite y calcular la media
 * del conjunto de notas.
 * 
 * @author Pol Fernández
 */
public class Notas {
	
	/**
	 * Método principal que ejecuta el programa.
	 * @param args Argumentos de la linea de comandos
	 */
	public static void main(String[] args) {
		int[] conjuntoNotas = { 5, 7, 3, 7, 2, 9, 7 }; // Conjunto concreto de notas.
		int notaMaxima = obtenerMaximo(conjuntoNotas); // Llamamos a este método y le pasamos el conujunto de notas para que nos saque la nota máxima.
		int repetidos = buscarRepetidos(conjuntoNotas, notaMaxima); // Llamamos a este método y le pasamos el conujunto de notas y la nota máxima para que cuente las notas máximas repetidas.
		mostrarResultado(repetidos); // Llamamos a este método y le pasamos el numero de notas máximas repetidas para que nos confirme si hay mas de una nota máxima repetida.
		double media = calcularMedia(conjuntoNotas); // Llamamos a este método y le pasamos el conjunto de notas para que calcule la media.
		mostrarCalificacion(media); // Llamamos al método y le pasamos la nota media para que nos muestre la calificación y que nos diga si hemos aprobado o suspendido.
	}
	
	/**
	 * Método que busca la nota máxima del conjunto.
	 * 
	 * @param conjuntoNotas Conjunto de notas a analizar
	 * @return La nota máxima del conjunto
	 */
	public static int obtenerMaximo(int[] conjuntoNotas) {
		int notaMaxima = conjuntoNotas[0];

		for (int i = 1; i < conjuntoNotas.length; i++) {
			if (conjuntoNotas[i] > notaMaxima) {
				notaMaxima = conjuntoNotas[i];
			}
		}

		return notaMaxima;
	}

	/**
	 * Método que cuenta las veces que se repite la nota máxima.
	 * 
	 * @param conjuntoNotas Conjunto de notas a analizar
	 * @param notaMaxima Nota máxima del conjunto a analizar
	 * @return Cantidad de notas máximas repetidas
	 */
	public static int buscarRepetidos(int[] conjuntoNotas, int notaMaxima) {
		int repetidos = 0;

		for (int i = 0; i < conjuntoNotas.length; i++) {
			if (conjuntoNotas[i] == notaMaxima) {
				repetidos++;
			}
		}

		return repetidos;
	}

	/**
	 * Método que muestra la confirmación de si hay notas repetidas de la nota máxima.
	 * 
	 * @param repetidos Número de notas máximas repetidas
	 */
	public static void mostrarResultado(int repetidos) {
		if (repetidos > 1) {
			System.out.println("Hemos encontrado notas repetidas de la nota máxima");
		} else {
			System.out.println("No hemos encontrado notas repetidas de la nota máxima");
		}
	}

	/**
	 * Método que calcula la media del conjunto de notas.
	 * 
	 * @param conjuntoNotas Conjunto de notas a analizar
	 * @return Nota media calculada
	 */
	public static double calcularMedia(int[] conjuntoNotas) {
		int valorTotal = 0;

		for (int i = 0; i < conjuntoNotas.length; i++) {
			valorTotal += conjuntoNotas[i];
		}

		return (double) valorTotal / conjuntoNotas.length;
	}

	/**
	 * Método que muestra la calificación.
	 * 
	 * @param media Media de la nota a mostrar.
	 */
	public static void mostrarCalificacion(double media) {
		if (media >= 5) {
			System.out.printf("Has aprobado: %.2f\n", media);
		} else {
			System.out.printf("Has suspendido: %.2f\n", media);
		}
	}
}