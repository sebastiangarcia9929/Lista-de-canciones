package sebastian.garcia.model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Cancion> canciones = new ArrayList<>();

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }
}
