//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Maria");

        Conta cc = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente1);

        cc.depositar(300);
        cc.imprimirExtrato();

        System.out.println("\nTentando sacar R$500...");
        cc.sacar(500); // Deve falhar

        System.out.println("\nTransferindo R$100 para a poupança...");
        cc.transferir(100, poupanca); // Deve funcionar

        System.out.println("\nTentando transferir R$300 para a poupança...");
        cc.transferir(300, poupanca); // Deve falhar

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}