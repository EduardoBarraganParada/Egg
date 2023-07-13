/*Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/

package ejercicio9aprendizaje;

import Services.matematicaService;


public class Ejercicio9Aprendizaje {

   
    public static void main(String[] args) {
        matematicaService ms=new matematicaService();
        
        ms.crearObjeto();
        double mayor=ms.devolverMayor();
        System.out.println("El numero mayor entre los dos es: "+mayor);
   
        double potencia=ms.calcularPotencia();
        System.out.println("La potencia del numero mayor elevado al numero menor es: "+potencia);
        double raiz=ms.calculaRaiz();
        System.out.println("La raiz del numero menor es: "+raiz);
        
        
        
    }
    
}
