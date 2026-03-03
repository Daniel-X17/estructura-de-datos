class Nodo {
    String url;
    String fecha;
    Nodo siguiente;

    public Nodo(String url, String fecha) {
        this.url = url;
        this.fecha = fecha;
        this.siguiente = null;
    }
}

class HistorialNavegacion {
    private Nodo cabeza;

    public HistorialNavegacion() {
        cabeza = null;
    }

    public void insertar(String url, String fecha) {
        Nodo nuevo = new Nodo(url, fecha);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public boolean buscar(String url) {
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.url.equals(url)) {
                return true;
            }
            actual = actual.siguiente;
        }

        return false;
    }

    public void mostrarHistorial() {
        Nodo actual = cabeza;

        while (actual != null) {
            System.out.println("URL: " + actual.url + " | Fecha: " + actual.fecha);
            actual = actual.siguiente;
        }
    }

    public void eliminarHistorial() {
        cabeza = null;
    }
}


public class Main {
    public static void main(String[] args) {
        HistorialNavegacion historial = new HistorialNavegacion();

        historial.insertar("google.com", "10:00");
        historial.insertar("wikipedia.org", "10:05");
        historial.insertar("youtube.com", "10:10");

        historial.mostrarHistorial();

        System.out.println("Buscar google.com: " + historial.buscar("google.com"));

        historial.eliminarHistorial();
        System.out.println("Historial eliminado");
    }
}