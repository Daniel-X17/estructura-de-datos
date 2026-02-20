import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        System.out.println("El promedio de las notas es: " + calcularPromedio(notas));
        System.out.println("La nota maxima del curso es: " + notamaxima(notas));
        System.out.println("La nota minima del curso es: " + notaminima(notas));
        System.out.println("Cantidad de estudiantes que aprobaron: " + cantidadaprobados(notas));

        sc.close();
    }

    public static double calcularPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    public static double notamaxima(double[] notas) {
        double max = notas[0];
        for (double nota : notas) {
            if (nota > max) {
                max = nota;
            }
        }
        return max;
    }

    public static double notaminima(double[] notas) {
        double min = notas[0];
        for (double nota : notas) {
            if (nota < min) {
                min = nota;
            }
        }
        return min;
    }

    public static int cantidadaprobados(double[] notas) {
        int contador = 0;
        for (double nota : notas) {
            if (nota >= 3) {   
                contador++;
            }
        }
        return contador;
    }
}


