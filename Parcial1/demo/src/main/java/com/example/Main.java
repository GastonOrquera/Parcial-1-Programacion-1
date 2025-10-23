package com.example;

public class Main {
    public static void main(String[] args) {

        EmpresaTransporte empresa = new EmpresaTransporte("Transporte Sur", 5);

        Auto a1 = new Auto("Toyota", 5);
        Auto a2 = new Auto("Ford", 4);
        Vehiculo v1 = new Vehiculo("AAA111", "Mercedes", 40);
        Vehiculo v2 = new Vehiculo("BBB222", "Scania", 60);

        empresa.agregarVehiculo(a1);
        empresa.agregarVehiculo(a2);
        empresa.agregarVehiculo(v1);
        empresa.agregarVehiculo(v2);

        System.out.println("\nFlota inicial\n");
        empresa.mostrarFlota();

        System.out.println("\nCapacidad total: " + empresa.calcularCapacidadTotal());

        empresa.ordenarPorCapacidad();
        System.out.println("\n---- Flota ordenada por capacidad ----");
        empresa.mostrarFlota();

        System.out.println("\n---- Buscar por tipo Auto ----");
        empresa.buscarPorTipo("Auto");
    }
}


