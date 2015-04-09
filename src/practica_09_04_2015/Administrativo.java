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
public abstract class Administrativo implements Persona {
    
    
        int dni, edad;
	String nombre,apellidos;
    
        public Administrativo(int dni, int edad, String nombre, String apellidos){
         
            this.dni = dni;
            this.edad = edad;
            this.nombre = nombre;
            this.apellidos = apellidos;
        }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
        
        
        
        public abstract void Administrador ();
        public abstract void cajero ();
        public abstract void contador ();
        public abstract void seguridad ();
}
