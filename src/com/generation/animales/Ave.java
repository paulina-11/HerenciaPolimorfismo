package com.generation.animales;

//poner extends para que herede de animal
public class Ave extends  Animal{

    private int alas;
    private int patas;
    private boolean vuela;

    public Ave (){
        super();
    }

    //constructor
    public Ave(String nombre){
        //llama a los contructores padre con super
        super(nombre);
        System.out.println("Constructor hijo");
    }


    public void hacerNido(){
        System.out.println("Estoy haciendo mi nido");
    }
    public void  ponerHuevo(){
        System.out.println("Estoy poniendo un huevo");
    }

    @Override
    public void comer() {
        System.out.println("Comiendo alpiste");
    }

    @Override
    public void respirar() {
        System.out.println("Respirar por el pico");
    }
}
