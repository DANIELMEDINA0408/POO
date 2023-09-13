package com.gamis214;


public class Main {

    public static void main(String[] args) {

        //-->Declaracion del objeto PERRO
        Animal perro = new Perro("Stich","Carnivoro",15,"Doberman");
        perro.Alimentarse();
        //-->Declaracion de otro objeto PERRO
        Perro perro1 = new Perro("Teddy","Croquetas",10,"Chihuahua");
        perro1.Alimentarse();
        //-->Declaracion del objeto Gato
        Animal gato = new Gato("Pelusa","Galletas",15,"Siames");
        gato.Alimentarse();
        //-->Declaracion del objeto Caballo
        Animal caballo = new Caballo("Spark","Pasto",25,"Fino");
        caballo.Alimentarse();
        //-->Declaracion del objeto Gato
        Animal castor = new Castor("Perry","Madera",15,"Castor");
        castor.Alimentarse();
        Animal lobo = new Lobo("Bolt","Carne",15,"Pardo");
        lobo.Alimentarse();
        Animal lobo1 = new Lobo("Thanos","Carne",15,"Rojo");
        lobo1.Alimentarse();

    }
}