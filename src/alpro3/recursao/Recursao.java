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
public class Recursao {
    
    
    public int fatorial(int n)
    {
        if (n == 0) return 1;
        return n * fatorial(n-1);
    }
    
    public long fatorial(long n)
    {
        if (n == 0) return 1;
        return n * fatorial(n-1);
    }
    
    public int fat(int n)
    {
        if (n <= 0) return 1;
        return n * fat(n-1) * fat(n-2);
    }
    
    public int soma(int n)
    {
        if (n == 0) return 0;
        return n + soma(n-1);
    }
    
    
    public int somaIntervalo(int x, int y)
    {
        if (x == y) return x;
        int n = (x+y) / 2;
        return somaIntervalo(x, n) + somaIntervalo(n+1, y);
    }
}
