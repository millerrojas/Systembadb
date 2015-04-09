/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_09_04_2015;

import java.util.ArrayList;

/**
 *
 * @author LUIS MILLER
 */
public class Practica_09_04_2015 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Academico> grupoa = new ArrayList<Academico>();
    public static ArrayList<Administrativo> grupob = new ArrayList<Administrativo>();
    public static void main(String[] args) {
       
        Academico fa = new Docente(1234,18," ANGEL "," HUATAY ");
        Academico fb = new Coordinador(4321,18," CESAR "," PEREZ ");
        Academico fc = new Director_Academico(5678,18," DANIEL "," CUEVA ");
        Administrativo fd = new Gerente(87654,18," ALCIDEZ "," ZUMBA ");
        Administrativo fe = new Tesorero(98765,18," JHON "," ROJAS ");
        Administrativo ff = new Contador(34569,18," MARIA "," GUERRA ");
        Administrativo fg = new Jefe_Area(12985,18," SUSANA "," BECERRA ");
        
        grupoa.add(fa);
        grupoa.add(fb);
        grupoa.add(fc);
        grupob.add(fd);
        grupob.add(fe);
        grupob.add(ff);
        grupob.add(fg);
        
        System.out.println("desarrolan sus labores ");
		for (Academico jaural : grupoa) {
			System.out.print(jaural.getNobre() + " " + jaural.getEdad()+"--> ");
                        jaural.enseña();
		}
        System.out.println("ADMINISTRADOR  ");
		for (Administrativo jaurall : grupob) {
			System.out.print(jaurall.getApellidos() + " " + jaurall.getDni()+"--> ");
                        jaurall.Administrador();
		}
                System.out.println("TESORERO ");
		for (Administrativo jaurall : grupob) {
			System.out.print(jaurall.getApellidos() + " " + jaurall.getDni()+"--> ");
                        jaurall.cajero();
		}
    }
    
}
