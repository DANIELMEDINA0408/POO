package com.mycompany.mavenproject1;

import static spark.Spark.*;

/**
 *
 * @author IngSis
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
        get("/hola", (req, res) -> "Hola Mundo");
        get("/casino", (req, res) -> "Almacena 200 Usuarios");
        get("/nicolle", (req, res) -> "Perdió Mecánica conmigo :)");
        get("/ricardo", (req, res) -> "a Ricardo le encata la...");
        get("/casa", (req, res) -> """
                                   \u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2584\u2593\u2584\u2591\u2591\u2591
                                   \u2591\u2591\u2591\u2591\u2584\u2588\u2584\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2584\u2593\u2593\u2593\u2584\u2591\u2591
                                   \u2591\u2591\u2584\u2588\u2588\u2588\u2588\u2588\u2584\u2591\u2591\u2591\u2591\u2591\u2584\u2593\u2593\u2593\u2593\u2593\u2584\u2591
                                   \u2591\u2580\u2588\u2588\u253c\u2588\u253c\u2588\u2588\u2580\u2591\u2591\u2591\u2584\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2584
                                   \u2584\u2584\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2584\u2584\u2584\u2584\u2584\u2584\u2584\u2584\u2588\u2584\u2584\u2584\u2584""");
        get("/sumar/:a/:b", (req, res) -> {
            int parametroA = Integer.parseInt(req.params(":a"));
            int parametroB = Integer.parseInt(req.params(":b"));

            return sum(parametroA, parametroB);
            
        });
    }
    /**
     *
     * @param a
     * @param b
     * @return
     */
    private static int sum(int a, int b){
        return a+b;
    }
}
