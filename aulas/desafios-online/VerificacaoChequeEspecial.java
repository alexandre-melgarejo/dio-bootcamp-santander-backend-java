import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
      
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Informa o valor do saldo:");
            double saldo = scanner.nextDouble();
            System.out.println("Informa o valor do saque:");
            double saque = scanner.nextDouble();
    
            // Define um limite para o cheque especial
            double limiteChequeEspecial = 500;
    
            // Verifica se o saque ultrapassa o saldo disponível
            if (saque <= saldo) {
                System.out.println("Transacao realizada com sucesso.");
                // TODO: Imprimir "Transação realizada com sucesso."
            } else {
                if(saque <= (saldo + limiteChequeEspecial)) {
                  System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
                } else {
                  System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
                }
                // TODO: Verificar se o saque ultrapassa o limite do cheque especial
                // Em caso positivo, imprimir "Transacao realizada com sucesso utilizando o cheque especial."
                // Caso contrário, imprimir "Transacao nao realizada. Limite do cheque especial excedido."
            }
          
        }

        // scanner sera encerrado pelo try-with-resources
        // scanner.close(); 
    }
}