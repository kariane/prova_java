/*) Criar um programa que leia dois números L e R. O programa deve verificar a maior área entre um quadrado
de lado L e um círculo de raio R. Imprimir na tela qual o maior: "Quadrado" ou "Circulo".
Daniel Kudo && Kariane Coura BSI1°Semestre*/
import java.util.Scanner;
public class exercicio3_provaStelvio {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Digite o lado do quadrado:");
        float l=x.nextFloat();
        System.out.print("Digite o raio do circulo:");
        float r=x.nextFloat();
        double areaq=Math.pow(l, 2);
       double areac=Math.pow(r, 2)*3.14;
        if(areaq>areac){
            System.out.println("A área do quadrado é maior");
        }else{
            System.out.println("A área do circulo é maior");
        }
    }
  
}
