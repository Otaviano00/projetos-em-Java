
package br.com.view;

import br.com.controller.AplicacaoPratica;
import br.com.controller.Circulo;
import br.com.controller.Matematica;
import br.com.controller.Quadrado;
import br.com.controller.Retangulo;

public class Program {
    public static void main(String[] args) {
        Matematica disciplina1 = 
                new Matematica(
                        "Matemática",
                        1000.0,
                        new AplicacaoPratica(
                                "Uma matétia muito foda de se aprender",
                                new Circulo(5.0, "Círculo do Jorge"),
                                new Retangulo(10.0, 5.0, "Retângulo do Kauã"),
                                new Quadrado(20.0, "Quadrado legal")
                        )
                );
        
        System.out.println(disciplina1);
    }
}
