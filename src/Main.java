import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Computador maquina = new Computador();

        int escolha;
        do {
            System.out.print("""
                    ------- CADASTRO DE MÁQUINA -------
                    1) Cadastrar equipamento
                    2) Vizualizar equipamento cadastrado
                    3) Atualizar status do equipamento (em uso / disponível / manutenção)
                    4) Sair
                    >>>""");

            escolha = leitor.nextInt();
            leitor.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o modelo da máquina: ");
                    maquina.modelo = leitor.nextLine();

                    System.out.print("Digite o processador da máquina: ");
                    maquina.processador = leitor.nextLine();

                    System.out.print("Digite a quantidade de memória RAM da máquina: ");
                    maquina.memoriaRam = leitor.nextInt();
                    leitor.nextLine();

                    System.out.print("Digite o setor onde a máquina se encontra: ");
                    maquina.setor = leitor.nextLine();

                    System.out.print("Digite o status da máquina (em uso/disponível/manutenção): ");
                    maquina.status = leitor.nextLine();

                    break;
                case 2:
                    if (maquina.modelo != null) {
                        System.out.print("Modelo da máquina: " + maquina.modelo + System.lineSeparator()
                                + "Processador da máquina: " + maquina.processador + System.lineSeparator()
                                + "Quantidade de memória RAM da máquina: " + maquina.memoriaRam + System.lineSeparator()
                                + "Setor atual da máquina: " + maquina.setor + System.lineSeparator()
                                + "Status do equipamento: " + maquina.status);
                    } else {
                        System.out.println("Nenhuma máquina cadastrada.");
                    }

                    break;
                case 3:
                    if (maquina.modelo != null) {
                        System.out.print("Digite para que status você deseja colocar a máquina (em uso/disponível/manutenção): ");
                        maquina.status = leitor.nextLine();
                    } else {
                        System.out.println("Nenhuma máquina cadastrada.");
                    }

                    break;
                case 4:
                    break;
                default:
                    System.out.println("Escolha uma opção válida.");
                    break;
            }

        } while (escolha != 4);
    }
}
