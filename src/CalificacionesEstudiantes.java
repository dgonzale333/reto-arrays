public class CalificacionesEstudiantes {
    public static void main(String[] args){
        // Definimos los nombres de los estudiantes.
        String[] estudiantes = {"Ana", "Carlos", "Sofía", "David", "Elena"};
        // Definimos los nombres de las materias.
        String[] materias = {"Matemáticas", "Física", "Química", "Literatura", "Historia"};
        // Definimos una matriz que contiene las notas de los estudiantes en cada materia.
        double[][] notas = {
                {8.5, 7.0, 9.0, 8.0, 7.5},  // Notas de Ana
                {7.0, 6.5, 8.0, 9.0, 8.5},  // Notas de Carlos
                {9.5, 9.0, 9.5, 8.5, 9.0},  // Notas de Sofía
                {6.0, 7.0, 7.5, 8.0, 7.0},  // Notas de David
                {8.0, 8.5, 7.5, 9.0, 8.5}   // Notas de Elena
        };

        // Mostramos la información de los estudiantes y sus notas.
        mostrarInformacionEstudiantes(estudiantes, materias, notas);

        // Calculamos y mostramos los promedios de cada estudiante.
        calcularPromedios(estudiantes, notas);

        // Encontramos y mostramos al estudiante con el promedio más alto.
        encontrarMejorEstudiante(estudiantes, notas);

        // Encontramos y mostramos la materia con el promedio más alto.
        encontrarMejorMateria(materias, notas);
    }

    // Método para mostrar la información de los estudiantes y sus calificaciones.
    public static void mostrarInformacionEstudiantes(String[] estudiantes, String[] materias, double[][] notas) {
        System.out.println("Información de los estudiantes:");
        // Mostramos los nombres de los estudiantes.
        for (String estudiante : estudiantes) {
            System.out.print(estudiante + " , ");
        }
        System.out.println();

        // Mostramos las calificaciones de cada estudiante en cada materia.
        for (int i = 0; i < notas.length; i++) {
            // Imprimimos las calificaciones de un estudiante.
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            // Imprimimos los nombres de las materias (repetido en cada línea, se puede mejorar).
            for (String materia : materias) {
                System.out.print(materia + ", ");
            }
            System.out.println();
        }
    }

    // Método para calcular y mostrar el promedio de notas de cada estudiante.
    public static void calcularPromedios(String[] estudiantes, double[][] notas) {
        System.out.println("\nPromedios de los estudiantes:");
        // Recorremos cada estudiante.
        for (int i = 0; i < notas.length; i++) {
            double total = 0;
            // Sumamos las notas de un estudiante.
            for (int j = 0; j < notas[i].length; j++) {
                total += notas[i][j];
            }
            // Calculamos el promedio dividiendo por el número de materias.
            double promedio = total / notas[i].length;
            // Mostramos el promedio del estudiante.
            System.out.print(estudiantes[i] + " = " + promedio);
            System.out.println();
        }
        System.out.println();
    }

    // Método para encontrar y mostrar al estudiante con el promedio más alto.
    public static void encontrarMejorEstudiante(String[] estudiantes, double[][] notas) {
        System.out.print("El mejor promedio es: ");
        double[] promedios = new double[estudiantes.length];

        // Calculamos el promedio de cada estudiante.
        for (int i = 0; i < notas.length; i++) {
            double total = 0;
            for (int j = 0; j < notas[i].length; j++) {
                total += notas[i][j];
            }
            promedios[i] = total / notas[i].length;
        }

        // Encontramos el mayor promedio.
        double max = promedios[0];
        int mejorEstudianteIndice = 0;
        for (int i = 1; i < promedios.length; i++) {
            if (promedios[i] > max) {
                max = promedios[i];
                mejorEstudianteIndice = i;
            }
        }
        // Mostramos el nombre del estudiante con el mejor promedio.
        System.out.print(estudiantes[mejorEstudianteIndice] + " con un promedio de " + max);
        System.out.println();
    }

    // Método para encontrar y mostrar la materia con el promedio más alto.
    public static void encontrarMejorMateria(String[] materias, double[][] notas) {
        double[] promediosMaterias = new double[materias.length];

        // Calculamos el promedio de notas de cada materia.
        for (int i = 0; i < materias.length; i++) {
            double total = 0;
            for (int j = 0; j < notas.length; j++) {
                total += notas[j][i];
            }
            promediosMaterias[i] = total / notas.length;
        }

        // Encontramos la materia con el promedio más alto.
        double max = promediosMaterias[0];
        int mejorMateriaIndice = 0;
        for (int i = 1; i < promediosMaterias.length; i++) {
            if (promediosMaterias[i] > max) {
                max = promediosMaterias[i];
                mejorMateriaIndice = i;
            }
        }
        // Mostramos el nombre de la materia con el mejor promedio.
        System.out.println("La materia con el mejor promedio es: " + materias[mejorMateriaIndice] + " con un promedio de " + max);
    }
}






