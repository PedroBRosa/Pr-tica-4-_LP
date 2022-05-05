package Ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String item, autor, local, data, descricao;
        ItemPerdido ip = new ItemPerdido();
        ArrayList<ItemPerdido> itensPerdido = new ArrayList<ItemPerdido>();
        int menu = 0,i=0;
        Scanner ler = new Scanner(System.in);
        while (menu != 3) {
            System.out.println("=============         MENU        =============");
            System.out.println("1 - Cadastrar Item Perdido");
            System.out.println("2 - Buscar Item");
            System.out.println("3 - Sair");
            System.out.println("==============================================");
            System.out.println("==Por gentileza escolha uma opção de [1-4]: ==");
            System.out.println("==============================================");
            menu = ler.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Escreva o nome do item: ");
                    String.valueOf(itensPerdido.add(ip.setItem(ler.nextLine())));
                    System.out.println("Escreva o nome do autor: ");
                    autor =  ler.nextLine();
                    itensPerdido.set(i, autor);

                    System.out.println("Escreva o nome do local: ");
                    local =  ler.nextLine();
                    itensPerdido.set(i, local);

                    System.out.println("Escreva a data do cadastro: ");
                    data =  ler.nextLine();
                    itensPerdido.set(i, data);

                    System.out.println("Escreva uma descrição: ");
                    descricao =  ler.nextLine();
                    itensPerdido.set(i, descricao);
                    i++;
                    System.out.println(itensPerdido);
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("FIM !!");
                    break;
            }
        }
    }
}
