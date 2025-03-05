
package com.mycompany.persona;

public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println("el nombre de la persona es: " + nombre);
        System.out.println("la edad de la persona es: " + edad);
    }

    public void correr() {
        System.out.println("soy " + nombre + " y tengo " + edad + " y he corrido mucho");
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Paulo", 21);
        persona1.correr();
        persona1.mostrar();
    }
}
