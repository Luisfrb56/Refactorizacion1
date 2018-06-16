package lovivido;
/*
 * Clase en la que se visualizan los datos
 */
import javax.swing.JOptionPane;

/**
 *
 * @author LuisFernando
 */
public class Visualizar {
     Calculo calcu;
     EntregarDatos entr;
     public void visualizar() {
        /**
         * Creo una variable String que recibe un nombre por pantalla y lo
         * almacena
         */
        String nombre=entr.daNombre();
        /**
         * Creo una variable int que recibe una edad por pantalla y la almacena
         */
        int edad=entr.daEdad();
        /**
         * Se muestra por pantalla los resultados de los calculos de Meses, Días
         * y Horas, realizados en la clase Calculos
         */
        for (int i=0; i<=2; i++) {
            if (i==0) {
                JOptionPane.showMessageDialog(null, "Meses: "+calcu.calcularMeses(edad), "Numero de meses vividos de "+nombre, JOptionPane.INFORMATION_MESSAGE);
            } else if (i==1) {
                JOptionPane.showMessageDialog(null, "Días: "+calcu.calcularDias(edad), "Numero de días vividos de "+nombre, JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Horas: "+calcu.calcularHoras(calcu.calcularDias(edad)), "Numero de horas vividos de "+nombre, JOptionPane.INFORMATION_MESSAGE);

            }
        }

    }
}
