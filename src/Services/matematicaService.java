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
package Services;

import EntidadEjercicio9.matematica;

public class matematicaService {
    
    matematica num=new matematica();
    
    public void crearObjeto(){
        
        num.setNumero1(Math.random()*10);
        System.out.println(num.getNumero1());
        num.setNumero2(Math.random()*10);
        System.out.println(num.getNumero2());
       
    }  
    
    /*a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor*/
    public double devolverMayor(){
        
        double mayor=0;
        double menor=0;
       if(num.getNumero1()>num.getNumero2()){
         mayor=num.getNumero1();
         menor=num.getNumero2();
       }else{
         menor=num.getNumero1();
         mayor=num.getNumero2(); 
       }
       
      return mayor;
      
    }    
       
    /*b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
    elevado al menor número. Previamente se deben redondear ambos valores.*/
    
    public double calcularPotencia(){
        double potencia=0;
        
        double mayor=0;
        double menor=0;
        
        num.setNumero1(Math.round(num.getNumero1()));
       
        num.setNumero2(Math.round(num.getNumero2()));
      
        
        if(num.getNumero1()>num.getNumero2()){
         mayor=num.getNumero1();
         menor=num.getNumero2();
       }else{
         menor=num.getNumero1();
         mayor=num.getNumero2(); 
       }
        System.out.println(mayor);
        System.out.println(menor);
        potencia=Math.pow(mayor,menor);
        
        return potencia;
    }
    
   /* c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/
    
    
       public double calculaRaiz(){
           
        double raiz=0;   
        double mayor=0;
        double menor=0;
        
        num.setNumero1(Math.abs(num.getNumero1()));
       
        num.setNumero2(Math.abs(num.getNumero2()));
       
        
        if(num.getNumero1()>num.getNumero2()){
         mayor=num.getNumero1();
         menor=num.getNumero2();
       }else{
         menor=num.getNumero1();
         mayor=num.getNumero2(); 
       } 
       
       raiz=Math.sqrt(mayor);
        
       return raiz;
   }
    
    
    }

