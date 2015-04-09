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
public class Docente extends Academico {

    public Docente(int code, int edad, String nombre, String lugar) {
        super(code, edad, nombre, lugar);
    }

    @Override
    public void enseñar() {

        System.out.println("  ");
    }

    @Override
    public void asistir() {

        System.out.println("   ");
    }

    @Override
    public void lista() {

    
        System.out.println("    ");
    }

    @Override
    public void reforza() {

    
        System.out.println("   ");
    }

}
