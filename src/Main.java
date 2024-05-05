public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Cliente 1");

        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);

        cc.depositar(100);
        cc.transferir(cp, 100);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
