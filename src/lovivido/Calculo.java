/*
 * Clase que realiza los calculos de meses vividos, días vividos y horas vividas
 */
package lovivido;

 /**
 *
 * @author LuisFernando
 */
public class Calculo {
 /**
     * Metodo que calcula los meses vividos,recibiendo la edad de la persona
     *
     * @return Un entero con la cantidad de meses vividos
     */
    public int calcularMeses(int edad) {
        return (edad*12);
    }
    /**
     * Metodo que calcula los días vividos,recibiendo la edad de la persona
     *
     * @return Un entero con la cantidad de días vividos
     */
    public int calcularDias(int edad) {
        return (edad*365);
    }
    /**
     * Metodo que calcula las horas vividas,recibiendo los días de la persona (
     * se calcula del metodo calDias)
     *
     * @return Un entero con la cantidad de horas vividas
     */
    public int calcularHoras(int dias) {
        return (dias*24);
    }
}
