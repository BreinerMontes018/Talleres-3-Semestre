package ComedorInfantil;

import java.util.List;

public class Plato {
     private String nombre;
    private List<Ingrediente> ingredientes;

    // Constructor
    public Plato(String nombre, List<Ingrediente> ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    // Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Plato{" + "nombre=" + nombre + ", ingredientes=" + ingredientes + '}';
    }
}
