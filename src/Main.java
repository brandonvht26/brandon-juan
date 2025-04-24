//clase vehiculo de 4 atributos
//2 métodos, información del vehiculo, y frenar
//crear 3 objetos

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Definir objeto Scanner

        System.out.print("\n--- Bienvenido al sistema de ingreso de coches --- \n");

        // Registro de objetos

        System.out.print("\nIngrese la marca del vehiculo: ");
        String marca = sc.nextLine();
        System.out.print("Ingrese el modelo del vehiculo: ");
        String placa = sc.nextLine();
        System.out.print("Ingrese la placa del vehiculo: ");
        String modelo = sc.nextLine();
        System.out.print("Ingrese el valor del vehiculo: ");
        double precio = sc.nextDouble();
        sc.nextLine();
        System.out.print("\n¡Registro exitoso!\n");

        Carro car = new Carro(marca, precio, modelo, placa);

        System.out.print("\nIngrese la marca del vehiculo: ");
        marca = sc.nextLine();
        System.out.print("Ingrese el modelo del vehiculo: ");
        placa = sc.nextLine();
        System.out.print("Ingrese la placa del vehiculo: ");
        modelo = sc.nextLine();
        System.out.print("Ingrese el valor del vehiculo: ");
        precio = sc.nextDouble();
        sc.nextLine();
        System.out.print("\n¡Registro exitoso!\n");

        Carro car2 = new Carro(marca, precio, modelo, placa);

        System.out.print("\nIngrese la marca del vehiculo: ");
        marca = sc.nextLine();
        System.out.print("Ingrese el modelo del vehiculo: ");
        placa = sc.nextLine();
        System.out.print("Ingrese la placa del vehiculo: ");
        modelo = sc.nextLine();
        System.out.print("Ingrese el valor del vehiculo: ");
        precio = sc.nextDouble();
        sc.nextLine();
        System.out.print("\n¡Registro exitoso!\n");

        Carro car3 = new Carro(marca, precio, modelo, placa);

        // Metodos

        car.mostrarInformacion();
        car2.mostrarInformacion();
        car3.mostrarInformacion();

        car.frenar();
        car2.frenar();
        car3.frenar();

        sc.close();
    }
}