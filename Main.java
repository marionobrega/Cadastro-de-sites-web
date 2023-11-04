import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CadastroSites cadastro = new CadastroSites();
        Scanner scanner = new Scanner(System.in);

        cadastro.carregarSites();

        while (true) {
            System.out.println("1 - Adicionar Site");
            System.out.println("2 - Listar Sites");
            System.out.println("3 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();
                    System.out.print("URL: ");
                    String url = scanner.nextLine();
                    System.out.print("Data de Cadastro: ");
                    String dataCadastro = scanner.nextLine();

                    Site novoSite = new Site(descricao, url, dataCadastro);
                    cadastro.adicionarSite(novoSite);
                    break;
                case 2:
                    cadastro.listarSites();
                    break;
                case 3:
                    cadastro.salvarSites();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
