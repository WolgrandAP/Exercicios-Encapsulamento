package exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.print("Informe o nome do personagem: ");
        String nome = dados.nextLine();

        Personagem p = new Personagem(nome);

        System.out.println("-------------------");
        System.out.println("1-Sofrer dano \n2-Recuperar saúde \n3-Ganhar experiência \n0-Sair do jogo");
        System.out.println("-------------------");

        while (true) {
            System.out.print("Digite o comando: ");
            int com = dados.nextInt();
            if (com == 0) {
                System.out.println(p.status());
                System.out.println("Game over");
                break;
            } else if (com == 1) {
                p.sofrerDano();
                if (p.getPontosSaude()<=0) {
                    break;
                }
            } else if (com == 2) {
                p.recuperarSaude();
            } else if (com == 3) {
                p.ganharExperiencia();
            }
            System.out.println(p.status());
            System.out.println("_______________");
        }
    }
}
