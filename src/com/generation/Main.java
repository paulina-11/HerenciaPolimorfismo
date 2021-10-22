package com.generation;

import com.generation.animales.Ave;
import com.generation.animales.Perro;

public class Main {

    public static void main(String[] args) {

        //ave hereda de animal y por eso sale el saludo
        Ave ave = new Ave("petirojo");
        System.out.println(ave.getNombre());
        Ave ave2 = new Ave();
	    ave.comunicarse();
	    ave.hacerNido();
	    ave.comer();

        System.out.println("---------------------");

	    Perro lomito = new Perro("pulgas");
        lomito.jugar();
        lomito.comer();
    }
}
