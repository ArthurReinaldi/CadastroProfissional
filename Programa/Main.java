import java.util.Scanner;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa ps1 = novaPessoa(sc);
        System.out.println();
        ps1.exibir();

        Profissao pf1 = novaProfissao(sc);
        System.out.println();
        pf1.exibir();

        sc.close();
    }

    public static String lerNome(Scanner sc){   // Validação para o campo nome.
        String nome;

        while(true) {
            System.out.print("Digite o nome: ");
            nome = sc.nextLine();

            if (!nome.trim().isEmpty()) break;

            System.out.println("Error: [Campo Nome Vazio]");
        }

        return nome;
    }

    public static String lerEmail(Scanner sc){  // Validação para o campo email.
        String email;

        while(true) {
            System.out.print("Digite o email: ");
            email = sc.nextLine();

            if (email.contains("@") && email.contains(".")) break;

            System.out.println("Error: [Email Invalido]");
        }

        return email;
    }

    public static int lerDiaNasc(Scanner sc){   // Validação para o campo dia de nascimento.
        int diaNasc;

        while(true) {
            System.out.print("Digite o Dia do Nascimento: ");
            diaNasc = sc.nextInt();
            sc.nextLine();

            if (diaNasc > 0 && diaNasc < 32) break;

            System.out.println("Error: [Dia de Nascimento Invalida]");
        }

        return diaNasc;
    }

    public static int lerMesNasc(Scanner sc){   // Validação para o campo mês de nascimento.
        int mesNasc;

        while(true) {
            System.out.print("Digite o Mes do Nascimento: ");
            mesNasc = sc.nextInt();
            sc.nextLine();

            if (mesNasc > 0 && mesNasc < 13) break;

            System.out.println("Error: [Mes de Nascimento Invalida]");
        }

        return mesNasc;
    }

    public static int lerAnoNasc(Scanner sc){   // Validação para o campo ano de nascimento.
        int anoNasc, anoAtual;

        anoAtual = LocalDate.now().getYear();

        while(true) {
            System.out.print("Digite o Ano do Nascimento: ");
            anoNasc = sc.nextInt();
            sc.nextLine();

            if (anoNasc > anoAtual - 120 && anoNasc < anoAtual) break;

            System.out.println("Error: [Ano de Nascimento Invalida]");
        }

        return anoNasc;
    }

    public static Pessoa novaPessoa(Scanner sc){    // Método para criar uma nova pessoa, utilizando os métodos de validação.
        String nome, email;
        int diaNasc, mesNasc, anoNasc;

        nome = lerNome(sc);
        email = lerEmail(sc);
        diaNasc = lerDiaNasc(sc);
        mesNasc = lerMesNasc(sc);
        anoNasc = lerAnoNasc(sc);

        return new Pessoa(nome, email, diaNasc, mesNasc, anoNasc);
    }

    public static Profissao novaProfissao(Scanner sc){  // Método para criar uma nova pessoa com profissão, utilizando os métodos de validação.
        String nome, email, profissao, cargo;
        int diaNasc, mesNasc, anoNasc;

        nome = lerNome(sc);
        email = lerEmail(sc);
        diaNasc = lerDiaNasc(sc);
        mesNasc = lerMesNasc(sc);
        anoNasc = lerAnoNasc(sc);

        while(true){
            System.out.print("Digite a profissão: ");
            profissao = sc.nextLine();

            if (!profissao.trim().isEmpty()) break; // Validação para o campo profissão.

            System.out.println("Error: [Campo Profissão Vazio]");
        }

        while(true){
            System.out.print("Digite o cargo: ");
            cargo = sc.nextLine();

            if (!cargo.trim().isEmpty()) break; // Validação para o campo cargo.

            System.out.println("Error: [Campo Cargo Vazio]");
        }

        return new Profissao(nome, email, diaNasc, mesNasc, anoNasc, profissao, cargo);
    }
}