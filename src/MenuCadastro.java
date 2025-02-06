import java.util.ArrayList;
import java.util.Scanner;

public class MenuCadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> grupoMasculino = new ArrayList<>();
        ArrayList<String> grupoFeminino = new ArrayList<>();
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar");
            System.out.println("2. Ver Cadastros");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o sexo (M/F): ");
                    String sexo = scanner.nextLine();

                    if (sexo.equalsIgnoreCase("M")) {
                        grupoMasculino.add(nome);
                    } else if (sexo.equalsIgnoreCase("F")) {
                        grupoFeminino.add(nome);
                    } else {
                        System.out.println("Sexo inválido. Tente novamente.");
                    }
                    break;

                case 2:
                    System.out.println("Grupo Masculino: " + grupoMasculino);
                    System.out.println("Grupo Feminino: " + grupoFeminino);
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }
}
