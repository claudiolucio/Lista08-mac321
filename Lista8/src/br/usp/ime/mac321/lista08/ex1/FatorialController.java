package br.usp.ime.mac321.lista08.ex1;

import java.math.BigDecimal;

public class FatorialController {
    public static BigDecimal calculaFatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Números negativos são entradas inválidas .");
        }
        
        BigDecimal fatorial = BigDecimal.ONE;
        for (int i = 2; i <= numero; i++) {
            fatorial = fatorial.multiply(BigDecimal.valueOf(i));
        }
        return fatorial;
    }
}
