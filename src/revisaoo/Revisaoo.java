package  Revisaoo;
import  java.util.Scanner;

//Author. Edson 
public  class  Revisaoo {

    public  static  void  main ( String [] args ) {
        // variavel
        distância dupla , consumo, pagamento, valor;
        String local;
        // scanner
        Scanner entrada =  novo  Scanner ( Sistema . In);
        // Sistema
        Sistema . para fora . println ( " Qual o local que você ira? " );
        local = entrada . nextLine ();

        Sistema . para fora . println ( " Qual o consumo por l do seu carro? " );
        consumo = entrada . nextDouble ();

        Sistema . para fora . println ( " Qual a distancia em km que você ira percorer? " );
        distancia = entrada . nextDouble ();

        Sistema . para fora . println ( " Qual o preço do combustivel? " );
        valor = entrada . nextDouble ();
        // calculo consumo
        pagar = (distancia / consumo) * valor;
        // codigo que ira dizer quanto você ira consumir
        Sistema . para fora . println ( " Para você chegar a "  + local +  " você irá gastar "  + pagar +  " reais! " );

    }

}