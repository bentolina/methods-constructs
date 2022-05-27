package src.ar.com.ada.oop.instantiation;

public class Person {
    private String name;
    private String lastName;
    public Person(){

    }
    public Person(String name) {
        this.name = name;
    }
    public Person (String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }
    public String getName(){
        return this.name;
    }
    public String setName(){
        return this.name;
    }

    public String setLastName(){
        return this.lastName;
    }
}
