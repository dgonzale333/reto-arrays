public class Main {
    public static void main(String[] args) {
        // 1. Declaración e inicialización de un arreglo de enteros con valores predefinidos.
        int[] numeros = {5, 2, 8, 1, 9, 3, 7, 4, 6};

        // 2. Imprimir el arreglo original utilizando el método imprimirArreglo.
        System.out.println("Arreglo original:");
        imprimirArreglo(numeros);

        // 3. Encontrar el número mayor en el arreglo utilizando el método encontrarMayor.
        int mayor = encontrarMayor(numeros);
        System.out.println("El número mayor es: " + mayor);

        // 4. Calcular el promedio de los números en el arreglo utilizando el método calcularPromedio.
        double promedio = calcularPromedio(numeros);
        System.out.println("El promedio es: " + promedio);

        // 5. Invertir el arreglo utilizando el método invertirArreglo.
        invertirArreglo(numeros);
        System.out.println("Arreglo invertido:");
        imprimirArreglo(numeros);

        // 6. Ordenar el arreglo utilizando el método ordenarArreglo (algoritmo de burbuja).
        ordenarArreglo(numeros);
        System.out.println("Arreglo ordenado:");
        imprimirArreglo(numeros);
    }

    // Método para imprimir los elementos del arreglo.
    public static void imprimirArreglo(int[] arr) {
        // Recorre el arreglo y imprime cada elemento seguido de un espacio.
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Salto de línea al final de la impresión del arreglo.
        System.out.println();
    }

    // Método para encontrar el número mayor en el arreglo.
    public static int encontrarMayor(int[] arr) {
        // Inicializa la variable 'mayor' con el primer elemento del arreglo.
        int mayor = arr[0];
        // Recorre el arreglo y compara cada número con el valor actual de 'mayor'.
        for (int num : arr) {
            // Si se encuentra un número mayor, se actualiza el valor de 'mayor'.
            if (num > mayor) {
                mayor = num;
            }
        }
        // Devuelve el número mayor encontrado.
        return mayor;
    }

    // Método para calcular el promedio de los números en el arreglo.
    public static double calcularPromedio(int[] arr) {
        // Inicializa la variable 'suma' para almacenar la suma de los elementos del arreglo.
        int suma = 0;
        // Recorre el arreglo sumando cada elemento a 'suma'.
        for (int num : arr) {
            suma += num;
        }
        // Calcula y devuelve el promedio como un valor de tipo double.
        return (double) suma / arr.length;
    }

    // Método para invertir los elementos del arreglo.
    public static void invertirArreglo(int[] arr) {
        // 'n' almacena la longitud del arreglo.
        int n = arr.length;
        // Recorre la mitad del arreglo intercambiando elementos desde los extremos hacia el centro.
        for (int i = 0; i < n / 2; i++) {
            // Almacena temporalmente el valor del elemento actual.
            int temp = arr[i];
            // Intercambia el elemento actual con su correspondiente desde el final del arreglo.
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    // Método para ordenar el arreglo utilizando el algoritmo de burbuja.
    public static void ordenarArreglo(int[] arr) {
        // 'n' almacena la longitud del arreglo.
        int n = arr.length;
        boolean swapped; // Variable para rastrear si hubo intercambios en una pasada.

        // Recorre el arreglo múltiples veces, cada vez moviendo el número más grande hacia el final.
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Resetea la variable 'swapped' antes de cada pasada.

            // Compara elementos adyacentes y los intercambia si están en el orden incorrecto.
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambia arr[j] con arr[j + 1].
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // Marca que hubo un intercambio en esta pasada.
                }
            }
            // Si no hubo intercambios en la pasada, el arreglo ya está ordenado.
            if (!swapped) break;
        }
    }
}


