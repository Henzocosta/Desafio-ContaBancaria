import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Todo: Conhecer e importar a classe Scanner
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        // Declarando as variaveis a ser usada
        String nome;
        String agencia;
        int numero;
        double saldo;
        // Exibir as mensagens para o usuario 
        System.out.println("Olá, Bem vindo ao terminal de atendimento Bancario!");
        System.out.println("Por favor para continuar o atendimento, Digite seu Nome: ");
        // Obter pela scanner os valores digitados no terminal
        nome = in.nextLine();
        System.out.println("Agora Digite o numero da sua agencia: ");
        // Obter pela scanner os valores digitados no terminal
        agencia = in.nextLine();
        System.out.println("Continuado seu atendimento, digite o numero da conta: ");
        // Obter pela scanner os valores digitados no terminal
        numero = in.nextInt();
        System.out.println("Saldo: ");
        // Obter pela scanner os valores digitados no terminal
        saldo = in.nextDouble();

       

        // Exibir a mensagem da conta criada
        
        System.out.println("Seu nome: " + nome + ", Ag: " + agencia + ", Numero: " + numero + ", Saldo Bancario: " + saldo + ".");

        in.close(); //Finalizado a classe scanner;
    }
}
