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
//        ex1();
//        ex2();
//        ex3();
//        ex4();
//        ex5();
//        ex6();
//        ex7();
//        ex8();
        ex9();
    }
    
    
    
    private static void ex1()
    {
        Exercicios e = new Exercicios();
        int x = 5;
        System.out.println("Ex1: Fatorial");
        System.out.println(e.fatorial(x));
    }
    
    private static void ex2()
    {
        Exercicios e = new Exercicios();
        int x = 5;
        int y = 6;
        System.out.println("Ex2: Somatório");
        System.out.println(e.soma(x, y));
    }
    
    private static void ex3()
    {
        Exercicios e = new Exercicios();
        int x = 2;
        int y = 6;
        System.out.println("Ex3: Potência x^y");
        System.out.println(e.pow(x, y));
    }
    
    private static void ex4()
    {
        Exercicios e = new Exercicios();
        int x = 2;
        int y = 6;
        System.out.println("Ex4: Multiplicação");
        System.out.println(e.mult(x, y));
    }
    
    private static void ex5()
    {
        Exercicios e = new Exercicios();
        System.out.println("Ex5: Palíndromo versao 1");
        char[] t1 = "1000".toCharArray();
        char[] t2 = "101".toCharArray();
        System.out.println(e.pal(1, t1) + " -> " + e.pal(1, t2));
        System.out.println("Ex5: Palíndromo versao 2");
        System.out.println(e.pal(2, t1) + " -> " + e.pal(2, t2));
    }
    
    private static void ex6()
    {
        Exercicios e = new Exercicios();
        int x = 7;
        System.out.println("Ex6: Numero de Uns");
        System.out.println(e.numerodeuns(x));
    }
    
    private static void ex7()
    {
        Exercicios e = new Exercicios();    
        String s = "O rato roeu a roupa do rei de Roma";
        char[] r = e.rev(s.toCharArray());
        System.out.println("Ex7: Reverte palavras em string");
        System.out.println(s + " -> " + String.valueOf(r));
    }
    
    private static void ex8()
    {
        Exercicios e = new Exercicios();
        int x = 2;
        int y = 6;
        System.out.println("Ex8: Potência v2");
        System.out.println(e.pow2(x, y));
    }
    
    private static void ex9()
    {
        Exercicios e = new Exercicios();
        int x = 10;
        float n = 0.275f;
        System.out.println("Ex9: Frações");
        e.fracoes(n, x);
        System.out.println();
    }
    
}
