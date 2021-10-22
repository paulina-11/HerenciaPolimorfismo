package com.generation.animales;

public class Perro extends  Animal{
    private int patas;
    private boolean cola;
    private String raza;

    //el constructor se dispara cuando creamos un objeto

    public Perro (String nombre){
        super("nombre");

    }

    //metodos

    public void jugar(){
        System.out.println("Estoy jugando");
    }
    public void ladrar(){
        System.out.println("Goff goff");
    }

    //aqui se modifica el método de la clase Animal
    //se hace sobre la clase
    @Override
    public void comer(){
        System.out.println("Comiendo croquetas");
    }

    @Override
    public void respirar() {
        System.out.println("Respirar por los pulmones");
    }

}
