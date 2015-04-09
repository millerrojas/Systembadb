/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_09_04_2015;

/**
 *
 * @author LUIS MILLER
 */
public abstract class Academico implements Persona{
    
   int code, edad;
   String nombre,lugar;
   
   public Academico(int code, int edad, String nombre, String lugar){
       
       this.code = code;
       this.edad = edad;
       this.nombre = nombre;
       this.lugar = lugar;
       
   }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNobre() {
        return nombre;
    }

    public void setNobre(String nobre) {
        this.nombre = nobre;
    }
    
    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    
    
    public void enseña (){
        
        System.out.println("enseña en salon (clase padre) ");
   }
    public void asiste (){
        
        System.out.println("asiste (clase padre) ");
    }
    
    public void refuerza (){
        
        System.out.println("da un reforzamiento (clase padre) ");
    }
}
