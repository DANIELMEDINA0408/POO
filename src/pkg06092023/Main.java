package pkg06092023;
import exercise.Persona;
public class Main {

    public static void main(String[] args) {
        Persona[] arrayperson = new Persona[3];
       //Persona person = new Persona("Daniel", "Medina", "1016593205");
       // Persona person2 = new Persona ("Javier", "Perez", "1456987541");
       arrayperson[0] = new Persona("Jordan", "Minota" , "1023456789"); 
       arrayperson[1] = new Persona("Daniel", "Medina" , "1023445689");
       arrayperson[2] = new Persona("Santi", "Ruiz" , "1045645689"); 
       
        for(Persona persona : arrayperson){
            System.out.println("---------------------------");
            System.out.println(persona.getNombre());
            System.out.println(persona.getApellido());
            System.out.println(persona.getDocumento());
            System.out.println("---------------------------");
        }

    }
    
}
