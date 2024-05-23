package br.usp.ime.mac321.lista08.extra;

public class ComparaTempo {
    public static void main(String[] args) {
        int iterações = 10000;
        long startTime, endTime, elapsedTime1, elapsedTime2;
        double ratio;

        startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < iterações; i++) {
            str += "a";
        }
        endTime = System.nanoTime();
        elapsedTime1 = endTime - startTime;
        System.out.println("Tempo pela classe String: " + elapsedTime1 + " ns");

        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterações; i++) {
            stringBuffer.append("a");
        }
        endTime = System.nanoTime();
        elapsedTime2 = endTime - startTime;
        System.out.println("Tempo pela classe StringBuffer: " + elapsedTime2 + " ns");
        
        ratio = (double) elapsedTime1 / elapsedTime2;
        String formatRatio = String.format("%.2f", ratio);
        System.out.println("StringBuffer foi " + formatRatio + " vezes mais rápido que String.");
        
    }
}
/* StringBuffer é mais eficiente que String para concatenar strings em Java devido à diferença em como elas gerenciam a memória. 
String é imutável, o que significa que cada concatenação cria um novo objeto e copia os dados. Já o StringBuffer é mutável
e pode alterar seu conteúdo sem criar novos objetos, o que o faz mais rápido pra concatenar as strings.*/