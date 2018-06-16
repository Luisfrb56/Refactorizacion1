package lovivido;
/*
 * Clase que pide los datos del usuario y los devuelve
 */
import javax.swing.JOptionPane;
/**
 *
 * @author LuisFernando
 */
public class EntregarDatos {
    /**
     * Metodo que pide el nombre del usuario
     *
     * @return String nombre
     */
    public String daNombre() {

        return JOptionPane.showInputDialog("Escribe tu nombre: ");
    }
    /**
     * Metodo que pide el edad del usuario
     *
     * @return int edad
     */
    public int daEdad() {

        return Integer.parseInt(JOptionPane.showInputDialog("Escribe tu edad: "));
    }
}
