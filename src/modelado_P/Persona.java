package modelado_P;

import java.util.Date;
/**
 *
 * @author Oye MacDonald
 */
public class Persona {

    //Variables y tipos de datos que se necesitan de la persona.
    String nombre, apellido, cedula;
    int fechaNac;
    String regionActual;
    char genero;

    //Constructor de la clase Persona.
    public Persona(String nombre, String apellido, String cedula, int fechaNac, String regionActual, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.fechaNac = fechaNac;
        this.regionActual = regionActual;
        this.genero = genero;
    }
    
    //Metodo para imprimer en pantalla(Consola).
    public void Imprimir(){
        //Se usa (\n) para los saltos de linea.
        //El resto es diseño en consola.
        System.out.println("Nombre   : " + nombre 
                        + "\nApellido : " + apellido 
                        + "\nCedula   : " + cedula 
                        + "\nAño      : " + fechaNac
                        + "\nPais     : " + regionActual 
                        + "\nGenero   : " + genero
                        + "\nEdad     : " + getDeterminarEdad());
        System.out.println("---------------------------------------------------");
    }
    
    //Metodo que retorna la edad de la persona, importando la libreria Date  para utilizar la instancia getYear(Año).
    public int getDeterminarEdad(){
        Date ac = new Date();
        int fechaActual = ac.getYear();
        return (fechaActual + 1900) - fechaNac;
    }
    
}
