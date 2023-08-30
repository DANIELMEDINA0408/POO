package com.mycompany.exercise_class;
import call.unicauca.edu.co.ex_atrr;

public class Exercise_class {

    public static void main(String[] args) {
        ex_atrr content = new ex_atrr();
        System.out.println("Acces var: ");
        System.out.println("Name import:" + ex_atrr.name);
        System.out.println("Name import:" + ex_atrr.year_hbd);
        atrr.name = "camilo";
        System.out.println("cambiamos nombre "+ ex_atrr.name);
        
    }
}
