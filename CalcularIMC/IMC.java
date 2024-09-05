package CalcularIMC;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IMC {

    private double peso;
    private double altura;
    private LocalDateTime fecha;

    public IMC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
        this.fecha = LocalDateTime.now(); // Fecha y hora actual por defecto
    }

    public IMC(double peso, double altura, LocalDateTime fecha) {
        this.peso = peso;
        this.altura = altura;
        this.fecha = fecha;
    }

    public double calcularIMC() {
        if (altura <= 0) {
            throw new IllegalArgumentException("La altura debe ser mayor que cero.");
        }
        return peso / (altura * altura);
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

}
