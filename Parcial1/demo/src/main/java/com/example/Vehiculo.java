package com.example;

public class Vehiculo {
    private String patente;
    private String marca;
    private int capacidad;

    public Vehiculo(String patente, String marca, int capacidad){
      this.patente = patente;
      this.marca = marca;
      this.capacidad = capacidad;
    }

    public Vehiculo(String marca){
        this.marca = marca;
    }

    public String getPatente(){
        return patente;
    }

    public void setPatente(String patente){
        this.patente = patente;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public int getCapacidad(){
        return capacidad;
    }

    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }

    public void mostrarDatos(){
        System.out.println("Vehiculo: [" + patente + "] -" + " [" + marca + "] - " + "Capacidad: [" + capacidad + "]");
    }


}
