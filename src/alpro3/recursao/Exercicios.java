/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alpro3.recursao;

/**
 *
 * @author Lorenzo
 */
public class Exercicios {
    
    // Exercício 1
    public int fatorial(int n)
    {
        return fat(n, "");
    }
    
    private int fat(int n, String s) {
        if (n == 0) return 1;
        System.out.println(s + "Fatorial de " + n);
        int res = n * fat(n-1, "  " + s);
        System.out.println(s + "Retorna " + res);
        
        return res;
    }
    
    
    // Exercício 2;
    public int soma(int i, int j) {
        if (i == j) return i;
        int m = (i + j) / 2;
        return soma(i, m) + soma(m+1, j);
    }
    
    // Exercício 3;
    public int pow(int x, int n) 
    {        
        if (n == 0) return 1;
        if (x == 0 || x == 1) return x;
        return x * pow(x, n-1);
    }
    
    // Exercicio 4;
    public int mult(int i, int j)
    {
        if (j == 0) return 1;
        if (j == 1) return i;
        return i + mult(i, j-1);
    }
    
    // Exercício 5;
    public boolean pal (int versao, char[] txt) {
        if (versao == 1) return pal1(txt, 0, txt.length);
        else if (versao == 2) return pal2(txt);
        else return false;
    }
    
    public boolean pal1(char[] txt, int i, int j)
    {
        if (i >= j) return true;
        if (txt[i] != txt[j]) return false;
        return pal1(txt, i+1, j-1);
    }
    
    public boolean pal2(char[] txt)
    {
        if (txt.length <= 1) return true;
        if (txt[0] != txt[txt.length-1]) return false;
        
        char[] substring = new char[txt.length-2];        
        for (int i = 1; i < txt.length; i++) substring[i] = txt[i];
        
        return pal2(substring);
    }
    
    
    // Exercício 6;
    public int numerodeuns(int n)
    {
        if (n == 0) return 0;
        return (n % 2 == 0) ? numerodeuns(n / 2) : 1 + numerodeuns(n / 2);
    }
    
    // Exercício 7:
    public char[] rev (char[] txt)
    {
        return rev(txt, 0, 0);
    }

    private char[] rev(char[] txt, int i, int j)
    {
        if (j >= txt.length) {
            txt = revert(txt, i, j-1);
            return txt;
        }
        if (txt[j] != ' ') return rev(txt, i, j+1);
        
        txt = revert(txt, i, j-1);
        return rev(txt, j+1, j+1);
    }
    
    private char[] revert(char[] txt, int i, int j)
    {
        if (i > j) return txt;
        char c = txt[i];
        txt[i] = txt[j];
        txt[j] = c;
        return revert(txt, i+1, j-1);
    }

    // Exercício 8:
    public int pow2(int x, int n) {
        if (n == 0) return 1;
        if (x == 0 || x == 1) return x;
        if (n % 2 == 0) return pow2(x, n/2) * pow2(x, n/2);
        return x * pow2(x, n/2) * pow2(x, n/2);
    }
    
    // Exercicio 9;
    
    
    
    
    
    
    
    
    
            
}



