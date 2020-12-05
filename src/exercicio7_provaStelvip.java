/* Em uma eleição presidencial existem quatro candidatos. Os votos são informados por código. Os dados
utilizados para a apuração obedecem à seguinte codificação:
• 1, 2, 3, 4 = voto para os respectivos candidatos;
Daniel Kudo && Kariane Coura BSI1°Semestre*/
import java.util.Scanner;
public class exercicio7_provaStelvip {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int vo=7,v1=0,v2=0, v3=0, v4=0, v5=0, v6=0;
        while(vo>0){
        System.out.print("==Eleição presencial==\nVote 1 para o candidato 1\nVote 2 para o candidato"
                + " 2\nVote 3 para o candidato 3\nVote 4 para o candidato 4\nVote 5 para anular seu voto\n"
                + "Vote 6 para votar em branco");
        System.out.println("\nDigite o número correspondente ao seu voto:");
        vo=x.nextInt();
         if(vo==1){
                v1=v1+1;
                System.out.println("Você votou no candidato 1");
        }else if(vo==2){
                v2=v2+1;
                System.out.println("Você votou no candidato 2");
        } else if(vo==3){
                v3=v3+1;
                System.out.println("Você votou no candidato 3");
        }else if(vo==4){
                v4=v4+1;
                System.out.println("Você votou no candidato 4");
        }else if(vo==5){
                v5=v5+1;
                System.out.println("Você anulou seu voto"); 
        }else if(vo==6){
                v6=v6+1;
                System.out.println("Você votou em branco");
        }else if(vo==0){
                System.out.println("==Votação encerrada==");
         }
        }
        int so=v1+v2+v3+v4+v5+v6;
        int s1=so*100;
            System.out.println("==RESULTADO==");
            System.out.println("No total foram "+so);
            System.out.println("O candidato 1 recebeu "+ v1+ " voto(s) e a porcentagem de acordo com "
                    + "a votação foi de "+(v1*100/so)+"%");
            System.out.println("O candidato 2 recebeu "+ v2+ " voto(s) e a porcentagem de acordo com "
                    + "a votação foi de "+(v2*100/so)+"%");
            System.out.println("O candidato 3 recebeu "+ v3+ " voto(s) e a porcentagem de acordo com "
                    + "a votação foi de "+(v3*100/so)+"%");
            System.out.println("O candidato 4 recebeu "+ v4+ " voto(s) e a porcentagem de acordo com "
                    + "a votação foi de "+(v4*100/so)+"%");
            System.out.println("Teve "+ v5+" voto(s) nulo(s) e a porcentagem de acordo com "
                    + "a votação foi de "+(v5*100/so)+"%");
            System.out.println("Teve "+ v6+" voto(s) branco(s) e a porcentagem de acordo com "
                    + "a votação foi de "+(v6*100/so)+"&");
            
    }
}

