public class Main {
    public static void main(String[] args) {
        // 1. Declaración e inicialización de un arreglo
        int[] numeros = {5, 2, 8, 1, 9, 3, 7, 4, 6};

        // 2. Imprimir el arreglo original
        System.out.println("Arreglo original:");
        imprimirArreglo(numeros);

        // 3. Encontrar el número mayor
        int mayor = encontrarMayor(numeros);
        System.out.println("El número mayor es: " + mayor);

        // 4. Calcular el promedio
        double promedio = calcularPromedio(numeros);
        System.out.println("El promedio es: " + promedio);

        // 5. Invertir el arreglo
        invertirArreglo(numeros);
        System.out.println("Arreglo invertido:");
        imprimirArreglo(numeros);

        // 6. Ordenar el arreglo
        ordenarArreglo(numeros);
        System.out.println("Arreglo ordenado:");
        imprimirArreglo(numeros);
    }

    // Método para imprimir el arreglo
    public static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Método para encontrar el número mayor
    public static int encontrarMayor(int[] arr) {
        int mayor = arr[0];
        for (int num : arr) {
            if (num > mayor) {
                mayor = num;
            }
        }
        return mayor;
    }

    // Método para calcular el promedio
    public static double calcularPromedio(int[] arr) {
        int suma = 0;
        for (int num : arr) {
            suma += num;
        }
        return (double) suma / arr.length;
    }

    // Método para invertir el arreglo
    public static void invertirArreglo(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    // Método para ordenar el arreglo (algoritmo de burbuja)
    public static void ordenarArreglo(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar arr[j] y arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Si no hubo intercambio, el arreglo ya está ordenado
            if (!swapped) break;
        }
    }


    public class GestionEstudiantes {
        public static void main(String[] args) {
            // Definimos los datos de los estudiantes
            String[] estudiantes = {"Ana", "Carlos", "Sofía", "David", "Elena"};
            String[] materias = {"Matemáticas", "Física", "Química", "Literatura", "Historia"};
            double[][] notas = {
                    {8.5, 7.0, 9.0, 8.0, 7.5},  // Notas de Ana
                    {7.0, 6.5, 8.0, 9.0, 8.5},  // Notas de Carlos
                    {9.5, 9.0, 9.5, 8.5, 9.0},  // Notas de Sofía
                    {6.0, 7.0, 7.5, 8.0, 7.0},  // Notas de David
                    {8.0, 8.5, 7.5, 9.0, 8.5}   // Notas de Elena
            };

            // Mostramos la información de los estudiantes
            mostrarInformacionEstudiantes(estudiantes, materias, notas);

            // Calculamos y mostramos los promedios de cada estudiante
            calcularPromedios(estudiantes, notas);

            // Encontramos y mostramos al estudiante con el promedio más alto
            encontrarMejorEstudiante(estudiantes, notas);

            // Encontramos y mostramos la materia con el promedio más alto
            encontrarMejorMateria(materias, notas);
        }

        public static void mostrarInformacionEstudiantes(String[] estudiantes, String[] materias, double[][] notas) {
            System.out.println("Información de los estudiantes:");

            for (String estudiante : estudiantes) {
                System.out.print(estudiante + ", ");
            }
            System.out.println();

            for (String materia : materias) {
                System.out.print(materia + ", ");
            }
            System.out.println();

            }
            // Implementa este método
        }

        public static void calcularPromedios(String[] estudiantes, double[][] notas) {
            System.out.println("\nPromedios de los estudiantes:");


        }

        public static void encontrarMejorEstudiante(String[] estudiantes, double[][] notas) {
            // Implementa este método
        }

        public static void encontrarMejorMateria(String[] materias, double[][] notas) {
            // Implementa este método
        }
    }

