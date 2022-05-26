package src;

import src.ar.com.ada.oop.instantiation.Person;
import src.ar.com.ada.oop.overloading.Arithmetic;

public class App {
    public static void main(String[] args) {
        System.out.println("App mothods constructs");

        Person daniela = new Person( "Daniela");
        System.out.println("El nombre es: " + daniela.getName());
        Person pablo = new Person("Pablo");
        pablo.setName();
        Person belen = new Person("Belén", "Comas");
        belen.setLastName();

        Arithmetic suma = new Arithmetic(12, 12);
        System.out.println("el resultado es " + suma.Sum());


    }
}