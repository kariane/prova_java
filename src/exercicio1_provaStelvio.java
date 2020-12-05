/* Criar um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele
no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, calcular e
imprimir o total a receber no final do mês
Daniel Kudo && Kariane Coura BSI1°Semestre*/

import java.util.Scanner;
public class exercicio1_provaStelvio {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome=x.nextLine();
        System.out.print("Digite seu salário fixo: ");
        float safi=x.nextFloat();
        System.out.print("Total de vendas efutuadas no mês:");
        float vetotal=x.nextFloat();
        float per= (float) (vetotal*0.15);
        System.out.println("O seu salário total deste mês é: "+(safi+per));
    }
}
