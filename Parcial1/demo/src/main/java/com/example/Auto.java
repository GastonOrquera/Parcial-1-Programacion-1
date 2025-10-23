package com.example;

public class Auto extends Vehiculo {

    int cantidadPasajeros;

    public Auto(String marca, int cantidadPasajeros) {
        super(marca);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public void mostrarDatos(){
        System.out.println("Auto: [" + getMarca() + "]" + " - Pasajeros: [" + cantidadPasajeros + "]");

    }

}
