package CalcularIMC;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Usuario{

    private String nombre;
    private String apellido;
    private String cedula;
    private String email;
    private String genero;
    private List<IMC> historialIMC;

    public Usuario(String nombre, String apellido, String cedula, String email, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.email = email;
        this.genero = genero;
        this.historialIMC = new ArrayList<>();
    }

    public void agregarIMC(double peso, double altura) {
        IMC nuevoIMC = new IMC(peso, altura);
        this.historialIMC.add(nuevoIMC);
    }

    public void mostrarHistorialIMC() {
        if (historialIMC.isEmpty()) {
            System.out.println("No hay registros de IMC.");
        } else {
            for (IMC imc : historialIMC) {
                double imcCalculado = imc.calcularIMC();
                double peso = imc.getPeso();
                double altura = imc.getAltura();
                LocalDateTime fecha = imc.getFecha();
                
                System.out.printf("IMC: %.2f (Peso: %.2f kg, Altura: %.2f m, Fecha: %s)%n",
                                  imcCalculado, peso, altura, fecha);
            }
        }
    }

    public void mostrarInformacionUsuario() {
        System.out.printf("Nombre: %s %s%nCédula: %s%nEmail: %s%nGénero: %s%n",
                          nombre, apellido, cedula, email, genero);
    }
    
}