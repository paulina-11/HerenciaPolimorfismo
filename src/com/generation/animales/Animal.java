package com.generation.animales;

public abstract class Animal {

    //atributos
    protected String nombre;
    protected int edad;

    //constructor PADRE
    public Animal(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Animal(String nombre){
        this.nombre = nombre;
        System.out.println("Constructor padre");
    }
    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad =edad;
        System.out.println("Constructor padre");
    }
    //métodos

    public void comunicarse(){
        System.out.println("Hola");
    }
    public void comer(){
        System.out.println("Estoy comiendo");
    }

    //para que una clase sea abstracta debe tener un metodo abstracto
    //metodo abstracto
    //defino metodo respirar pero no le digo como va funcionar

    public abstract void respirar();

}
