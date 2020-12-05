/*Criar um programa que leia 3 números reais A, B e C e ordene-os em ordem decrescente, de modo que o lado
A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base
nos seguintes casos, sempre escrevendo uma mensagem adequada:
Daniel Kudo && Kariane Coura BSI1°Semestre */
import java.util.Scanner;
public class exercicio5_provaStelvio {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        double mult;
        System.out.print("Digite um valor: ");
        int a=x.nextInt();
        System.out.print("Digite um segundo valor: ");
        int b=x.nextInt();
        System.out.println("Digite um terceiro valor: ");
        int c=x.nextInt();
         mult=Math.pow(b, 2)+Math.pow(c, 2);
        if(a>b&&a>c){
         if(a>=b+c){
                System.out.println("Não forma triângulo");  
         }else if(Math.pow(a, 2)==mult){
             System.out.println("Triângulo Retângulo");
         }else if(Math.pow(a, 2)<mult){
             System.out.println("Triângulo Acutângalo");
         }else if(Math.pow(a, 2)>mult){
             System.out.println("Triângulo Obtusângalo");
         }
        } if(a==b&&b==c){
            System.out.println("Triângulo Equilatero");
        } else if(a==b&&c!=b||b==c&&b!=a||c==a&&b!=c){
            System.out.println("Triângulo Isosceles");
        }}}

