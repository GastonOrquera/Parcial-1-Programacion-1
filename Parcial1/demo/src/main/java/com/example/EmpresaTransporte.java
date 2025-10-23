package com.example;

public class EmpresaTransporte {

    private String nombre;
    private Vehiculo[] flota;
    private int cantidadVehiculos;

    public EmpresaTransporte(String nombre, int capacidadFlota) {
        this.nombre = nombre;
        this.flota = new Vehiculo[capacidadFlota];
        this.cantidadVehiculos = 0;
    }

    public void agregarVehiculo(Vehiculo v) {
        if (cantidadVehiculos < flota.length) {
            flota[cantidadVehiculos] = v;
            cantidadVehiculos++;
        } else {
            System.out.println("No se pueden agregar más vehículos, la flota está llena.");
        }
    }

    public void mostrarFlota() {
        System.out.println("Flota de " + nombre + ":");
        for (int i = 0; i < cantidadVehiculos; i++) {
            flota[i].mostrarDatos();
        }
    }

    public int calcularCapacidadTotal() {
        int total = 0;
        for (int i = 0; i < cantidadVehiculos; i++) {
            total += flota[i].getCapacidad();
        }
        return total;
    }

    public void ordenarPorCapacidad() {
        for (int i = 0; i < cantidadVehiculos - 1; i++) {
            for (int j = 0; j < cantidadVehiculos - i - 1; j++) {
                if (flota[j].getCapacidad() < flota[j + 1].getCapacidad()) {
                    Vehiculo temp = flota[j];
                    flota[j] = flota[j + 1];
                    flota[j + 1] = temp;
                }
            }
        }
    }

    public void buscarPorTipo(String tipo) {
        for (int i = 0; i < cantidadVehiculos; i++) {
            if (flota[i].getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                flota[i].mostrarDatos();
            }
        }
    }
}
