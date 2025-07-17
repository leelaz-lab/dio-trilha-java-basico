import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela Scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
        var scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta:");
        var conta = scanner.nextInt();
        System.out.println("Por favor, informe o número da Agência:");
        var agencia = scanner.next();
        System.out.println("Por favor, informe o nome do cliente:");
        var nome = scanner.next();
        System.out.println("Por favor, informe o saldo inicial da conta:");
        var saldo = scanner.nextFloat();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque!", nome,agencia,conta,saldo);
    }
}
