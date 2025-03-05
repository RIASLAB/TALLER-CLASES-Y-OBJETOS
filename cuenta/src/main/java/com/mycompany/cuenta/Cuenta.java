
package com.mycompany.cuenta;

import java.util.Scanner;

public class Cuenta {
    String titular;
    double total;
    double cantidad;
    double consulta;  
    
    public Cuenta(String titular) {
        this.titular = titular;
        this.total = 5000;  
        this.cantidad = 0;  
        this.consulta = this.total;  
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.total = 5000;  
        this.cantidad = cantidad;
        this.consulta = this.total;  
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getConsulta() {
        return consulta;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.total += cantidad;
            this.consulta = this.total;  
        }
    }
    
    public void retirar(double cantidad) {
        if (cantidad < 0) {
            this.total = 5000; 
        } else {
            this.total -= cantidad;
            if (this.total < 0) {
                this.total = 0;  
            }
        }
        this.consulta = this.total;  
    }

    public void consultarSaldo() {
        System.out.println("El saldo actual es: " + this.consulta);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del titular: ");
        String titular = scanner.nextLine();
        Cuenta cuenta = new Cuenta(titular);
        cuenta.consultarSaldo();
        
        System.out.print("Ingrese la cantidad a ingresar: ");
        double cantidadIngreso = scanner.nextDouble();
        cuenta.ingresar(cantidadIngreso);
        cuenta.consultarSaldo();

        System.out.print("Ingrese la cantidad a retirar: ");
        double cantidadRetiro = scanner.nextDouble();
        cuenta.retirar(cantidadRetiro);
        cuenta.consultarSaldo();

    }
}
