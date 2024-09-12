package ComedorInfantil;

import java.util.Date;

public class AsistenciaComida {
    private Date fecha;
    private Menu menuConsumido;

    // Constructor
    public AsistenciaComida(Date fecha, Menu menuConsumido) {
        this.fecha = fecha;
        this.menuConsumido = menuConsumido;
    }

    // Getter y Setter
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Menu getMenuConsumido() {
        return menuConsumido;
    }

    public void setMenuConsumido(Menu menuConsumido) {
        this.menuConsumido = menuConsumido;
    }

    @Override
    public String toString() {
        return "AsistenciaComida{" + "fecha=" + fecha + ", menuConsumido=" + menuConsumido + '}';
    }
    
}
