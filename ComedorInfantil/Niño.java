package ComedorInfantil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Niño {
    
    private String numeroMatricula;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private Date fechaIngreso;
    private Date fechaBaja;
    private List<Ingrediente> alergias;
    private PersonaPago pagador;
    private List<PersonaAutorizada> personasAutorizadas;
    private List<AsistenciaComida> asistencias;
    

    public Niño(String numeroMatricula, String nombre, String apellido, Date fechaNacimiento, Date fechaIngreso, PersonaPago pagador, List<PersonaAutorizada> personasAutorizadas) {
            this.numeroMatricula = numeroMatricula;
            this.nombre = nombre;
            this.apellido = apellido;
            this.fechaNacimiento = fechaNacimiento;
            this.fechaIngreso = fechaIngreso;
            this.pagador = pagador;
            this.personasAutorizadas = personasAutorizadas;
            this.alergias = new ArrayList<>();
            this.asistencias = new ArrayList<>();
        }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public List<Ingrediente> getAlergias() {
        return alergias;
    }

    public void setAlergias(List<Ingrediente> alergias) {
        this.alergias = alergias;
    }
    
    public void agregarAlergia(Ingrediente ingrediente) {
        alergias.add(ingrediente);
    }

    public PersonaPago getPagador() {
        return pagador;
    }

    public void setPagador(PersonaPago pagador) {
        this.pagador = pagador;
    }

    public List<PersonaAutorizada> getPersonasAutorizadas() {
        return personasAutorizadas;
    }

    public void setPersonasAutorizadas(List<PersonaAutorizada> personasAutorizadas) {
        this.personasAutorizadas = personasAutorizadas;
    }

    public List<AsistenciaComida> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(List<AsistenciaComida> asistencias) {
        this.asistencias = asistencias;
    }
    
    public void agregarAsistencia(AsistenciaComida menu) {
        asistencias.add(menu);
    }

    @Override
    public String toString() {
        return "Ni\u00f1o{" + "numeroMatricula=" + numeroMatricula + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", fechaIngreso=" + fechaIngreso + ", fechaBaja=" + fechaBaja + ", alergias=" + alergias + ", pagador=" + pagador + ", personasAutorizadas=" + personasAutorizadas + ", asistencias=" + asistencias + '}';
    }
}
