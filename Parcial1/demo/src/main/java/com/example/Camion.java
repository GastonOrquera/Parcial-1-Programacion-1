package com.example;

public class Camion extends Vehiculo {
    double capacidadCarga;

    public Camion(String marca, double capacidadCarga){
        super(marca);
        this.capacidadCarga = capacidadCarga;
    }

     public void mostrarDatos(){
        System.out.println("Camion: [" + getMarca() + "]" + " - Capacidad de carga: [" + capacidadCarga + "] toneladas");
    }

}
