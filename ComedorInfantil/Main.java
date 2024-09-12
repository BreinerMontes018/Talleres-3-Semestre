package ComedorInfantil;

import java.util.Date;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        Ingrediente ingrediente1 = new Ingrediente("Tomate");
        Ingrediente ingrediente2 = new Ingrediente("Queso");
        Ingrediente ingrediente3 = new Ingrediente("Pollo");
        Ingrediente ingrediente4 = new Ingrediente("Lechuga");
        Ingrediente ingrediente5 = new Ingrediente("Pimiento");
        Ingrediente ingrediente6 = new Ingrediente("Cebolla");
        Ingrediente ingrediente7 = new Ingrediente("Pasta");
        Ingrediente ingrediente8 = new Ingrediente("Salsa de tomate");

        // Crear platos
        Plato plato1 = new Plato("Ensalada Cesar", List.of(ingrediente1, ingrediente2, ingrediente4));
        Plato plato2 = new Plato("Pizza Margarita", List.of(ingrediente1, ingrediente2, ingrediente5, ingrediente6));
        Plato plato3 = new Plato("Pasta a la Boloñesa", List.of(ingrediente7, ingrediente3, ingrediente8));

        // Crear menús
        Menu menu1 = new Menu(1, List.of(plato1, plato2));
        Menu menu2 = new Menu(2, List.of(plato3));

        // Crear personas autorizadas
        PersonaAutorizada persona1 = new PersonaAutorizada("P001","Emilia","Sanchez","Sector la maria","3117566918","Hermana");
                
        PersonaAutorizada persona2 = new PersonaAutorizada("P002", "Luis","Sanchez", "Avenida Siempre Viva 742", "987654321", "Tio");

        // Crear pagador
        PersonaPago pagador = new PersonaPago("ES1234567890123456789012","11223344C", "Carlos", "Lopez", "Calle Verdadera 456", "112233445","Padre");

        // Crear un niño
        Niño niño = new Niño("0001", "Juanito", "Perez", new Date(2015, 5, 15), new Date(2022, 9, 1), pagador, List.of(persona1, persona2));

        // Añadir alergias
        niño.agregarAlergia(ingrediente3);
        niño.agregarAlergia(ingrediente8);
        // Añadir asistencias a comidas
        AsistenciaComida asistencia1 = new AsistenciaComida(new Date(2024, 9, 1), menu1);
        AsistenciaComida asistencia2 = new AsistenciaComida(new Date(2024, 9, 2), menu2);
        niño.agregarAsistencia(asistencia1);
        niño.agregarAsistencia(asistencia2);

        // Imprimir datos
        System.out.println("Informacion del niño:");
        System.out.println(niño);

        System.out.println("\nMenus disponibles:");
        System.out.println(menu1);
        System.out.println(menu2);

        System.out.println("\nPersonas autorizadas:");
        System.out.println(persona1);
        System.out.println(persona2);

        System.out.println("\nAsistencias a comidas:");
        for (AsistenciaComida asistencia : niño.getAsistencias()) {
            System.out.println(asistencia);
        }
    }
}
