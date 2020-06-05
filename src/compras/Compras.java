/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compras;
import java.util.Scanner;
/**
 *
 * @author João Pedro Gambirasio da Rosa
 */
public class Compras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int cod1, cod2, cod3, cod4, codigo;
        
     Scanner ler = new Scanner(System.in);

            // Linhas de Codigos
            
        System.out.println("1 - À vista em dinheiro ou cheque, recebe 10% de desconto. \n2 - À vista no cartão de crédito, recebe 15% de desconto. \n3 - Em duas vezes, preço normal de etiqueta sem juros. \n4 - Em duas vezes, preço normal de etiqueta mais juros de 10%. \nQual a forma de pagameno desejada?");
        codigo = ler.nextInt();

        if (codigo > 0 && codigo <= 4) {

            if (codigo == 1) {
                System.out.println("você recebeu 10% de desconto!");
            }
            else if (codigo == 2) {
                System.out.println("você recebeu 15% de desconto!");
            }
            else if (codigo == 3) {
                System.out.println("você pagará em duas veses sem juros!");
            }
            else {
                System.out.println("você pagará em duas vese com 10% de juros.");
            }
        }
        else {
            System.out.println("Essa não é uma forma de pagamento valida.");
        }
    }
}