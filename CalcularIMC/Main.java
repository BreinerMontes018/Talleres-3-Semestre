package CalcularIMC;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear un usuario
        Usuario usuario = new Usuario("Juan", "Pérez", "12345678", "juan.perez@example.com", "Masculino");

        // Agregar múltiples registros de IMC
        usuario.agregarIMC(70, 1.75);
        usuario.agregarIMC(72, 1.76);
        usuario.agregarIMC(68, 1.74);

        // Mostrar detalles del usuario
        System.out.println("Informacion del usuario");
        usuario.mostrarInformacionUsuario();

        // Mostrar el historial de IMC
        System.out.println("Historial de IMC:");
        usuario.mostrarHistorialIMC();
    }
}
