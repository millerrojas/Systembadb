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
public class Gerente extends Administrativo{

    
     public Gerente(int dni, int edad, String nombre, String apellidos) {
        super(dni,edad, nombre, apellidos);
        } 

    @Override
    public void enseñar() {

        System.out.println("   ");
    }

    @Override
    public void asistir() {

        System.out.println("   ");
    }

    @Override
    public void lista() {

        System.out.println("   ");
    }

    @Override
    public void reforza() {

        System.out.println("   ");
    }

    @Override
    public void Administrador() {
        System.out.println("Administra (clae hija)  ");
    }

    @Override
    public void cajero() {
        System.out.println("recibe dinero (clae hija)  ");
    }

    @Override
    public void contador() {
      System.out.println("cuenta dinero (clae hija)  ");  
    }

    @Override
    public void seguridad() {
        System.out.println("cuida (clae hija)  ");
    }
    
}
