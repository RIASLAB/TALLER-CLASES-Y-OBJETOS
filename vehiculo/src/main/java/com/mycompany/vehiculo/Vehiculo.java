
package com.mycompany.vehiculo;

public class Vehiculo {
    String empresa;
    int pasajeros;
    int capacidad;
    int cantidad;
    
    public Vehiculo(String empresa, int pasajeros, int capacidad, int cantidad) {
        this.empresa = empresa;
        this.pasajeros = pasajeros;
        this.capacidad = capacidad;
        this.cantidad = cantidad;
    }

    public int calcular() {
        return capacidad * cantidad;
    }

    public void mostrar(String tipo) {
        System.out.println("La " + tipo + " de la empresa " + empresa + 
                " puede llevar " + pasajeros + " pasajeros con un rango de " + 
                calcular() + " millas");
    }

    public static void main(String[] args) {
        Vehiculo minivan = new Vehiculo("Cootranar", 11, 29, 14);
        Vehiculo duobus = new Vehiculo("Trans Arauca", 40, 28, 35);

        minivan.mostrar("Minivan");
        duobus.mostrar("Duobus");
    }
}
