import model.Empresa;
import model.Cliente;
import controller.Transacao;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente("Joey", "12345678901", 1000);
        Empresa empresa = new Empresa("Tgid", "12345678901234", 10000);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Empresa: " + empresa.getNome());

        Transacao.deposito(cliente, empresa, 100);

        System.out.println("Saldo do cliente: " + cliente.getSaldo());

        Transacao.saque(cliente, empresa, 500);

        System.out.println("Saldo do cliente: " + cliente.getSaldo());
        System.out.println("Saldo da empresa: " + empresa.getSaldo());
    }
}
