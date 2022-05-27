package src;

import src.ar.com.ada.oop.instantiation.Person;
import src.ar.com.ada.oop.overloading.Arithmetic;

public class App {
    public static void main(String[] args) {
        System.out.println("App mothods constructs");

        /*Person daniela = new Person( "Daniela");
        System.out.println("El nombre es: " + daniela.getName());
        Person pablo = new Person("Pablo");
        System.out.println("El nombre es: " +  pablo.setName());
        Person belen = new Person("Belén", "Comas");
        System.out.println("El apellido es: " + belen.setLastName());*/

        Arithmetic calculador = new Arithmetic();
        calculador.sum(2,3);
        calculador.sum(2.5,3.5);



    }
}