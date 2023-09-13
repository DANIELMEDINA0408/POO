package geometria.formastrigonometricas;

public class Formastrigonometricas {

    public static void main(String[] args) {
     
        Circulo circulo = new Circulo(20.0);

        
        double areaCirculo = circulo.calcularArea();
        System.out.println("Área del círculo: " + areaCirculo);

       
        Cuadrado cuadrado = new Cuadrado(10.0);

        
        double areaCuadrado = cuadrado.calcularArea();
        System.out.println("Área del cuadrado: " + areaCuadrado);

        
        Triangulo triangulo = new Triangulo(6.0, 8.0);
        double areaTriangulo = triangulo.calcularArea();
        System.out.println("Área del triángulo: " + areaTriangulo);
    }
}


class Cuadrado extends FormaGeometrica {
    private final double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
    

abstract class FormaGeometrica {
    
    public abstract double calcularArea();
}


class Circulo extends FormaGeometrica {
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
 