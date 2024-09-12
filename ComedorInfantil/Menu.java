package ComedorInfantil;

import java.util.List;

public class Menu {
    
    private int numeroMenu;
    private List<Plato> platos;

    public Menu(int numeroMenu, List<Plato> platos) {
        this.numeroMenu = numeroMenu;
        this.platos = platos;
    }

    public int getNumeroMenu() {
        return numeroMenu;
    }

    public void setNumeroMenu(int numeroMenu) {
        this.numeroMenu = numeroMenu;
    }

    public List<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(List<Plato> platos) {
        this.platos = platos;
    }

    @Override
    public String toString() {
        return "Menu{" + "numeroMenu=" + numeroMenu + ", platos=" + platos + '}';
    }
}
