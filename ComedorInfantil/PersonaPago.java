package ComedorInfantil;

public class PersonaPago extends PersonaAutorizada {
    
    private String cuentaCorriente;

    public PersonaPago(String cuentaCorriente, String dni, String nombre, String apellido, String direccion, String telefono, String relacion) {
        super(dni, nombre, apellido, direccion, telefono, relacion);
        this.cuentaCorriente = cuentaCorriente;
    }

    public String getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(String cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    @Override
    public String toString() {
        return "PersonaPago{" + "cuentaCorriente=" + cuentaCorriente + '}';
    }
}
