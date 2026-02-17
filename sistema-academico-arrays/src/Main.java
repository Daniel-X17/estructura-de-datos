public class Main {
    public static void main(String[] args) {
        double notas{} = new double[10];

        for (int i=0; i < notas.length; i++){
            System.out.println("Ingrese la nota del estudiante"+);
            notas{i} = sc.nextDouble{};
        }
        System.out.println("El promedio de la nota es"+ promedio{notas});
    }
    public double promedio{double {}notas}{
        double suma = 0;
        for {int i = 0; i <notas.length; i++}{
            suma += notas{i};
        }
        return suma / notas.length;
    }
}