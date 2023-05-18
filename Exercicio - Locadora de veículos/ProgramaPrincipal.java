import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação da locadora
        Locadora locadora = new Locadora("Minha Locadora", "Rua Principal, 123", "123456789");

        // Exemplo de cadastro de veículos
        Veiculo carroPopular = new CarroPopular("Fiat", "Uno", "ABC123", 2022, 100.0, 0, true);
        Veiculo suv = new SUV("Toyota", "RAV4", "XYZ789", 2021, 200.0, 500, 0, "4x4", "Gasolina");
        Veiculo carroLuxo = new CarroLuxo("Mercedes-Benz", "E-Class", "DEF456", 2023, 400.0, 8, 400, 0, true);
        locadora.cadastrarVeiculo(carroPopular);
        locadora.cadastrarVeiculo(suv);
        locadora.cadastrarVeiculo(carroLuxo);

        // Exemplo de cadastro de clientes
        PessoaFisica pessoaFisica = new PessoaFisica("João", "123456789", "Rua A, 456", "987654321");
        Empresa empresa = new Empresa("Empresa XYZ", "1234567890001", "Rua B, 789", null);
        locadora.cadastrarClientePessoaFisica(pessoaFisica);
        locadora.cadastrarClienteEmpresa(empresa);

        // Menu de interação com o usuário
        int opcao;
        do {
            System.out.println("==== MENU ====");
            System.out.println("1. Realizar empréstimo de veículo para pessoa física");
            System.out.println("2. Realizar empréstimo de veículo para empresa");
            System.out.println("3. Finalizar empréstimo de veículo para pessoa física");
            System.out.println("4. Finalizar empréstimo de veículo para empresa");
            System.out.println("0. Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    realizarEmprestimoPessoaFisica(locadora, pessoaFisica, scanner);
                    break;
                case 2:
                    realizarEmprestimoEmpresa(locadora, empresa, scanner);
                    break;
                case 3:
                    finalizarEmprestimoPessoaFisica(locadora, pessoaFisica, scanner);
                    break;
                case 4:
                    finalizarEmprestimoEmpresa(locadora, empresa, scanner);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }

    private static void realizarEmprestimoPessoaFisica(Locadora locadora, PessoaFisica pessoaFisica, Scanner scanner) {
        System.out.println("=== Realizar Empréstimo para Pessoa Física ===");
        System.out.print("Digite a placa do veículo desejado: ");
        String placa = scanner.next();
        try {
            Veiculo veiculo = locadora.buscarVeiculoPorPlaca(placa);
            locadora.realizarEmprestimoPessoaFisica(pessoaFisica, veiculo);
            System.out.println("Empréstimo realizado com sucesso.");
        } catch (EmprestimoException e) {
            System.out.println("Erro ao realizar empréstimo: " + e.getMessage());
        }
    }

    private static void realizarEmprestimoEmpresa(Locadora locadora, Empresa empresa, Scanner scanner) {
        System.out.println("=== Realizar Empréstimo para Empresa ===");
        System.out.print("Digite a placa do veículo desejado: ");
        String placa = scanner.next();
        try {
            Veiculo veiculo = locadora.buscarVeiculoPorPlaca(placa);
            locadora.realizarEmprestimoEmpresa(empresa, veiculo);
            System.out.println("Empréstimo realizado com sucesso.");
        } catch (EmprestimoException e) {
            System.out.println("Erro ao realizar empréstimo: " + e.getMessage());
        }
    }

    private static void finalizarEmprestimoPessoaFisica(Locadora locadora, PessoaFisica pessoaFisica, Scanner scanner) {
        System.out.println("=== Finalizar Empréstimo para Pessoa Física ===");
        try {
            locadora.finalizarEmprestimoPessoaFisica(pessoaFisica);
            System.out.println("Empréstimo finalizado com sucesso.");
        } catch (EmprestimoException e) {
            System.out.println("Erro ao finalizar empréstimo: " + e.getMessage());
        }
    }

    private static void finalizarEmprestimoEmpresa(Locadora locadora, Empresa empresa, Scanner scanner) {
        System.out.println("=== Finalizar Empréstimo para Empresa ===");
        System.out.print("Digite a placa do veículo a ser finalizado: ");
        String placa = scanner.next();
        try {
            Veiculo veiculo = locadora.buscarVeiculoPorPlaca(placa);
            locadora.finalizarEmprestimoEmpresa(empresa, veiculo);
            System.out.println("Empréstimo finalizado com sucesso.");
        } catch (EmprestimoException e) {
            System.out.println("Erro ao finalizar empréstimo: " + e.getMessage());
        }
    }
}
