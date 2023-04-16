package modelado_P;

/**
 *
 * @author Oye MacDonald
 */
public class C_Principal {
    
    public static void main(String[] args) {
        //Se invoca la clase Persona para llamar su metodo Imprimir y mostrarlos.
        //Esta es la clase main(Principal), si no se llama la clase Persona ala clase Main no se mostrara nada.
        Persona persona = new Persona("Kenny Antonio", "Tellez Obando", "365-240904-1001A", 2004, "Nicaragua", 'H');
        persona.Imprimir();
        
        Persona persona_uno = new Persona("Oneyker Galiano", "Reyes Montiel", "367-200404-1002M", 2003, "Peru", 'H');
        persona_uno.Imprimir();
    }
}
