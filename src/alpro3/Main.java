/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alpro3;

import alpro3.recursao.Recursao;
import alpro3.recursao.Exercicios;
/**
 *
 * @author Lorenzo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        exercicios();
    }
    
    public static void exemplo1() {
        Recursao r = new Recursao();
        int x = 10;
        System.out.println("Fatorial (" + x + "): " + r.somaIntervalo(1, 10));
    }
    
    public static void exercicios() {
        Exercicios e = new Exercicios();
        
        String s = "O rato roeu a roupa do rei de Roma";
        char[] r = e.rev(s.toCharArray());
        System.out.println(s + " -> " + String.valueOf(r));
    }
    
}
