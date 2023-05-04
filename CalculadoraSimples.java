import java.util.Scanner;

import javax.swing.text.html.parser.Element;

public class CalculadoraSimples{

    public static void main(String[] args) {
        
    //Declração de variáveis
    int n1,n2, total, op;

    //Criação e instância objeto de entrada
    Scanner entrada = new Scanner(System.in);

    do{

        System.out.println("\n\t\t\t -- Calculadora Simples -- \n");

        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Divisão");
        System.out.println("4. Sair");

        
        System.out.print("Opção: ");
        op = entrada.nextInt();

        if(op == 1){
            System.out.println("\n\t\t\t -- Soma -- \n");
            
                //Entrada
                System.err.println("Informe n1");
                n1 = entrada.nextInt();
                System.err.println("Informe n2");
                n2 = entrada.nextInt();

                //Processamento
                total = n1+n2;

                //Saída
                System.err.printf("%d + %d = %d" , n1, n2, total);

        } else if ( op == 2){
            System.out.println("\n\t\t\t -- Subtração --\n");
            
                //Camilly
                //Entrada
                System.err.println("Informe n1");
                n1 = entrada.nextInt();
                System.err.println("Informe n2");
                n2 = entrada.nextInt();

                //Processamento
                total = n1-n2;

                //Saída
                System.err.printf("%d - %d = %d" , n1, n2, total);

         } else if ( op == 3){
                System.out.println("\n\t\t\t -- Divisão --\n");
                
                    //Camilly
                    //Entrada
                    System.err.println("Informe n1");
                    n1 = entrada.nextInt();
                    System.err.println("Informe n2");
                    n2 = entrada.nextInt();
    
                    //Processamento
                    total = n1/n2;
    
                    //Saída
                    System.out.printf("%d / %d = %d" , n1, n2, total);
    

        } else if (op == 4){
            System.out.println("Forte Abraço!");
        } else{
            System.out.println("Opção" + op + "Incorreta!");
        }


    }while (op != 4); 

    }



}