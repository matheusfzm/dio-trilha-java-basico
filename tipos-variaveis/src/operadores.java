public class operadores {
    public static void main(String[] args) {
        //Aula de operadores

        //int modulo = 18 % 5; modulo é o resto de uma divisão
        //System.out.println(modulo);

// concatenação de string
        
        //String nomeCompleto = "Matheus" + "Macedo";
        //System.out.println(nomeCompleto);
        //String concatenacao = "?";

        //concatenacao = 1+1+1+"1";

       // System.out.println(concatenacao);

       // concatenacao = 1+"1"+1+1;

       // System.out.println(concatenacao);

       // concatenacao = 1+"1"+1+"1";

       // System.out.println(concatenacao);

       // concatenacao = "1"+1+1+1;

       // System.out.println(concatenacao);

       //concatenacao = "1"+(1+1+1);

        //System.out.println(concatenacao);


    //operadores unarios


        //int numero = 5;

       // numero = - numero;


        //System.out.println(numero);

        
       // numero = numero * -1;

       // System.out.println(numero);

        //int numero = 5;

        //numero++;//incremente +1 a variavel numero

        //System.out.println( ++ numero); //incremente tambem dentro do print
        // mesma regra para decremento porem usando ( numero -- )
        //System.out.println(numero);


        //boolean variavel = true;

        //System.out.println(!variavel);

        //variavel = !variavel;

        //System.out.println(variavel);


// operador ternario

        //int a, b;

       // a = 5;
        //b = 5;
       // String resultado = a==b ?"verdadeiro" : "falso";

       // if(a==b)
       //     resultado = "verdadeiro";
       // else
        //    resultado = "falso";

   // System.out.println(resultado);    

//relacionais

    //int numero1 = 1;
   // int numero2 = 2;
      
    //boolean simNao = numero1 == numero2;


    //System.out.println("numeroUm é igual a numeroDois? " + simNao);
    
    //simNao = numero1 != numero2;

    //System.out.println("numeroUm é diferente a numeroDois? " + simNao);

    //simNao = numero1 > numero2;

    //System.out.println("numeroUm é maior que numeroDois? " + simNao);

    
//operadores logicos

        boolean condicao1=true;

        boolean condicao2=true;

        if(condicao1 && (7 > 4)){
            System.out.println("as duas condições são verdadeiras");

        }

        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");

        }

        if(condicao1 || condicao2){
            System.out.println("uma das condições é verdadeiras");

        }

        System.out.println("fim");


    }
}
