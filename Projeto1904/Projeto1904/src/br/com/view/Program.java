package br.com.view;

import br.com.controller.Perfil;
import br.com.controller.Produto;
import br.com.controller.Usuario;
import br.com.controller.Usuario_Perfil;
import br.com.controller.Usuario_Produto;

public class Program {

    public static void main(String[] args) {
        Usuario_Perfil ligacao1
                = new Usuario_Perfil(
                        1,
                        new Usuario(
                                1,
                                "Kauã Otaviano",
                                123456,
                                "123987",
                                true
                        ),
                        new Perfil(
                                1,
                                "Perfil 1",
                                true
                        )
                );

        Usuario_Produto ligacao2
                = new Usuario_Produto(
                        1,
                        new Usuario(
                                1,
                                "Kauã Otaviano",
                                123456,
                                "123987",
                                true
                        ),
                        new Produto(
                                1,
                                "Produto Legal",
                                true
                        )
                );
        
        System.out.println(ligacao1);
        System.out.println(ligacao2);
    }
}
